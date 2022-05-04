FROM openjdk:14
COPY /target/dmatnet-spring-authentication-1.0.jar /usr/src/dmatnet-auth/dmatnet.jar
WORKDIR /usr/src/dmatnet-auth
ENTRYPOINT ["java", "-jar", "dmatnet.jar"]