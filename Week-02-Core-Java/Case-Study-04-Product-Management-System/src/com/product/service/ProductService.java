
package com.product.service;

import com.product.model.Product;
import com.product.exception.InvalidQuantityException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.time.LocalDate;
import java.util.PriorityQueue;
public class ProductService {

    // Repository to store product objects
    private ArrayList<Product> products = new ArrayList<>();

    // Method to add products
    public void addProduct(Product product)
            throws InvalidQuantityException {

        if (product.getQuantity() < 100) {

            throw new InvalidQuantityException(
                    "Product quantity must be at least 100. Product rejected: "
                            + product.getName()
            );
        }

        products.add(product);

        System.out.println("Product added successfully: "
                + product.getName());
    }

    // Method to display all products
    public void displayProducts() {

        for (Product p : products) {
            System.out.println(p);
        }
    }

    // sort by price-descending order
    public void sortByPriceDescending() {

        products.sort(
                Comparator.comparingDouble(Product::getPrice)
                        .reversed()
        );

        displayProducts();
    }
    // sort by price and manufacture date -descending order

    public void sortByPriceAndDateDescending() {

        products.sort(
                Comparator.comparingDouble(Product::getPrice)
                        .reversed()
                        .thenComparing(
                                Product::getDateOfManufacture,
                                Comparator.reverseOrder()
                        )
        );

        displayProducts();
    }

    //sortByPriceRangeDescending()

    public void sortByPriceRangeDescending(double minPrice, double maxPrice) {
       if(minPrice>maxPrice)
       {
           System.out.println("Invalid Price Range");
           return;
       }
        products.stream()
                .filter(p -> p.getPrice() >= minPrice &&
                        p.getPrice() <= maxPrice)
                .sorted(Comparator.comparingDouble(Product::getPrice).reversed())
                .forEach(System.out::println);
    }


    // search by proname

    public void searchByName(String name) {

        products.stream()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .forEach(System.out::println);
    }

    //Search by Manufacture id

    public void searchByManufacturingDate(LocalDate date) {

        products.stream()
                .filter(p -> p.getDateOfManufacture().equals(date))
                .forEach(System.out::println);
    }


    //search by price


    public void searchByPrice(double price) {

        products.stream()
                .filter(p -> p.getPrice() == price)
                .forEach(System.out::println);
    }



    //search by proname,company and price

    public void searchByNameCompanyPrice(
            String name, String company, double price) {

        products.stream()
                .filter(p -> p.getName().equalsIgnoreCase(name)
                        && p.getCompanyName().equalsIgnoreCase(company)
                        && p.getPrice() == price)
                .forEach(System.out::println);
    }


    //search top k products by price


    public void topKProducts(int k) {

        if (k <= 0 || k > products.size()) {
            System.out.println("Invalid K value!");
            return;
        }

        PriorityQueue<Product> pq = new PriorityQueue<>(
                Comparator.comparingDouble(Product::getPrice)
        );

        for (Product p : products) {

            pq.add(p);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        System.out.println("Top " + k + " Expensive Products:");

        pq.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice).reversed())
                .forEach(System.out::println);
    }

    //search least k products by price


    public void leastKProducts(int k) {

        if (k <= 0 || k > products.size()) {
            System.out.println("Invalid K value!");
            return;
        }

        PriorityQueue<Product> pq = new PriorityQueue<>(
                Comparator.comparingDouble(Product::getPrice).reversed()
        );

        for (Product p : products) {

            pq.add(p);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        System.out.println("Least " + k + " Expensive Products:");

        pq.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .forEach(System.out::println);
    }




}

