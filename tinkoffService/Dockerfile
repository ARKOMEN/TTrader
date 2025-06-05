FROM openjdk:17-jdk-slim

WORKDIR /app

COPY src/main/java/org/ttrader/tinkoffService/TTrader-tinkoff-service.jar .

CMD ["java", "-jar", "TTrader-tinkoff-service.jar", "--spring.profiles.active=tinkoff-service"]

EXPOSE 8070
