# Drege
I don't remember why this title, but it makes a bunch of sense.

# Description
## Purpose
Be a bridge between a user and database of words.

## Why I built it?
This application needs to store english words I learned in Database.
Then, client interacts with them (see API endpoints.xlsx file to take a look to endpoints). Basically, client saves new words/word and gets one random (to recall the translation).<br>
Everyone can use it, because nobody knows what language you are speaking on.

## Technologies
* [Spring framework](https://spring.io/) - because java

### Spring dependencies
* starter test - future tests
* postgresql - interaction with Postgres database
* starter web - build a web application
* starter data jpa - bridge between application and database

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-test</artifactId>
    <scope>test</scope>
</dependency>

<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <scope>runtime</scope>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
```
