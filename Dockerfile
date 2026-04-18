FROM gradle:8.7.0-jdk21 AS build
WORKDIR /app
COPY . .
RUN gradle buildPlugin --no-daemon

FROM eclipse-temurin:21-jre
WORKDIR /plugin
COPY --from=build /app/build_plugin/libs/*.jar ./
RUN mkdir -p /Build/Plugin/Hamster-Hashgui && cp ./*.jar /Build/Plugin/Hamster-Hashgui/
CMD ["java", "-jar", "./$(ls *.jar | head -n1)"]