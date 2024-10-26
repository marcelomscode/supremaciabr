FROM maven:3.8.4-openjdk-17-slim AS build

WORKDIR /app

COPY . /app

ENV url_base_supremaciabr=$url_base_supremaciabr
ENV username_supremaciabr=$username_supremaciabr
ENV password_supremaciabr=$password_supremaciabr

RUN mvn package

FROM openjdk:17-jdk-slim

COPY --from=build /app/target/*.jar /app/app.jar

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./unrandom", "-jar", "/app/app.jar"]
