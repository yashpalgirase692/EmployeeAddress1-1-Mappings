# EmployeeAddress1-1-Mappings
Employee and Address using one to one mapping is a Java application built using Maven and the SpringBoot framework.

## Table of Contents

- [Frameworks and Language Used](#frameworks-and-language-used)
- [Dataflow](#dataflow)
- [Data Structure](#data-structure)
- [Project Summary](#project-summary)

## Frameworks and Language Used

- Java: The primary programming language used for developing the application.
- Maven: A build automation tool and dependency management tool used for managing the project's dependencies and building the application.
- SpringBoot: A powerful and widely used framework for building Java-based enterprise applications. It provides features like inversion of control, dependency injection, and seamless integration with various other libraries.

## Dataflow
* Controller : I have to two controllers for Employee and Adresss respectively and in each I have created endpoint with crud operations.

* Service : Similary I have to two service classes for Employee and Adresss respectively and here I have all my logic and also called crud repo method of jpa for crud operations.

* Repository : Basically repository is an interface which is extending CrudRepository of JPA. It is used to to do crud operations on DB. I have to repos for each Employee and address.

* DataBase Design : I have used MYSQL as my data base in I have used my sql connector and in applications.properties I have all details about data authentication and which database I am using.

## Data Structure

I have used MYSQL as an database to store my data in persistant way.

## Project Summary

I have created this project to store employees and their addresses but in this project I have used mappings that is one to one mapping so now I can do cross functionlities with my enties.
