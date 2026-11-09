# Case Study 04 – Product Management System

## Overview
A menu-driven Java application that manages product details using the Java Collections Framework.

## Technologies Used
- Java 21
- IntelliJ IDE
- Java Collections Framework
- ArrayList
- Comparator
- PriorityQueue
- Java Stream API
- User-Defined Exceptions

## Product Attributes
- Product ID
- Product Name
- Price
- Date of Manufacture
- Quantity in Hand
- Company Name

## Features

### 1. Product Management
- Add product details.
- Display all products.
- Reject products having quantity below 100 using a custom exception.

### 2. Sorting Operations
- Sort products by price in descending order.
- Filter products within a specified price range and sort in descending order.
- Sort by price and manufacturing date in descending order.

### 3. Search Operations
- Search by product name.
- Search by manufacturing date.
- Search by price.
- Search by product name, company name and price.

### 4. Priority Queue Operations
- Find top K expensive products.
- Find least K expensive products.

### 5. Menu-Driven Interface
Provides an interactive console menu to perform all product management operations.

## Project Structure

```text
src/
└── com/product/
    ├── model/
    │   └── Product.java
    ├── exception/
    │   └── InvalidQuantityException.java
    ├── service/
    │   └── ProductService.java
    └── main/
        └── Main.java
```

## How to Run
1. Open the project in IntelliJ IDEA.
2. Configure JDK 21.
3. Open `Main.java`.
4. Run the main method.
5. Select operations from the console menu.

## Learning Outcomes
- Object-Oriented Programming
- Java Collections Framework
- Custom Exception Handling
- Comparator and Sorting
- Java Stream API
- PriorityQueue and Heap concepts
- Menu-driven application development
