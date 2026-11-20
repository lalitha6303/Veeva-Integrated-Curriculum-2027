package com.vendingmachine;

import java.util.Map;

public class CashPayment implements Payment {

    private CurrencyManager currencyManager;

    public CashPayment(CurrencyManager currencyManager) {
        this.currencyManager = currencyManager;
    }

    public void insertCash(int denomination) {
        currencyManager.insertCash(denomination);
    }

    @Override
    public boolean processPayment(int amount)
            throws InsufficientFundsException,
            InsufficientChangeException {

        int insertedAmount = currencyManager.getInsertedAmount();

        if (insertedAmount < amount) {
            throw new InsufficientFundsException(
                    "Insufficient funds! Please insert more cash.");
        }

        int change = insertedAmount - amount;

        if (!currencyManager.canReturnChange(change)) {
            throw new InsufficientChangeException(
                    "Machine does not have sufficient change!");
        }

        System.out.println("Cash payment validated!");
        return true;
    }

    @Override
    public Map<Integer, Integer> completePayment(int amount)
            throws InsufficientChangeException {

        int change = currencyManager.getInsertedAmount() - amount;

        return currencyManager.dispenseChange(change);
    }

    @Override
    public Map<Integer, Integer> cancelPayment() {
        return currencyManager.cancelPayment();
    }

    @Override
    public String getPaymentType() {
        return "CASH";
    }
}