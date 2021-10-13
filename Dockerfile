FROM openjdk:11
RUN addgroup --system dev && adduser --system dev
USER dev:dev
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
EXPOSE 8080