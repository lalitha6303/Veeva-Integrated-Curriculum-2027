package com.vendingmachine;

import java.util.ArrayList;
import java.util.Map;

public class VendingMachine {

    private ProductCatalog catalog;
    private InventoryManager inventoryManager;

    private ArrayList<Transaction> transactions;

    private int transactionCounter = 1;

    public VendingMachine(ProductCatalog catalog,
                          InventoryManager inventoryManager) {

        this.catalog = catalog;
        this.inventoryManager = inventoryManager;

        transactions = new ArrayList<>();
    }

    public void purchase(int productId, int quantity,
                         Payment payment, boolean cancelBeforeDispensing)
            throws Exception {

        // Step 1: Validate stock
        Product product =
                inventoryManager.validateStock(productId, quantity);

        // Step 2: Calculate total amount
        int totalAmount = (int) (product.getPrice() * quantity);

        System.out.println("\nTotal Amount: Rs." + totalAmount);

        // Step 3: Validate payment
        payment.processPayment(totalAmount);

        // Step 4: Check cancellation
        if (cancelBeforeDispensing) {

            Map<Integer, Integer> refund = payment.cancelPayment();

            System.out.println("Transaction cancelled!");

            if (!refund.isEmpty()) {
                System.out.println("Cash refunded: " + refund);
            }

            return;
        }

        // Step 5: Complete payment
        Map<Integer, Integer> change =
                payment.completePayment(totalAmount);

        // Step 6: Reduce stock
        inventoryManager.reduceStock(product, quantity);

        // Step 7: Dispense product
        System.out.println("\nProduct dispensed successfully!");
        System.out.println("Product: " + product.getProductName());
        System.out.println("Quantity: " + quantity);

        if (!change.isEmpty()) {
            System.out.println("Change returned: " + change);
        }

        // Step 8: Record transaction
        Transaction transaction = new Transaction(
                transactionCounter++,
                product.getProductName(),
                quantity,
                totalAmount,
                payment.getPaymentType()
        );

        transactions.add(transaction);

        System.out.println("Transaction completed successfully!");
    }

    public void displayTransactions() {

        System.out.println("\n======= TRANSACTION HISTORY =======");

        if (transactions.isEmpty()) {
            System.out.println("No transactions available!");
            return;
        }

        for (Transaction transaction : transactions) {
            transaction.displayTransaction();
        }
    }
}