FROM gradle:8.11-jdk21 AS build
WORKDIR /app
COPY . .
RUN ./gradlew build

