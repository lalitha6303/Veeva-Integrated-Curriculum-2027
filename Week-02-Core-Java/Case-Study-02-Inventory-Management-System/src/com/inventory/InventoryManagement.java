
package com.inventory;

import java.util.Scanner;

public class InventoryManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Inventory inventory = new Inventory();

        int choice;

        do {

            System.out.println("\n===== INVENTORY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Check Product Details");
            System.out.println("4. Display All Products");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Product ID: ");
                    String id = sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    sc.nextLine();

                    Product p = new Product(id, name, quantity, price);

                    inventory.addProduct(p);
                    break;

                case 2:
                    System.out.print("Enter Product ID to Remove: ");
                    String removeId = sc.nextLine();

                    inventory.removeProduct(removeId);
                    break;

                case 3:
                    System.out.print("Enter Product ID to Search: ");
                    String searchId = sc.nextLine();

                    inventory.checkProduct(searchId);
                    break;

                case 4:
                    inventory.displayAllProducts();
                    break;

                case 5:
                    System.out.println("Thank you! Exiting Inventory System.");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
