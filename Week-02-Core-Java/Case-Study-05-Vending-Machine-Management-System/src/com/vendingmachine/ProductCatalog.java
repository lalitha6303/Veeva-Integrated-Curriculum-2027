
package com.vendingmachine;

import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {

    // HashMap to store products
    private HashMap<Integer, Product> products = new HashMap<>();

    // 1. Add product
    public void addProduct(Product product) {

        if (products.containsKey(product.getProductId())) {
            System.out.println("Product ID already exists!");
            return;
        }

        products.put(product.getProductId(), product);

        System.out.println("Product added successfully!");
    }

    // 2. Search product using ID
    public Product searchProduct(int productId) {

        if (products.containsKey(productId)) {

            return products.get(productId);

        } else {

            System.out.println("Product not found!");
            return null;
        }
    }

    // 3. Display all products
    public void displayProducts() {

        if (products.isEmpty()) {
            System.out.println("No products available!");
            return;
        }

        for (Map.Entry<Integer, Product> entry : products.entrySet()) {

            System.out.println("Product ID: " + entry.getKey());

            Product p = entry.getValue();

            p.displayProduct();

            System.out.println("--------------------");
        }
    }

    // 4. Update product quantity
    public void updateQuantity(int productId, int quantity) {

        Product p = products.get(productId);

        if (p == null) {
            System.out.println("Product not found!");
            return;
        }

        if (quantity < 0) {
            System.out.println("Quantity cannot be negative!");
            return;
        }

        p.setQuantity(quantity);

        System.out.println("Quantity updated successfully!");
    }

    // 5. Remove product
    public void removeProduct(int productId) {

        if (products.containsKey(productId)) {

            products.remove(productId);

            System.out.println("Product removed successfully!");

        } else {

            System.out.println("Product not found!");
        }
    }

    // 6. Get total number of products
    public int getTotalProducts() {

        return products.size();
    }
}
