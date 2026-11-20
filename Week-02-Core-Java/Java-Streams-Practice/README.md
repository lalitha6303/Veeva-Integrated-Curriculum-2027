# Java Streams Practice

## Project Overview

This project contains hands-on practice programs using the Java Stream API. It focuses on processing collections of objects, filtering data, transforming elements, grouping records, sorting results, removing duplicates, and performing data analysis using functional programming concepts.

The exercises use practical examples involving Employees, Companies, Patients, Strings, and Integers.

## Technologies Used

- Java 21
- Java Stream API
- Lambda Expressions
- Functional Interfaces
- Java Collections Framework
- Method References

## Practice Programs

### 1. Employee Stream Operations

Practised Stream API operations using Employee objects with attributes:

- Employee ID
- Name
- Job
- Qualification
- Date of Joining
- Salary
- Department

**Problems Practised:**

1. Find the highest-earning employee in each department.
2. Find employees in the Engineering department earning more than 80,000, sorted alphabetically by name.
3. Group employees by department, including only employees earning more than 1,00,000.
4. Extract distinct employee skills starting with the letter 'J'.
5. Filter employees so that only the first employee from each department is retained.

### 2. Company and Employee Streams

Created a collection of Company objects, where each company contains a list of Employee objects.

Company attributes:
- ID
- Name
- Location

Employee attributes:
- ID
- Job
- Salary

**Problem Practised:**

- Flatten the employee collections from multiple companies into a single list of employee names using `flatMap()`.

### 3. Healthcare Data Processing Using Streams

Created a collection of Patient objects with the following attributes:

- Patient ID
- Patient Name
- Department
- Doctor Name
- Diagnosis
- Treatment Given
- Severity
- Patient Type (Outpatient / Inpatient / ICU)
- Heart Rate
- Blood Pressure
- Sugar Value

**Problems Practised:**

1. Find all active ICU patients.
2. Find active ICU patients with an elevated heart rate (greater than 100).
3. Sort patients based on severity.

### 4. String Stream Operations

**Problem 1: String Processing Pipeline**

Given a list of strings:

1. Filter strings with a minimum length of 4.
2. Convert strings into uppercase.
3. Remove duplicate strings.
4. Sort strings in natural order.
5. Collect the final results.
6. Print the output after every intermediate stage.

**Problem 2: First Non-Repeating Character**

- Given a string, find its first non-repeating character using Java Streams.

### 5. Integer Stream Operations

**Problem 1: Integer Array Processing**

Given an array of integers:

1. Filter numbers greater than 5.
2. Square the filtered numbers.
3. Remove duplicate values.
4. Sort the results in ascending order.

**Problem 2: Find Unique Numbers**

- Given a list of integers, find only the numbers that appear exactly once.

## Java Stream API Concepts Practised

| Concept | Purpose |
|---|---|
| `stream()` | Creates a stream from a collection |
| `filter()` | Filters elements based on conditions |
| `map()` | Transforms elements |
| `flatMap()` | Flattens nested streams |
| `distinct()` | Removes duplicates |
| `sorted()` | Sorts elements |
| `forEach()` | Performs an action on each element |
| `collect()` | Collects stream results |
| `Collectors.groupingBy()` | Groups elements based on a property |
| `Collectors.maxBy()` | Finds maximum elements |
| `Collectors.toList()` | Collects results into a list |
| `findFirst()` | Retrieves the first matching element |
| `count()` | Counts stream elements |

## Learning Outcomes

- Understanding the Java Stream API and functional programming.
- Processing collections of custom objects.
- Applying filtering, mapping, sorting, and reduction operations.
- Working with nested collections using `flatMap()`.
- Grouping objects using Collectors.
- Performing department-wise employee analysis.
- Processing healthcare data using multiple conditions.
- Solving common Java Stream coding problems.

