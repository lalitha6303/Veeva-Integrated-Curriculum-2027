
package com.vendingmachine;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        ProductCatalog catalog = new ProductCatalog();

        catalog.addProduct(new Product(101, "Soda", 30, 10));
        catalog.addProduct(new Product(102, "Chips", 20, 15));
        catalog.addProduct(new Product(103, "Chocolate", 40, 5));
        catalog.addProduct(new Product(104, "Candy", 10, 0));

        InventoryManager inventory =
                new InventoryManager(catalog);

        CurrencyManager currency = new CurrencyManager();

        currency.addMachineCurrency(10, 10);
        currency.addMachineCurrency(20, 10);
        currency.addMachineCurrency(50, 5);
        currency.addMachineCurrency(100, 5);

        VendingMachine machine =
                new VendingMachine(catalog, inventory);

        while (true) {

            System.out.println("\n===== VENDING MACHINE =====");
            System.out.println("1. View Products");
            System.out.println("2. Add Product");
            System.out.println("3. Restock Product");
            System.out.println("4. Purchase Product");
            System.out.println("5. View Transactions");
            System.out.println("6. View Machine Currency");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    catalog.displayProducts();
                    break;

                case 2:
                    addProduct(catalog);
                    break;

                case 3:
                    restockProduct(inventory);
                    break;

                case 4:
                    purchaseProduct(machine, currency);
                    break;

                case 5:
                    machine.displayTransactions();
                    break;

                case 6:
                    currency.displayMachineCurrency();
                    break;

                case 7:
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // ADD PRODUCT
    public static void addProduct(ProductCatalog catalog) {

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Product Name: ");
        String name = sc.next();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        if (price <= 0 || quantity < 0) {
            System.out.println("Invalid price or quantity!");
            return;
        }

        Product product = new Product(id, name, (int) price, quantity);

        catalog.addProduct(product);
    }

    // RESTOCK PRODUCT
    public static void restockProduct(InventoryManager inventory) {

        System.out.print("Enter Product ID: ");
        int productId = sc.nextInt();

        System.out.print("Enter quantity to add: ");
        int quantity = sc.nextInt();

        inventory.restockProduct(productId, quantity);
    }

    // PURCHASE PRODUCT
    public static void purchaseProduct(
            VendingMachine machine,
            CurrencyManager currency) {

        try {

            System.out.print("Enter Product ID: ");
            int productId = sc.nextInt();

            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();

            System.out.println("\nSelect Payment Method");
            System.out.println("1. Cash");
            System.out.println("2. UPI");

            System.out.print("Enter choice: ");
            int paymentChoice = sc.nextInt();

            Payment payment;

            if (paymentChoice == 1) {

                CashPayment cash = new CashPayment(currency);

                System.out.println("Accepted denominations: 1, 2, 5, 10, 20, 50, 100, 200");

                while (true) {

                    System.out.print("Insert denomination (0 to finish): ");
                    int denomination = sc.nextInt();

                    if (denomination == 0) {
                        break;
                    }

                    cash.insertCash(denomination);
                }

                payment = cash;

            } else if (paymentChoice == 2) {

                System.out.print("Enter UPI ID: ");
                String upiId = sc.next();

                payment = new UPIPayment(upiId);

            } else {

                System.out.println("Invalid payment choice!");
                return;
            }

            System.out.print("Cancel purchase? (1 = Yes, 0 = No): ");
            boolean cancel = sc.nextInt() == 1;

            machine.purchase(productId, quantity, payment, cancel);

        } catch (Exception e) {

            System.out.println("Purchase failed: " + e.getMessage());
        }
    }
}
