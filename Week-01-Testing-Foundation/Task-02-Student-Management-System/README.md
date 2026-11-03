# Task 02 – Student Management System Testing Using Jira and Xray

## Project Overview

**Project Name:** Student Management System  
**Platform:** Jira Software and Xray  
**Project Type:** Software Testing and Test Management  
**Task:** 02  
**Project Walkthrough:** [https://drive.google.com/file/d/1f4Nsuq8RqM-Qmb9wlKVfwz6qH1BK7FPy/view?usp=drive_link]

## Objective

To understand and implement the software testing workflow using Jira and Xray by creating user stories, defining preconditions, preparing manual test cases, organizing test activities, executing test cases, reporting defects, and performing retesting.

## Practical Implementation

The following activities were completed:

### 1. Project Setup

- Created a Jira project named Student Management System.
- Configured the project for managing software testing activities.
- Explored Jira work items and Xray test management features.

### 2. User Story and Preconditions

- Created a User Story for Student Login Functionality.
- Defined acceptance criteria for successful and unsuccessful login scenarios.
- Created a precondition for testing student login.
- Linked the precondition to the relevant test cases.

### 3. Manual Test Case Creation

Created ten manual test cases for the Student Login module:

- TC01 – Login with valid credentials
- TC02 – Login with unregistered email
- TC03 – Login with incorrect password
- TC04 – Login with empty email
- TC05 – Login with empty password
- TC06 – Login with both fields empty
- TC07 – Verify password masking
- TC08 – Verify dashboard redirection after successful login
- TC09 – Login with invalid email format
- TC10 – Login with inactive student account

Added test steps, test data and expected results to the test cases.

### 4. Test Management

Created and configured the following Xray items:

| **Item** | **Purpose** |
|---|---|
| Student Login Test Suite | Organize the ten login test cases |
| Student Management System – Release 1.0 Testing | Plan testing activities for the release |
| Student Login – QA Execution Cycle 1 | Execute the login test cases |
| Student Login – QA Execution Cycle 2 | Retest the failed test case |

### 5. Test Execution and Defect Management

- Executed all ten test cases in the first execution cycle.
- Recorded 9 test cases as Passed and 1 test case as Failed.
- Identified a validation issue in the empty email test scenario.
- Created Bug SMS-17 – Student Login accepts empty email.
- Linked the failed test case to the related bug.
- Created a second execution cycle for retesting.
- Retested the failed test case and recorded the result as Passed.

**Execution Summary – Cycle 1:**

| **Status** | **Count** |
|---|---:|
| Passed | 9 |
| Failed | 1 |
| Total | 10 |

### 6. Reporting

- Explored the Xray Test Executions List Report.
- Reviewed the execution cycles and their associated test runs.
- Verified the defect count associated with each execution.

## Technologies and Tools Used

- Jira Software
- Xray Test Management
- Manual Testing
- GitHub

## Key Learning Outcomes

- Understanding Jira project and work item management.
- Creating user stories and acceptance criteria.
- Defining preconditions for test execution.
- Creating and managing manual test cases using Xray.
- Organizing test cases into Test Sets.
- Creating Test Plans and Test Executions.
- Executing test cases and recording results.
- Reporting defects and linking them to failed test cases.
- Performing retesting in a new execution cycle.
- Understanding the basic software testing workflow.

## Video Demonstration

**Project Walkthrough:** [https://drive.google.com/file/d/1f4Nsuq8RqM-Qmb9wlKVfwz6qH1BK7FPy/view?usp=drive_link]

## Project Outcome

Successfully implemented a sample manual testing and test management workflow for the Student Management System using Jira and Xray. The project demonstrates how requirements can be converted into test cases, organized into test management activities, executed, and connected with defect reporting and retesting.
