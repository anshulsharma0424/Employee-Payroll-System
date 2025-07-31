# 🧾 Java Payroll System – OOPs Learning Project

This is a **complete Java-based Payroll Management System** built from scratch to learn and showcase the **4 core pillars of Object-Oriented Programming**:

- 🧠 Abstraction  
- 🛡️ Encapsulation  
- 🧬 Inheritance  
- 🎭 Polymorphism

---

## 📚 What I Learned?

While building this project, I deeply understood how real-world problems are modeled in OOP. Here's a summary of what I practiced:

### 🔹 1. Abstraction
- Used `abstract class Employee` to hide internal logic (like salary calculation).
- Let child classes handle specific implementations like `FullTimeEmployee` and `PartTimeEmployee`.

### 🔹 2. Encapsulation
- All class fields are `private`.
- Accessed only via `getters` → protects data from outside modification.

### 🔹 3. Inheritance
- Created common parent class `Employee`, and subclasses:
  - `FullTimeEmployee`
  - `PartTimeEmployee`
- Inherited shared properties like `id` and `name`.

### 🔹 4. Polymorphism
- Used method overriding via `@Override` to define `calculateSalary()` differently in each subclass.
- Printed employee details using overridden `toString()` which automatically calls the right version.

---

## 🛠️ Technologies Used

- 💻 Core Java (no external libraries)
- 🧪 JDK 24
- 📝 Code Editor: IntelliJ IDEA Ultimate
- 📁 Simple file structure with no frameworks for clarity and motivation to understand the practical use of OOPs concepts

---

## 📂 Project Structure

```
src/
|
├── Employee.java          // Abstract base class
|
├── FullTimeEmployee.java  // Subclass with monthly salary logic
|
├── PartTimeEmployee.java  // Subclass with hourly logic
|
├── PayrollSystem.java     // Manages employee list
|
└── Main.java              // Entry point
```
