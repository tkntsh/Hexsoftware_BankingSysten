# Simple Banking System in Java

This is a basic console-based Java application that simulates a simple banking system. It includes two main classes: `Customer` and `BankAccount`, and a `BankingSystem` class for testing the operations.

## Features

- Create customer and bank account objects
- Deposit funds into an account
- Withdraw funds with balance validation
- Display account details
- Handle exceptions for invalid transactions

## Classes

### 1. `Customer`
Stores customer-related information:
- `name`
- `customerId`

### 2. `BankAccount`
Manages account operations:
- `accountNumber`
- `balance`
- `customer` (associated with the account)

#### Methods:
- `deposit(double amount)`
- `withdraw(double amount)`
- `getBalance()`
- `getAccountDetails()`

### 3. `BankingSystem`
Demonstrates the usage of the above classes:
- Creates a customer and account
- Deposits and withdraws funds
- Handles invalid operations like negative deposits and overdrafts

## How to Run

1. Make sure you have **Java installed** on your system.
2. Save the code into a file named `BankingSystem.java`.
3. Open a terminal or command prompt and navigate to the directory containing the file.
4. Compile the code using:
   ```bash
   javac BankingSystem.java
