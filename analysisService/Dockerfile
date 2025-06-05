FROM openjdk:17-jdk-slim

WORKDIR /app

COPY src/main/java/org/ttrader/analysisService/TTrader-analysis-service.jar .

CMD ["java", "-jar", "TTrader-analysis-service.jar", "--spring.profiles.active=analysis-service"]

EXPOSE 8080
