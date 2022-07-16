FROM openjdk:11
ADD target/kafka-consumer.jar kafka-consumer.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","kafka-consumer.jar"]