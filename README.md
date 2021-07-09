# ⚽️football-tickets-app

This is RESTfull web application for buying tickets on footballs matches. Also, you can enter like admin and have permission for managing all application, for example adding or deleting new matches.

## **⚡️ Quick start**
- Clone this project into your local folder and open the project in an IDE.
- Configure Tomcat Server.
- Configure MySQL RDBMS.
- Setup new connection with DB in db.properties:
```bash
    db.url=YOUR URL
    - URL must be like : jdbc:mysql://xxxx:yyyy/kkkk?serverTimezone=UTC , where:
        - xxxx - host name,
        - yyyy - port,
        - kkkk - database name
    db.driver=YOUR DRIVER
    - Driver for example : com.mysql.jdbc.Driver
    db.user=YOUR USERNAME
    db.password=YOUR PASSWORD
```
- Run a project.
- LogIn as user or admin(Logins : user@i.ua, admin@i.ua. Passwords : user123, admin 123).

## **📜  Functionality**
- ### Unauthorized user
    - Login
    - Registration
- ### User
    - See your order
    - Complete order
    - Add to your shopping cart ticket on match
    - See your shopping cart
- ### Admin
    - Add new stadium
    - Add new game
    - Add, update or delete new game session
    - Find user by email
- ### User and Admin
    - See all available game session in current date
    - See all games
    - See all stadium

## **⚙️Project Structure**
- The project has an N-tier structure and consists of the database layer, the DAO layer for interaction with the database, the service layer which contains the business logic, and the presentation layer.
- In project implemented MVC structure.
- The DAO layer is built with Hibernate framework.
- The project is built with Spring framework, so its implements Dependency Injection and IoC principal.
- For implementation MVC structure in project is used DTOs and Controllers which is built with Spring MVC Web module.
- Authentication is implemented with Spring security.

### **🦾 Technologies used**
- Java 
- Spring (MVC, Security, Web)
- Hibernate, RDBMS MySQL
- Apache Tomcat, Apache Maven