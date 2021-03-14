# Getting Started

### About
- Spring Boot
- GraphQL
- Netflix DGS Framework for GraphQL

### Reference Documentation
For further reference, please consider the following sections:

* [Open Sourcing the Netflix Domain Graph Service Framework: GraphQL for Spring Boot](https://netflixtechblog.com/open-sourcing-the-netflix-domain-graph-service-framework-graphql-for-spring-boot-92b9dcecda18)
* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.3/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.4.3/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.4.3/reference/htmlsingle/#using-boot-devtools)

## How to test?

Go to [http://localhost:8080/graphiql](http://localhost:8080/graphiql) and look at schema

Query to post in GrpahQL
```graphql
query {
  shows {
    title
  }
}
```
