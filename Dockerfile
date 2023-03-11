FROM openjdk:11
COPY ./target/Calculator-SPE-1.0-SNAPSHOT.jar ./
CMD ["java","-jar","Calculator-SPE-1.0-SNAPSHOT.jar"]
