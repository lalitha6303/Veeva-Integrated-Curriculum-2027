package com.vendingmachine;

import java.util.Collections;
import java.util.Map;

public class UPIPayment implements Payment {

    private String upiId;
    private boolean paymentSuccessful;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public boolean processPayment(int amount) {

        System.out.println("Processing UPI payment...");
        System.out.println("UPI ID: " + upiId);
        System.out.println("Amount: Rs." + amount);

        // Simulating successful UPI payment
        paymentSuccessful = true;

        System.out.println("UPI payment successful!");

        return paymentSuccessful;
    }

    @Override
    public Map<Integer, Integer> completePayment(int amount) {

        if (!paymentSuccessful) {
            throw new IllegalStateException("Payment was not successful!");
        }

        return Collections.emptyMap();
    }

    @Override
    public Map<Integer, Integer> cancelPayment() {

        if (paymentSuccessful) {
            System.out.println("UPI refund initiated!");
            paymentSuccessful = false;
        }

        return Collections.emptyMap();
    }

    @Override
    public String getPaymentType() {
        return "UPI";
    }
}