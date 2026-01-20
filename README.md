# OOP Constructor - Java Learning Repository

A comprehensive collection of Java programs demonstrating **Constructor concepts** in Object-Oriented Programming (OOP). This repository is designed for beginners to understand how constructors work in Java through practical, easy-to-understand examples.

---

## What is a Constructor?

A **constructor** is a special method in Java that is automatically called when an object is created. It has the same name as the class and does not have a return type (not even `void`).

### Key Points:
- Constructor name must match the class name
- Called automatically when you create an object using `new` keyword
- Used to initialize object properties/variables
- No return type (not even void)

---

## Project Structure

```
src/
├── DefaultConstructor/
│   └── Demo.java
├── ParameterizedConstructor/
│   └── Student.java
├── InitializingVariables/
│   └── Student.java
├── ConstructorOverloading/
│   └── Product.java
├── ConstructorANDCalculation/
│   └── Rectangle.java
├── MultipleObjectswithConstructor/
│   └── Employee.java
├── BankAccountInitialization/
│   └── BankAccount.java
├── ATMSimulation/
│   └── ATM.java
├── CollegeAdmissionSystem/
│   └── Admission.java
└── ElectricityBillCalculator/
    └── ElectricityBill.java
```

---

## Programs Explained

### 1. Default Constructor (`DefaultConstructor/Demo.java`)

**Concept:** A constructor with no parameters. It initializes objects with default values.

```java
Demo(){
    System.out.println("constructor called..!");
}
```

**What happens:**
- When `new Demo()` is called, the constructor runs automatically
- Prints "constructor called..!" to show the constructor was invoked

**Output:**
```
constructor called..!
```

**Key Learning:** Every time you create an object, the constructor is called automatically.

---

### 2. Parameterized Constructor (`ParameterizedConstructor/Student.java`)

**Concept:** A constructor that accepts parameters to initialize object properties with custom values.

```java
Student(int r, String n){
    roll = r;
    name = n;
}
```

**What happens:**
- Creates a Student object with roll number `1` and name `"Sarthak"`
- The values passed during object creation are stored in the object's variables

**Output:**
```
1 Sarthak
```

**Key Learning:** Parameterized constructors let you set different values for each object you create.

---

### 3. Initializing Variables (`InitializingVariables/Student.java`)

**Concept:** Using a default constructor to set predefined/fixed values for variables.

```java
Student(){
    roll = 1;
    name = "Sarthak";
}
```

**What happens:**
- Constructor sets `roll` to `1` and `name` to `"Sarthak"` automatically
- The `display()` method prints these values

**Output:**
```
1 Sarthak
```

**Key Learning:** Constructors can set default values so every object starts with the same initial state.

---

### 4. Constructor Overloading (`ConstructorOverloading/Product.java`)

**Concept:** Having multiple constructors in the same class with different parameters. Java decides which constructor to call based on the arguments you provide.

```java
Product(){
    System.out.println("Default Product");
}

Product(String name){
    System.out.println("Product: " + name);
}
```

**What happens:**
- `new Product()` calls the first constructor (no parameters)
- `new Product("Mobile")` calls the second constructor (with String parameter)

**Output:**
```
Default Product
Product: Mobile
```

**Key Learning:** You can have multiple constructors - Java picks the right one based on arguments passed.

---

### 5. Constructor with Calculation (`ConstructorANDCalculation/Rectangle.java`)

**Concept:** Using constructor parameters to perform calculations in methods.

```java
Rectangle(int l, int b){
    length = l;
    breadth = b;
}

void area(){
    System.out.println("Area: " + (length * breadth));
}
```

**What happens:**
- Constructor stores length `10` and breadth `5`
- The `area()` method calculates: 10 × 5 = 50

**Output:**
```
Area: 50
```

**Key Learning:** Values set by constructor can be used anywhere in the class for calculations.

---

### 6. Multiple Objects with Constructor (`MultipleObjectswithConstructor/Employee.java`)

**Concept:** Creating multiple objects of the same class, each with different values.

```java
Employee e1 = new Employee(1, "Sarthak");
Employee e2 = new Employee(2, "Piyush");
```

**What happens:**
- Two separate Employee objects are created
- Each object has its own `id` and `name` values
- Both objects use the same constructor but store different data

**Output:**
```
1 Sarthak
2 Piyush
```

