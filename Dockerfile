FROM eclipse-temurin:20
VOLUME /tmp
COPY ./controller/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]