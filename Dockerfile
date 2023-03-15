FROM openjdk:11
COPY ./target/Calculator-SPE-1.0-SNAPSHOT-shaded.jar ./
CMD ["java","-jar","Calculator-SPE-1.0-SNAPSHOT-shaded.jar"]
