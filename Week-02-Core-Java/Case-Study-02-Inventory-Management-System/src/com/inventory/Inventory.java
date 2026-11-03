
package com.inventory;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<Product> products;

    // Constructor
    public Inventory() {
        products = new ArrayList<>();
    }

    // Add Product
    public void addProduct(Product p) {

        products.add(p);

        System.out.println("Product added successfully!");
    }
    public void removeProduct(String productId) {

        boolean found = false;

        for (Product p : products) {

            if (p.getProductId().equalsIgnoreCase(productId)) {

                products.remove(p);

                System.out.println("Product removed successfully!");

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product not found!");
        }
    }
    public void checkProduct(String productId) {

        boolean found = false;

        for (Product p : products) {

            if (p.getProductId().equalsIgnoreCase(productId)) {

                System.out.println("\n----- PRODUCT DETAILS -----");
                System.out.println("Product ID: " + p.getProductId());
                System.out.println("Product Name: " + p.getProductName());
                System.out.println("Quantity: " + p.getQuantity());
                System.out.println("Price: " + p.getPrice());

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product not found!");
        }
    }
    
    public void displayAllProducts() {

        if (products.isEmpty()) {
            System.out.println("Inventory is empty!");
            return;
        }

        System.out.println("\n========== ALL PRODUCTS ==========");

        for (Product p : products) {

            System.out.println("Product ID: " + p.getProductId());
            System.out.println("Product Name: " + p.getProductName());
            System.out.println("Quantity: " + p.getQuantity());
            System.out.println("Price: " + p.getPrice());

            System.out.println("--------------------------------");
        }
    }
    
}
