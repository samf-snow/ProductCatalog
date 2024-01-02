FROM openjdk:17-oracle
ADD ./target/ProductCatalog-0.0.1.jar ProductCatalog-0.0.1.jar
ENTRYPOINT ["java","-jar","/ProductCatalog-0.0.1.jar"]