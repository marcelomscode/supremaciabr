FROM maven:3.8.4-openjdk-17-slim AS builder

WORKDIR /app

COPY . /app

# Passa variáveis como argumentos para o Maven no build
ARG url_base_supremaciabr
ARG db_username
ARG db_password

RUN mvn clean package -DskipTests \
    -Durl_base_supremaciabr=${url_base_supremaciabr} \
    -Ddb_username=${username_supremaciabr} \
    -Ddb_password=${password_supremaciabr}

FROM openjdk:17-jdk-slim

COPY --from=builder /app/target/supremaciabr.jar /app/app.jar

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./unrandom", "-jar", "/app/app.jar"]
