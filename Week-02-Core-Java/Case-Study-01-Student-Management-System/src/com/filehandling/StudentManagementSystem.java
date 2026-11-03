
package com.filehandling;

import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AddStudent add = new AddStudent();
        ReadStudent read = new ReadStudent();
        UpdateStudent update = new UpdateStudent();
        DeleteStudent delete = new DeleteStudent();

        int choice;

        do {
            System.out.println("\n===== STUDENT RECORD MANAGEMENT =====");
            System.out.println("1. Add Records");
            System.out.println("2. Read All Records");
            System.out.println("3. Read Records By Name");
            System.out.println("4. Read Record By Roll No");
            System.out.println("5. Update Student Details");
            System.out.println("6. Delete Record");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    add.addRecord(sc);
                    break;

                case 2:
                    read.readAllRecords();
                    break;

                case 3:
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    read.readRecordByName(name);
                    break;

                case 4:
                    System.out.print("Enter Roll Number: ");
                    String rollno = sc.nextLine();
                    read.readRecordByRollno(rollno);
                    break;

                case 5:
                    update.updateRecord(sc);
                    break;

                case 6:
                    delete.deleteRecord(sc);
                    break;

                case 7:
                    System.out.println("Application Closed.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}
