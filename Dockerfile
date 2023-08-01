FROM openjdk:17
VOLUME /tmp
EXPOSE 8081
ADD ./target/clientSystem-0.0.1-SNAPSHOT.jar cls.jar
ENTRYPOINT ["java", "-jar", "/cls.jar"]