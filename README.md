# Thymeleaf-Demo

#how to use Thymeleaf with Spring

Thymeleaf is a Java-based library used to create a web application.
Thymeleaf is a Java template engine for processing and creating HTML, XML, JavaScript, CSS, and text

Maven uses following depencey
<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-thymeleaf</artifactId>
</dependency>

src/main/resource-
-template :we use this folder to store html files

${}  it will take data from controller

Th:Object{} :$() :-we can associate with model objects.
Th:field="*()": we declare which field we have to bind from the object.
@ModelAttribute :Spring MVC will take the information from incoming requests from html form.This annotation creates automatic for us.

Th:action=@{/}: we map url to the controller.



