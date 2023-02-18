FROM adoptopenjdk/openjdk11:latest

RUN mkdir /opt/app

COPY ./build/libs/company.jar /opt/app/

CMD ["java", "-jar", "/opt/app/company.jar"]