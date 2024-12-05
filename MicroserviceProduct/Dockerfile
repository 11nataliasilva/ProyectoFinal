FROM openjdk:17
WORKDIR /app
COPY ./target/MicroserviceProduct-1.0.0.jar product.jar
EXPOSE 8085
ENTRYPOINT [ "java","-jar","product.jar" ]