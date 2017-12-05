if [ ! -f "linux_messages_3000lines.txt" ]
then
	if $( !  hadoop fs -test -e "/tasks/module3/flume/input/linux_messages_3000lines.txt"); then
     		echo "linux_messages_3000lines.txt directory doesn't exists."
    		exit 1;
     		hadoop dfs -copyToLocal /tasks/module3/flume/input/linux_messages_3000lines.txt .
	fi
fi

if [ -f "output.txt" ]
then
	rm -f output.txt
	touch output.txt
else
	touch output.txt
fi

flume-ng agent -c conf -f conf/log_flume.conf -n agent1

cat linux_messages_3000lines.txt | while read line ; do echo "$line" ; sleep 0.2 ; done > output.txt