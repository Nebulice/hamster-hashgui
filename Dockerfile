FROM gradle:8.11-jdk21 AS build
WORKDIR /app
COPY . .
RUN ./gradlew build

# Output directory
ARG OUTDIR=/Build/Plugin/Hamster-Hashgui

RUN mkdir -p ${OUTDIR} && cp build_plugin/HashGui-*.jar ${OUTDIR}/Hamster-Hashgui.jar
