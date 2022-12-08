FROM openjdk:17-jdk-alpine
COPY /target/dmatnet-spring-authentication-1.0.jar /usr/src/dmatnet-auth/dmatnet.jar
WORKDIR /usr/src/dmatnet-auth
EXPOSE 8080
ENV SPRING-DB-SRC="jdbc:mysql://10.0.0.103:3306/dbauthentication" \
    SPRING-DB-USER="root" \
    SPRING-DB-PWD="Tgb68789475" \
    SPRING-EUREKA-URL="http://10.0.0.103:8761/eureka/"
ENTRYPOINT ["java", "-Dspring.profiles.active=prod", "-jar", "dmatnet.jar"]
