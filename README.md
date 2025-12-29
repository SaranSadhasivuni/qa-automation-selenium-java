# QA Automation Framework – Selenium | TestNG | Maven



## Project Overview

This project is a scalable QA Automation framework built using Java, Selenium WebDriver, TestNG, and Maven.  

It supports UI automation, API automation, data-driven testing, reporting, and failure analysis.



The framework follows industry best practices such as Page Object Model (POM), reusable utilities, and TestNG listeners.



---



## Tech Stack

- Java 22

- Selenium WebDriver

- TestNG

- Maven

- RestAssured (API Testing)

- Extent Reports

- Git & GitHub



---



## Framework Design

- **Page Object Model (POM)** for UI separation

- **BaseTest** for centralized WebDriver setup

- **Explicit Wait utilities** to avoid flaky tests

- **DataProviders** for data-driven testing

- **TestNG Listeners** for screenshots and reporting

- **API automation** integrated into the same test suite



---



## Project Structure

src

├── main

│ └── java

│ ├── base

│ ├── config

│ ├── pages

│ ├── utils

│ └── api

└── test

└── java

├── tests

├── dataproviders

└── listeners





---



## Test Coverage

### UI Tests

- Login validation (positive & negative scenarios)

- Page-level validations using POM



### API Tests

- GET user details

- POST create user

- Status code and response validation



---



## How to Run Tests

```bash

mvn clean test

```

Reports & Screenshots

- Extent Reports generated under /reports

- Screenshots captured automatically on test failure

CI Ready

This framework is Maven-based and can be easily integrated with Jenkins or other CI tools.


