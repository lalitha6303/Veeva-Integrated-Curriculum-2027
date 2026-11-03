
package com.filehandling;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UpdateStudent {

    public void updateRecord(Scanner sc) {

        ArrayList<String> records = new ArrayList<>();

        System.out.print("Enter Roll Number to Update: ");
        String searchRollno = sc.nextLine();

        boolean found = false;

        try {

            BufferedReader br = new BufferedReader(
                new FileReader("student.txt")
            );

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                if (data[0].equals(searchRollno)) {

                    found = true;

                    System.out.println("\nSelect Field to Update:");
                    System.out.println("1. Name");
                    System.out.println("2. Age");
                    System.out.println("3. Mark 1");
                    System.out.println("4. Mark 2");
                    System.out.println("5. Mark 3");
                    System.out.println("6. Mark 4");
                    System.out.println("7. Mark 5");
                    System.out.println("8. Grade");

                    System.out.print("Enter your choice: ");
                    int choice = sc.nextInt();
                    sc.nextLine();

                    switch (choice) {

                        case 1:
                            System.out.print("Enter New Name: ");
                            data[2] = sc.nextLine();
                            break;

                        case 2:
                            System.out.print("Enter New Age: ");
                            data[1] = sc.nextLine();
                            break;

                        case 3:
                            System.out.print("Enter New Mark 1: ");
                            data[3] = sc.nextLine();
                            break;

                        case 4:
                            System.out.print("Enter New Mark 2: ");
                            data[4] = sc.nextLine();
                            break;

                        case 5:
                            System.out.print("Enter New Mark 3: ");
                            data[5] = sc.nextLine();
                            break;

                        case 6:
                            System.out.print("Enter New Mark 4: ");
                            data[6] = sc.nextLine();
                            break;

                        case 7:
                            System.out.print("Enter New Mark 5: ");
                            data[7] = sc.nextLine();
                            break;

                        case 8:
                            System.out.print("Enter New Grade: ");
                            data[8] = sc.nextLine();
                            break;

                        default:
                            System.out.println("Invalid field choice!");
                            found = false;
                    }
                }

                records.add(String.join(",", data));
            }

            br.close();

            if (found) {

                FileWriter fw = new FileWriter("student.txt");

                for (String record : records) {
                    fw.write(record + System.lineSeparator());
                }

                fw.close();

                System.out.println("Student Record Updated Successfully!");

            } else {
                System.out.println("Student Record Not Found or Invalid Choice!");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
