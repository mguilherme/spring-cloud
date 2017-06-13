## Spring Cloud
Example calling 2 endpoints, with and without registry server using [Eureka Server](http://cloud.spring.io/spring-cloud-netflix/spring-cloud-netflix.html).

* [Service 1](service1) - `/service1` endpoint with server registration.
* [Service 2](service2) - `/service2` endpoint without server registration.
* [Client](client) - `/service1` and `/service2` endpoints to call above services using Spring Cloud Feign (with and without url property).
* [Eureka Server](eureka-server) - Registry Server.
* [Spring Boot Admin](spring-boot-admin) - Spring Boot Admin.
* [Zipkin Server](zipkin-server) - Zipkin Server.
