# ngoDonation
Summitworks Java Training Project

## July 25th 4:30 update
1. Add routing according to flow diagram in existing thymeleaf pages [check]
2. Manage exceptions and translate them into proper html codes
>  * https://www.baeldung.com/spring-boot-custom-error-page
>> Add error.html [check: unknown /random reroutes here]
>  * ControllerAdvice and ExceptionHandler in Spring ? [not yet]
>  * https://thepracticaldeveloper.com/custom-error-handling-rest-controllers-spring-boot/
>  * look into session 16 in Others tab: springboot-crud-rest-api-validation.rar
4. Security with Spring Boot using JWT and Data JPA 
>  * Continuation from our JWT example
>  * https://www.javainuse.com/spring/boot-jwt-mysql [got JWT+JPA example working]
>  * created new github branch jwt, as we will break whatever is working so far
5. Jenkins build [running, but manual deployment for now]
>  * requires JAVA 11 JDK connection. It was installed in ubuntu server using apt.
>  * but may require $JAVA_HOME parameter to be set

* Amazon EC2 tomcat is running last Friday build
* Add Maruthi to github, don't make it public yet. (has RDS database id and password)
