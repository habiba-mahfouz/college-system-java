# College Management System (Java) 🏛️

A professional, object-oriented Java application designed to manage college data, including students, instructors, and course registrations. This project demonstrates core OOP principles such as **Inheritance**, **Polymorphism**, **Encapsulation**, and **Abstraction**.

## ✨ Features

-   **Comprehensive Data Model**: Manages Students, Instructors, and Courses using a robust inheritance structure.
-   **Course Registration**: Link students to courses and assign instructors to teach specific modules.
-   **Input Validation**: Ensures data integrity (e.g., GPA range checks, ID verification).
-   **Robust Error Handling**: Handles invalid user inputs and processing errors gracefully without crashing the application.
-   **Search Functionality**: Quickly find students or instructors by their unique IDs.
-   **Professional CLI**: A clean and organized command-line interface for easy interaction.

## 🧠 OOP Concepts Implemented

-   **Abstraction**: Uses an `abstract class Person` as a template for all individuals in the system.
-   **Inheritance**: `Student` and `Instructor` inherit common attributes from `Person`.
-   **Encapsulation**: Fields are kept private/protected with controlled access through Getters and Setters.
-   **Polymorphism**: Overriding the `display()` method to provide class-specific information display.

## 📂 Project Structure

```text
src/college_system/
├── Main.java               # Main entry point and CLI controller
├── College_system.java      # Core system logic and data storage
├── Person.java             # Abstract base class for individuals
├── Student.java            # Student data model and logic
├── Instructor.java         # Instructor data model and logic
├── Course.java              # Course data model
└── CourseRegistration.java # Helper for linking entities
```

## 🛠️ Usage

### Prerequisites
-   Java Development Kit (JDK) 8 or higher.

### Running the Application

1.  **Compile the project**:
    ```bash
    javac src/college_system/*.java
    ```

2.  **Run the main class**:
    ```bash
    java -cp src college_system.Main
    ```

## 🤝 Contributing
Contributions are welcome! Fork the project and submit a pull request with your improvements.

---
Developed with ❤️ by [Habiba Mahfouz](https://github.com/habiba-mahfouz)
