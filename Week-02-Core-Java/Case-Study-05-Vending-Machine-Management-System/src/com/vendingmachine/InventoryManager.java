package com.vendingmachine;

public class InventoryManager {

    private ProductCatalog catalog;

    public InventoryManager(ProductCatalog catalog) {
        this.catalog = catalog;
    }

    public Product validateStock(int productId, int quantity)
            throws ProductNotFoundException,
            SoldOutException,
            InsufficientQuantityException {

        if (quantity <= 0) {
            throw new IllegalArgumentException(
                    "Quantity must be greater than zero!");
        }

        Product product = catalog.searchProduct(productId);

        if (product == null) {
            throw new ProductNotFoundException("Product not found!");
        }

        if (product.getQuantity() == 0) {
            throw new SoldOutException(
                    product.getProductName() + " is sold out!");
        }

        if (quantity > product.getQuantity()) {
            throw new InsufficientQuantityException(
                    "Requested quantity exceeds available stock!");
        }

        return product;
    }

    public void reduceStock(Product product, int quantity) {

        int remaining = product.getQuantity() - quantity;

        product.setQuantity(remaining);

        System.out.println("Stock updated successfully!");
        System.out.println("Remaining stock: " + remaining);
    }
    public void restockProduct(int productId, int quantity) {

        Product product = catalog.searchProduct(productId);

        if (product == null) {
            System.out.println("Product not found!");
            return;
        }

        if (quantity <= 0) {
            System.out.println("Restock quantity must be positive!");
            return;
        }

        int newQuantity = product.getQuantity() + quantity;

        product.setQuantity(newQuantity);

        System.out.println("Product restocked successfully!");
        System.out.println("Updated stock: " + newQuantity);
    }


}