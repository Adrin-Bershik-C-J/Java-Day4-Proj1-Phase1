# Java-Day4-Proj1-Phase1

## 📌 Project Overview

This is a simple Java project that demonstrates **exception handling**, **OOP principles**, and **modular code structure** using packages. It simulates a basic user registration system with an age validation rule.

---

## 📁 Project Structure

Directory structure:
└── adrin-bershik-c-j-java-day4-proj1-phase1/
├── pom.xml
└── src/
├── main/
│ └── java/
│ ├── com/
│ │ └── day4proj1phase1/
│ │ └── App.java
│ ├── exceptions/
│ │ └── InvalidAgeException.java
│ ├── main/
│ │ └── Main.java
│ ├── models/
│ │ └── User.java
│ └── services/
│ └── UserService.java
└── test/
└── java/
└── com/
└── day4proj1phase1/
└── AppTest.java

---

## 🔍 Module Description

### `models/User.java`

Defines a `User` class with basic attributes: `userName` and `age`, and their getters.

### `exceptions/InvalidAgeException.java`

Custom checked exception thrown when a user under 18 attempts to register.

### `services/UserService.java`

Contains business logic to register a user. Throws `InvalidAgeException` if the user is below 18 years of age.

### `main/Main.java`

Entry point of the program. Creates users and attempts to register them via `UserService`, demonstrating exception handling.

---

## ✅ Features Demonstrated

- Java OOP concepts
- Custom exception handling
- Clean package-based architecture
- Simple service-based design

---

## 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/Adrin-Bershik-C-J/Java-Day4-Proj1-Phase1.git
   cd Java-Day4-Proj1-Phase1
   ```

```

```
