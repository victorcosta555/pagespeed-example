FROM adoptopenjdk/openjdk11

VOLUME /tmp
COPY target/*.jar pagespeed-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/pagespeed-0.0.1-SNAPSHOT.jar"]