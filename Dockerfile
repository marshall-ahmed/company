FROM adoptopenjdk/openjdk11:ubi

VOLUME /tmp

COPY build/libs/*.jar company-service.jar

EXPOSE 80

ENV JAVA_OPTS=""

ENTRYPOINT ["java","-jar","/company-service.jar"]