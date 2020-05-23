# spring-boot-course

In this repo I put together some practice and information related to Spring Boot.

1. How to create RestAPIs.
2. Spring Boot properties.
3. Embedded tomcat server.
4. Logbak and Log4j. *
5. Spring Data JPA
6. Hibernate to generate Tables (ORM).
7. Thymeleaf for rendering views.

## General commands

- Create the `application-profile.properties` you need.
- on the CMD run `mvn spring-boot:run -Dspring.profiles.active=qa` *

## Notes and Take-aways

- Check the `application.yml`:
   - The app is running in `port: 9090` by default.
   - When you add  `spring.jpq.hibernate.dll-auto: update` it generates the tables for you!


### Useful tips to remove listed .gitignore files

If you want to delete files on your repo to clean it up, do:
```
git rm -r --cached .
git add .
git commit -m "Removing all files in .gitignore"
```

### Useful links for examples

- [Spring Boot MariaDB CRUD Example Tutorial](https://www.javaguides.net/2020/01/spring-boot-mariadb-crud-example-tutorial.html)

___

### By Gabriel Calvo Vargas

¿Do you want to get in touch? Let's do it [here](https://www.linkedin.com/in/gabriel-calvo-vargas-932b3357/)! 
