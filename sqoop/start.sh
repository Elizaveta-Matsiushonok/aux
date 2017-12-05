is_recreate=0
is_delete=0

echo "hadoop" > .password
chmod o+rw ./.password

while [ -n "$1" ]
do
case "$1" in
-r) is_recreate=1
echo "Recreation mode turned on: database will be droped and created again.";;
-d) is_delete=1
echo "Database and all tables will be deleted.";;
--) shift
break ;;
*) echo "$1 is not an option";;
esac
shift
done
if $( ! hadoop fs -test -d "/tasks/module3/sqoop/input"); then
	echo "$1 directory doesn't exists."
	exit 1;
fi
if [ $is_delete -eq 1 ]
then
mysql -u root -phadoop -D weather_data -e "DROP DATABASE IF EXISTS weather_data"
echo "Database was deleted".
exit 1;
fi
if [ $is_recreate -eq 1 ]
then

echo "Starting creating datadase..."

mysql -u root -phadoop < createdb.sql
sqoop export --connect jdbc:mysql://localhost/weather_data  --username root --password hadoop  --table weather -staging-table weather_stage -clear-staging-table -export-dir /tasks/module3/sqoop/input  
fi

mysql -u root -phadoop < queries.sql