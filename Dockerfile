FROM openjdk:8-alpine	
EXPOSE 8082
ADD target/bankapp.jar bankapp.jar
ENTRYPOINT ["java","-jar","/bankapp.jar"]