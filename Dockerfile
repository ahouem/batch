FROM openjdk:8
EXPOSE 9091
ADD target/batch-intertrans.jar batch-intertrans.jar
ENTRYPOINT ["java","-jar","/batch-intertrans.jar"]