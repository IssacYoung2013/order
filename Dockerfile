FROM hub.c.163.com/library/java:8-alpine

MAINTAINER YWY issacyoung@msn.cn

ADD server/target/*.jar app.jar

EXPOSE 8091

ENTRYPOINT ["java", "-jar","/app.jar"]