package com.vendingmachine;

import java.util.Map;

public interface Payment {

    boolean processPayment(int amount)
            throws InsufficientFundsException, InsufficientChangeException;

    Map<Integer, Integer> completePayment(int amount)
            throws InsufficientChangeException;

    Map<Integer, Integer> cancelPayment();

    String getPaymentType();
}