FROM maven:3.8.4-openjdk-17-slim AS build

WORKDIR /app

COPY . /app

# Passa variáveis como argumentos para o Maven no build
ARG url_base_supremaciabr

RUN mvn clean package -DskipTests -Durl_base_supremaciabr=${url_base_supremaciabr}

FROM openjdk:17-jdk-slim

COPY --from=builder /app/target/*.jar /app/

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./unrandom", "-jar", "/app/app.jar"]
