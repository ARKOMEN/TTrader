FROM openjdk:17-jdk-slim

WORKDIR /app

COPY src/main/java/org/ttrader/finnhubService/TTrader-finnhub-service.jar .

CMD ["java", "-jar", "TTrader-finnhub-service.jar", "--spring.profiles.active=finnhub-service"]

EXPOSE 8050
