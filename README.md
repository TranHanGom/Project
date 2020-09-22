# MOR Training Exercise - Spring Boot
## Exercise 2 - Authorization
#### Description:
Create a website that have the following functions:  
+ Login with username / password  
+ Register new account with role "user"  
+ Login as "user", display "user" information:
    - *Username*
    - *Lastname*
    - *Firstname*
    - *Role*
    - *Age*
    - *DayOfBirth*
    - *Email*
+ Login as "admin", display "user" list:
    - *Username*
    - *Lastname*
    - *Firstname*
    - *Role*
    - *Age*
    - *DayOfBirth*
    - *Email*
    - *DayOfRegistration*  
    
#### Requirements:
**Backend :** JAVA 8, Spring Boot  
**Frontend:** HTML, Javascript and any Library that the trainee choose to use  
**DB      :** Postgresql  
**Note :**  
Build front-end source and back-end source on different server, using RESTFUL HTTP Request for communication.  
**Hint:**  
Use SpringSecurity OAuth2 for authorization.  
Understanding HTTP RESTFUL Request, differ between @Controller and @RestController  
