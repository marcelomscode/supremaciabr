FROM maven:3.8.4-openjdk-17-slim AS build

WORKDIR /app

COPY . /app

RUN mvn package

FROM openjdk:17-jdk-slim

COPY --from=build /app/target/*.jar /app/app.jar

ENV SERVER-PORT=8025
ENV PASSWORD-SUPREMACIABR=EWT6AqV-^8i&8E@{
ENV URL-BASE-SUPREMACIABR=jdbc:mysql://181.215.134.102:3306/supremaciabr?createDatabaseIfNotExist=true&SSL=false&Timezone=true&serverTimezone=UTC
ENV USERNAME-SUPREMACIABR=supremaciabr

ENV host-redis=164.92.115.109
ENV senha-redis=teste@teste

ENV rabbitmq-host=164.92.115.109
ENV rabbitmq-user=admin
ENV rabbit-password=HB8PtGs8

ENV email-host=smtp.hostinger.com
ENV email-porta=587
ENV email-usuario=marcelo@marcelomscode.com.br
ENV email-senha=o'8M;c'yrM{AuZtA


ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./unrandom", "-jar", "/app/app.jar"]
