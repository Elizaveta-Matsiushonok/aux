package com.epam.producer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class FibonacciProducer {
    public static void main(String[] args) throws Exception{

        Properties props = new Properties();

        props.put("bootstrap.servers", "localhost:9092");

        props.put("acks", "all");

        props.put("retries", 0);

        props.put("batch.size", 16384);

        props.put("linger.ms", 1);

        props.put("buffer.memory", 33554432);

        props.put("key.serializer",
                "org.apache.kafka.common.serialization.StringSerializer");

        props.put("value.serializer",
                "org.apache.kafka.common.serialization.StringSerializer");

        Producer<String, String> producer = new KafkaProducer<String, String>(props);

        System.out.println("regcl ----------------------");
        for(int i = 0; i < 10; i++)
            producer.send(new ProducerRecord<String, String>("page_visits", Integer.toString(i)));
        System.out.println("Message sent successfully");
        producer.close();
    }
}
