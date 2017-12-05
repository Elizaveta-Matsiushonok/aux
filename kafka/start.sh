jarpath="target/fibonacci-numbers.jar"
while [ "$#" -gt 0 ]
do
        case "$1" in
        -p)
                shift
                echo "Runing job with packaging a new jar."
		time mvn package -Dmaven.test.skip=true 2>mvn_package.stderr >mvn_package.stdout
                ;;
         *)
                echo "Unknown argument '$1'" >&2
                exit 1
                ;;
        esac
shift
done
if [ ! -e "$jarpath" ]; then
	echo "There is no jar for this application. Try to use -p option"
	exit 1;
fi

# /usr/hdp/2.6.0.3-8/kafka/bin/zookeeper-server-start.sh /usr/hdp/2.6.0.3-8/etc/kafka/conf.default/zookeeper.properties

# /usr/hdp/2.6.0.3-8/kafka/bin/kafka-server-start.sh /usr/hdp/2.6.0.3-8/etc/kafka/conf.default/server.properties

# /usr/hdp/2.6.0.3-8/kafka/bin/kafka-topics.sh --zookeeper localhost:2181 —topic test —from-beginning
/usr/hdp/2.6.0.3-8/kafka/bin/kafka-console-consumer.sh --zookeeper localhost:2181 —topic test —from-beginning
cd target
java -cp fibonacci-numbers-jar-with-dependencies.jar  com.epam.producer.FibonacciProducer