**Key Learning:** Each object is independent - changing one doesn't affect the other.

---

### 7. Bank Account Initialization (`BankAccountInitialization/BankAccount.java`)

**Concept:** Real-world example showing how banks might initialize account data.

```java
BankAccount(String h, int b){
    holder = h;
    balance = b;
}
```

**What happens:**
- Creates a bank account for holder "Sarthak" with balance 5000
- The `show()` method displays account details

**Output:**
```
Sarthak Balance: 5000
```

**Key Learning:** Constructors are used in real applications to set up initial data for objects.

---

### 8. ATM Simulation (`ATMSimulation/ATM.java`)

**Concept:** Simulating an ATM machine that starts with an initial balance.

```java
ATM(int initialAmount){
    balance = initialAmount;
}
```

**What happens:**
- ATM is initialized with balance of 10000
- `showBalance()` displays the current balance

**Output:**
```
Balance: 10000
```

**Key Learning:** Constructors help set the starting state of real-world objects like ATMs.

---

### 9. College Admission System (`CollegeAdmissionSystem/Admission.java`)

**Concept:** Using constructor values to make decisions (conditional logic).

```java
Admission(String n, int p){
    name = n;
    percentage = p;
}

void status(){
    if(percentage >= 60){
        System.out.println(name + "Admission Granted");
    } else {
        System.out.println(name + "Admission Rejected");
    }
}
```

**What happens:**
- Student "Sarthak" with 78% is created
- Since 78 >= 60, admission is granted

**Output:**
```
Sarthak Admission Granted
```

**Key Learning:** Constructor-initialized values can be used for decision-making in methods.

---

### 10. Electricity Bill Calculator (`ElectricityBillCalculator/ElectricityBill.java`)

**Concept:** Performing calculations inside the constructor itself.

```java
ElectricityBill(int u){
    units = u;
    bill = units * 5;  // Rate: ₹5 per unit
}
```

**What happens:**
- 150 units are passed to constructor
- Bill is calculated immediately: 150 × 5 = ₹750

**Output:**
```
Units: 150
Bill: ₹750.0
```

**Key Learning:** Constructors can do calculations, not just store values.

---

## Types of Constructors Summary

| Type | Description | Example in This Project |
|------|-------------|------------------------|
| **Default Constructor** | No parameters, sets default values | `Demo.java`, `InitializingVariables/Student.java` |
| **Parameterized Constructor** | Takes parameters to set custom values | `ParameterizedConstructor/Student.java`, `Rectangle.java` |
| **Constructor Overloading** | Multiple constructors with different parameters | `Product.java` |

---

## How to Run

### Prerequisites
- Java JDK 8 or higher installed
- Any IDE (IntelliJ IDEA, Eclipse, VS Code) or command line

### Steps to Run

**Using Command Line:**
```bash
# Navigate to the src folder
cd src

# Compile any program (example: DefaultConstructor)
javac DefaultConstructor/Demo.java

# Run the program
java DefaultConstructor.Demo
```

**Using IntelliJ IDEA:**
1. Open the project in IntelliJ IDEA
2. Navigate to any `.java` file
3. Click the green play button next to `main` method
4. View output in the console

---

## Learning Path (Recommended Order)

Follow this order for the best learning experience:

1. **DefaultConstructor** - Understand basic constructor concept
2. **InitializingVariables** - See how constructors set values
3. **ParameterizedConstructor** - Learn to pass values to constructor
4. **ConstructorOverloading** - Multiple constructors in one class
5. **ConstructorANDCalculation** - Use constructor values for math
6. **MultipleObjectswithConstructor** - Create many objects
7. **BankAccountInitialization** - Real-world banking example
8. **ATMSimulation** - Another practical example
9. **CollegeAdmissionSystem** - Decision making with constructor values
10. **ElectricityBillCalculator** - Calculations inside constructor

---

## Key Takeaways

- Constructors **initialize objects** when they are created
- Constructor name **must match** the class name
- Constructors have **no return type**
- **Default constructor**: No parameters
- **Parameterized constructor**: Takes parameters
- **Constructor overloading**: Multiple constructors with different parameters
- Each object gets its **own copy** of instance variables

---

## Author

**Sarthak Pawar**

---

## License

This project is open source and available for educational purposes.
