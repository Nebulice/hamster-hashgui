FROM gradle:8.7.0-jdk21 AS build
WORKDIR /app
COPY . .
RUN gradle buildPlugin

# Output directory
ARG OUTDIR=/Build/Plugin/Hamster-Hashgui

RUN mkdir -p ${OUTDIR} && cp build_plugin/Hashgui-*.jar ${OUTDIR}/Hamster-Hashgui.jar
