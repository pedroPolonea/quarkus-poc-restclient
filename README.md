# quarkus-poc-restclient

### Executar aplicação
./mvnw compile quarkus:dev -Ddebug=5007 -Dsuspend=false


### Adicionando bibliotecas via terminal

| Bibliotecas        | Comando           |
| ------------- |:-------------:|
|Hibernate ORM with Panache|./mvnw quarkus:add-extension -Dextensions="io.quarkus:quarkus-hibernate-orm-panache"|
|RESTEasy JSON-B|./mvnw quarkus:add-extension -Dextensions="io.quarkus:quarkus-resteasy-jsonb"|
|SmallRye OpenAPI|./mvnw quarkus:add-extension -Dextensions="io.quarkus:quarkus-smallrye-openapi"|
|JDBC Driver - MySQL|./mvnw quarkus:add-extension -Dextensions="io.quarkus:quarkus-jdbc-mysql"|
|SmallRye Health|./mvnw quarkus:add-extension -Dextensions="io.quarkus:quarkus-smallrye-health"|
|SmallRye OpenTracing|./mvnw quarkus:add-extension -Dextensions="io.quarkus:quarkus-smallrye-opentracing"|
|REST Client|./mvnw quarkus:add-extension -Dextensions="io.quarkus:quarkus-rest-client"|
|Flyway|./mvnw quarkus:add-extension -Dextensions="io.quarkus:quarkus-flyway"|
|Lombok|-|


### Acessando o OpenAPI - Swagger
O OpenAPI Specification(anteriormente Swagger Specification) é um formato de descrição de API para APIs RES, conforme o [site oficial](https://swagger.io/docs/specification/about/).

    http://localhost:9000/swagger-ui/

