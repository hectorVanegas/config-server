# Spring Cloud with Eureka
This project is a simple demonstration of a microservices architecture using Spring Cloud and Netflix's Eureka for service discovery.

## Key Concepts and Annotations
This project uses a number of Spring Framework features and annotations. Here's a brief explanation of each:

### Spring Framework and Java Features
| Feature | Description |
| --- | --- |
| **Spring Web** | Provides common web-specific utilities for both Servlet and Portlet environments. |
| **Spring Dev Tools** | Provides automatic restart for easier development. |
| **Spring Data JPA** | Simplifies the implementation of data access layers by providing a platform to implement domain-driven design repositories. |
| **PostgreSQL Driver** | JDBC driver that allows Java programs to connect to a PostgreSQL database using standard, database independent Java code. |
| **Java Generics** | Generics in Java provide a way to create classes, interfaces, and methods that operate with types as parameters. They allow you to design reusable code that can work with different types while providing compile-time type safety. |
| **Advantages Generics** | - Type Safety: Generics enable early detection of type mismatches at compile time, preventing type-related errors at runtime. - Code Reusability: With generics, you can write classes and methods that can be used with different data types, reducing the need for duplicate code. - Elimination of Type Casting: Generics eliminate the need for explicit type casting by handling type conversions implicitly. - Compile-Time Checking: Any violations of the type constraints specified by generics are caught by the compiler, ensuring more robust and error-free code. - Clarity and Readability: Code using generics tends to be clearer and more readable as it expresses intentions and constraints explicitly. |
| **Use Cases Generics** | - Collections Framework: The Java Collections Framework (e.g., ArrayList, HashMap) extensively utilizes generics to provide type-safe collections. - Custom Data Structures: Generics are used to create custom data structures (e.g., stacks, queues) that can operate on any data type. - Utility Classes: Generic utility classes and methods (e.g., Collections.sort) can be written to operate on different types of objects. - Design Patterns: Generics facilitate the implementation of design patterns such as the Factory Pattern or the Observer Pattern by allowing flexibility with object types. |

### Annotations
| Annotation | Description |
| --- | --- |
| **@Data** | A Lombok annotation to generate getters, setters, equals, hashCode and toString methods. |
| **@NoArgsConstructor** | A Lombok annotation to generate a constructor with no parameters. |
| **@AllArgsConstructor** | A Lombok annotation to generate a constructor with one parameter for each field. |
| **@Entity** | Specifies that the class is an entity and is mapped to a database table. |
| **@Table** | Specifies the primary table for the annotated entity. |
| **@Id** | Specifies the primary key of an entity. |
| **@GeneratedValue** | Provides for the specification of generation strategies for the values of primary keys. |
| **@GeneratedValue(strategy = GenerationType.IDENTITY)** | Specifies that the primary key generation is to be done by the persistence provider at the time of insert. |
| **@Column** | Specifies a mapped column for a persistent property or field. |
| **@Temporal** | Specifies the type to be used in mapping a java.util.Date or java.util.Calendar. |
| **@Temporal(TemporalType.TIMESTAMP)** | Specifies that a persistent date or time field should be persisted as a timestamp in the database. |
| **@PrePersist** | Specifies a callback method for the corresponding lifecycle event. |
| **@Service** | Indicates that an annotated class is a "Service". |
| **@Transactional** | Describes transaction attributes on a method or class. |
| **@Transactional(readOnly = true)** | Spring annotation that sets the `readOnly` attribute of a transaction to `true`. |
| **@RestController** | A convenience annotation that is itself annotated with @Controller and @ResponseBody. |
| **Optional** | A container object which may or may not contain a non-null value. |
| **@PathVariable** | Indicates that a method parameter should be bound to a URI template variable. |
| **@RequestMapping** | Annotation for mapping web requests onto methods in request-handling classes. |
| **ResponseEntity<?>** | Represents the entire HTTP response. Good for returning file downloads. |
| **spring.application.name=MicroservicioGateway** | This property sets the name of the application. It is used by Spring Cloud for service discovery and other tasks. |
| **server.port=8090** | This property sets the port on which the server will listen for requests.|
| **Fetch=FetchType.LAZY** | Indicates how the associated Student type objects are retrieved when the list is accessed. Set to LAZY, where Student objects will not be loaded immediately when the list is accessed. They will be loaded only when explicitly accessed.|

### Spring Cloud Eureka
| Concept | Description |
| --- | --- |
| **Eureka Server** | Service registry for resilient mid-tier load balancing and failover. |
| **@EnableEurekaServer** | Annotation to start a Eureka Server. |
| **@EnableDiscoveryClient** | Annotation to make your Spring Boot application act as a Eureka client. |
| **eureka.client.serviceUrl.defaultZone=http://localhost:8761/eureka** | This property specifies the URL of the Eureka server for service discovery. |

### Spring Cloud Gateway
| Concept | Description |
| --- | --- |
| **spring.cloud.gateway.mvc.routes[0].id=microservicio-usuarios** | This property sets the ID of the first route in the Gateway. |
| **spring.cloud.gateway.mvc.routes[0].uri=lb://microservicio-usuarios** | This property sets the URI of the service where the requests will be forwarded. The `lb` scheme indicates that the load balancer will be used. |
| **spring.cloud.gateway.mvc.routes[0].predicates=Path=/api/alumno/** | This property defines the path for which the route is valid. Any request matching this path will be forwarded to the service specified in the `uri` property. |
| **spring.cloud.gateway.mvc.routes[0].filters=StripPrefix=2** | This property defines a filter that will strip the first two segments of the path before forwarding the request to the service. |

## Getting Started
### Prerequisites
- Java 8 or later
- Maven
- Spring Boot

### Installation
1. Clone the repository
```bash
git clone https://github.com/SebasDosman/spring_cloud_api.git
```

2. Navigate to the project directory
```bash
cd MicroservicioCursos
cd MicroservicioEureka
cd MicroservicioExamenes
cd MiroservicioGateway
cd MicroservicioUsuarios
```

3. Build the project
```bash
mvn clean install
```

### Usage
Start the Eureka server first, and then start the other services. They will automatically register themselves with the Eureka server.

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.
