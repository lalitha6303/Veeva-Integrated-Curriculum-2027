# Vending Machine Management System

## Project Overview

The Vending Machine Management System is a Java-based application designed to simulate an automated vending machine. It manages product inventory, processes customer payments, dispenses selected products, calculates balances, and returns appropriate change.

The application supports cash payments using coins and notes, as well as online UPI payments. It also handles various transaction failures using user-defined exceptions.

## Functional Requirements

1. **Product Catalog:** Maintains multiple products with unique product IDs, names, and prices.
2. **Inventory Management:** Tracks product quantities and available currency denominations inside the machine.
3. **Payment Processing:** Accepts cash payments (coins and notes) and online UPI payments.
4. **Product Selection and Dispensing:** Allows customers to select products based on availability and updates stock after successful dispensing.
5. **Transaction Cancellation:** Allows customers to cancel transactions before product dispensing.
6. **Insufficient Funds Handling:** Raises an exception when the inserted amount is less than the product price.
7. **Change Management:** Checks whether sufficient change is available before completing cash transactions.
8. **Stock Availability:** Prevents the purchase of products that are out of stock.
9. **Quantity Validation:** Prevents customers from purchasing quantities greater than the available stock.

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Java Collections Framework
- User-Defined Exceptions
- Java Exception Handling

## OOP Concepts

- Encapsulation
- Abstraction
- Inheritance
- Polymorphism
- Interfaces
- Constructor-based Dependency Injection

## Key Classes

| Class | Responsibility |
|---|---|
| Product | Stores product information |
| ProductCatalog | Manages the product catalog |
| InventoryManager | Handles product stock |
| CurrencyManager | Manages currency denominations and change |
| Payment | Payment interface |
| CashPayment | Handles cash payments |
| UPIPayment | Handles UPI payments |
| Transaction | Maintains transaction information |
| VendingMachine | Coordinates vending machine operations |
| Main | Application entry point |

## Custom Exceptions

- `ProductNotFoundException`
- `SoldOutException`
- `InsufficientQuantityException`
- `InsufficientFundsException`
- `InsufficientChangeException`

## Project Structure

```text
Case-Study-05-Vending-Machine-Management-System
│
├── src
│   └── com
│       └── vendingmachine
│           ├── CashPayment.java
│           ├── CurrencyManager.java
│           ├── InsufficientChangeException.java
│           ├── InsufficientFundsException.java
│           ├── InsufficientQuantityException.java
│           ├── InventoryManager.java
│           ├── Main.java
│           ├── Payment.java
│           ├── Product.java
│           ├── ProductCatalog.java
│           ├── ProductNotFoundException.java
│           ├── SoldOutException.java
│           ├── Transaction.java
│           ├── UPIPayment.java
│           └── VendingMachine.java
│
└── README.md
```

## Learning Outcomes

- Applying OOP principles in a real-world application.
- Using Java Collections to manage product and currency data.
- Implementing interfaces for different payment methods.
- Creating and handling custom exceptions.
- Designing modular and reusable Java applications.
- Understanding inventory and transaction management.

