package com.vendingmachine;

import java.time.LocalDateTime;

public class Transaction {

    private int transactionId;
    private String productName;
    private int quantity;
    private int totalAmount;
    private String paymentType;
    private LocalDateTime transactionTime;

    public Transaction(int transactionId, String productName,
                       int quantity, int totalAmount, String paymentType) {

        this.transactionId = transactionId;
        this.productName = productName;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
        this.paymentType = paymentType;
        this.transactionTime = LocalDateTime.now();
    }

    public void displayTransaction() {

        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Product: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: Rs." + totalAmount);
        System.out.println("Payment Type: " + paymentType);
        System.out.println("Time: " + transactionTime);
        System.out.println("--------------------------------");
    }
}