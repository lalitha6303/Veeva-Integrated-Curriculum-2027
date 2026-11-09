
package com.product.main;

import com.product.model.Product;
import com.product.service.ProductService;
import com.product.exception.InvalidQuantityException;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProductService service = new ProductService();

        int choice;

        do {

            System.out.println("\n========== PRODUCT MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add Product");
            System.out.println("2. Display All Products");
            System.out.println("3. Sort by Price (Descending)");
            System.out.println("4. Sort by Price Range (Descending)");
            System.out.println("5. Sort by Price and Manufacturing Date");
            System.out.println("6. Search by Product Name");
            System.out.println("7. Search by Manufacturing Date");
            System.out.println("8. Search by Price");
            System.out.println("9. Search by Name, Company and Price");
            System.out.println("10. Top K Expensive Products");
            System.out.println("11. Least K Expensive Products");
            System.out.println("12. Exit");

            System.out.print("\nEnter your choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:

                    System.out.print("Enter Product ID: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = Double.parseDouble(sc.nextLine());

                    System.out.print("Enter Manufacturing Date (YYYY-MM-DD): ");
                    LocalDate date = LocalDate.parse(sc.nextLine());

                    System.out.print("Enter Quantity: ");
                    int quantity = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter Company Name: ");
                    String company = sc.nextLine();

                    Product p = new Product(
                            id, name, price, date, quantity, company
                    );

                    try {
                        service.addProduct(p);
                    }
                    catch (InvalidQuantityException e) {
                        System.out.println("Exception: " + e.getMessage());
                    }

                    break;

                case 2:

                    service.displayProducts();
                    break;

                case 3:

                    service.sortByPriceDescending();
                    break;

                case 4:

                    System.out.print("Enter minimum price: ");
                    double min = Double.parseDouble(sc.nextLine());

                    System.out.print("Enter maximum price: ");
                    double max = Double.parseDouble(sc.nextLine());

                    service.sortByPriceRangeDescending(min, max);
                    break;

                case 5:

                    service.sortByPriceAndDateDescending();
                    break;

                case 6:

                    System.out.print("Enter product name: ");
                    String searchName = sc.nextLine();

                    service.searchByName(searchName);
                    break;

                case 7:

                    System.out.print("Enter manufacturing date (YYYY-MM-DD): ");
                    LocalDate searchDate = LocalDate.parse(sc.nextLine());

                    service.searchByManufacturingDate(searchDate);
                    break;

                case 8:

                    System.out.print("Enter product price: ");
                    double searchPrice = Double.parseDouble(sc.nextLine());

                    service.searchByPrice(searchPrice);
                    break;

                case 9:

                    System.out.print("Enter product name: ");
                    String n = sc.nextLine();

                    System.out.print("Enter company name: ");
                    String c = sc.nextLine();

                    System.out.print("Enter price: ");
                    double pr = Double.parseDouble(sc.nextLine());

                    service.searchByNameCompanyPrice(n, c, pr);
                    break;

                case 10:

                    System.out.print("Enter K value: ");
                    int topK = Integer.parseInt(sc.nextLine());

                    service.topKProducts(topK);
                    break;

                case 11:

                    System.out.print("Enter K value: ");
                    int leastK = Integer.parseInt(sc.nextLine());

                    service.leastKProducts(leastK);
                    break;

                case 12:

                    System.out.println("Thank you for using Product Management System!");
                    break;

                default:

                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 12);

        sc.close();
    }
}
