# Java OOP Practice

This repository contains a collection of Java programs and projects designed to help you practice and master Object-Oriented Programming (OOP) concepts in Java. The codebase is organized into weekly exercises, mini-projects, and topic-focused directories.

## Table of Contents

- [Overview](#overview)
- [Directory Structure](#directory-structure)
- [Key Projects](#key-projects)
- [Weekly Exercises](#weekly-exercises)
- [How to Run](#how-to-run)
- [Requirements](#requirements)
- [License](#license)

---

## Overview

This repository is intended for learning and practicing Java programming, with a focus on OOP principles. It includes:
- Weekly exercises covering basic to intermediate Java topics.
- Mini-projects simulating real-world applications (e.g., hotel reservation, library system, supermarket, airline ticketing).
- Example code for arrays, loops, conditionals, and user input handling.

## Directory Structure

```
.idea/                # IDE configuration files
new/                  # Airline ticketing system (App.java, Payment.java)
OOP_hotelRes/         # Hotel reservation system
OOP_lib/              # Library management system
OOP_supermarket/      # Supermarket/cart simulation
Week1/                # Week 1 exercises (basics, arithmetic, input/output)
Week2/                # Week 2 exercises (conditionals, simple logic)
Week3/                # Week 3 exercises (loops, patterns)
Week4/                # Week 4 exercises (arrays, random simulation)
Week5/                # Placeholder for Week 5
Week9/                # Week 9 exercises (Student/Module OOP)
README.md
```

## Key Projects

### Airline Ticketing System (`new/`)
- **App.java**: Main application for buying plane tickets, showing seating, and managing payments.
- **Payment.java**: Handles payment details for ticket purchases.

### Hotel Reservation System (`OOP_hotelRes/`)
- **Main.java**: Classes for `Room` and `Hotel`, with room reservation and display functionality.

### Library Management System (`OOP_lib/`)
- **Main.java**: Classes for `Book` and borrowing/returning logic.

### Supermarket Simulation (`OOP_supermarket/`)
- **Supermarket.java**: Classes for `Product` and `Cart`, simulating adding products and displaying cart contents.

## Weekly Exercises

- **Week1**: Basic Java programs (arithmetic, temperature conversion, initials, menu, etc.).
- **Week2**: Conditionals, simple banking, grading, calculator, and games.
- **Week3**: Loop exercises, pattern printing.
- **Week4**: Arrays, random simulations, statistics.
- **Week9**: OOP with `Student` and `Module` classes.

## How to Run

1. **Clone the repository:**
   ```sh
   git clone <repository-url>
   cd Java-OOP-Practice
   ```

2. **Compile and run a specific Java file:**
   ```sh
   javac path/to/FileName.java
   java path.to.FileName
   ```
   For example, to run the airline ticketing system:
   ```sh
   javac new/App.java new/Payment.java
   java new.App
   ```

## Requirements

- Java JDK 8 or higher (tested up to JDK 23)
- A Java IDE (e.g., IntelliJ IDEA, VS Code) is recommended for easier navigation.

## License

This repository is for educational purposes.

---

**Note:** Some files and features may be in-progress or for demonstration only. Contributions and suggestions are welcome!
