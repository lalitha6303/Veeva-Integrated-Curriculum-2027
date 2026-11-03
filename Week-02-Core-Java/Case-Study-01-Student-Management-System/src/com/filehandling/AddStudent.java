package com.filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddStudent {

    public void addRecord(Scanner sc) {

        try {

            // Create Student object
            Student s = new Student();

            System.out.println("\nEnter Student Details:");

            System.out.print("Enter Roll Number: ");
            s.setRollno(sc.nextLine());

            System.out.print("Enter Age: ");
            s.setAge(sc.nextLine());

            System.out.print("Enter Name: ");
            s.setName(sc.nextLine());

            System.out.print("Enter Mark 1: ");
            s.setM1(sc.nextLine());

            System.out.print("Enter Mark 2: ");
            s.setM2(sc.nextLine());

            System.out.print("Enter Mark 3: ");
            s.setM3(sc.nextLine());

            System.out.print("Enter Mark 4: ");
            s.setM4(sc.nextLine());

            System.out.print("Enter Mark 5: ");
            s.setM5(sc.nextLine());

            System.out.print("Enter Grade: ");
            s.setGrade(sc.nextLine());

            // Write student details into file
            FileWriter fw = new FileWriter("student.txt", true);

            fw.write(
                s.getRollno() + "," +
                s.getAge() + "," +
                s.getName() + "," +
                s.getM1() + "," +
                s.getM2() + "," +
                s.getM3() + "," +
                s.getM4() + "," +
                s.getM5() + "," +
                s.getGrade()
            );

            fw.write(System.lineSeparator());

            fw.close();

            System.out.println("\nStudent record added successfully!");

        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}
