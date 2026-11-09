
package com.product.model;

import java.time.LocalDate;

public class Product {

    private int prod_id;
    private String name;
    private double price;
    private LocalDate dateOfManufacture;
    private int quantity;
    private String companyName;

    public Product(int prod_id, String name, double price,
                   LocalDate dateOfManufacture,
                   int quantity, String companyName) {

        this.prod_id = prod_id;
        this.name = name;
        this.price = price;
        this.dateOfManufacture = dateOfManufacture;
        this.quantity = quantity;
        this.companyName = companyName;
    }

    public int getProd_id() {
        return prod_id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    public String toString() {
        return "Product ID: " + prod_id +
                ", Name: " + name +
                ", Price: " + price +
                ", Manufacturing Date: " + dateOfManufacture +
                ", Quantity: " + quantity +
                ", Company: " + companyName;
    }
}
