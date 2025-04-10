# 📓 Journal App

A simple RESTful API built with Spring Boot that allows users to manage journal entries with fields like `id`, `title`, and `content`.

---

## 🚀 Tech Stack

- Java 17+
- Spring Boot 3.x
- Maven

*(MongoDB integration may be added later)*

---

## 📚 Features

- Create a new journal entry
- Read existing entries
- Update an entry
- Delete an entry

Supports full CRUD functionality via REST endpoints.

---

## 📁 Project Structure

├── src/ │ └── main/ │ ├── java/ │ │ └── com/yourpackage/journal/ │ └── resources/ ├── pom.xml ├── mvnw / mvnw.cmd └── .gitignore

yaml
Copy
Edit

---

## 🔧 How to Run

You can run the project using either:

### ✅ Using Command Line
```bash
./mvnw spring-boot:run
✅ Using IDE (IntelliJ, VSCode, etc.)
Import as a Maven project

Run the main class (typically JournalAppApplication.java)

No database setup required for now.