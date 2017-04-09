FROM openjdk:latest
VOLUME /tmp
ADD image/phonebook-api.jar /opt/phonebook-api.jar
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /opt/phonebook-api.jar" ]
