# kafka-demo

Download kafka from here ( https://www.apache.org/dyn/closer.cgi?path=/kafka/3.1.0/kafka_2.13-3.1.0.tgz )

Copy the extracted  kafka_2.13-3.1.0 folder to your c:\ drive.

Follow these steps to intiate Kafka on your machine ( https://kafka.apache.org/quickstart )

For windows machine for these setps to run kafka server navigate to C:\kafka_2.13-3.1.0\bin\windows and execute below commands

 STARTING SERVERS
 
  .\zookeeper-server-start.bat C:\kafka_2.13-3.1.0\config\zookeeper.properties

  .\kafka-server-start.bat C:\kafka_2.13-3.1.0\config\server.properties

CREATE TOPIC

  .\kafka-topics.bat --create --topic quickstart-events --bootstrap-server localhost:9092

View Topic

  .\kafka-topics.bat --describe --topic quickstart-events --bootstrap-server localhost:9092

WRITE SOME EVENTS INTO THE TOPIC (Producer)

  .\kafka-console-producer.bat --topic quickstart-events --bootstrap-server localhost:9092

READ THE EVENTS (Consumer)

  .\kafka-console-consumer.bat --topic quickstart-events --from-beginning --bootstrap-server localhost:9092
