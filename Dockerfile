FROM openjdk:12 
VOLUME /tmp
EXPOSE 8888
ADD ./target/ProyectoNoticias-0.0.1-SNAPSHOT.jar notis.jar
ENTRYPOINT ["java", "-jar", "/notis.jar" ]