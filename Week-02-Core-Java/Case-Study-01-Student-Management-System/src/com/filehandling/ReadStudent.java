package com.filehandling;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadStudent {

    public void readAllRecords() {

        try {
            BufferedReader br = new BufferedReader(
                new FileReader("student.txt")
            );

            String line;

            System.out.println("\n===== ALL STUDENT RECORDS =====");

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                System.out.println("Roll Number: " + data[0]);
                System.out.println("Age: " + data[1]);
                System.out.println("Name: " + data[2]);
                System.out.println("Mark 1: " + data[3]);
                System.out.println("Mark 2: " + data[4]);
                System.out.println("Mark 3: " + data[5]);
                System.out.println("Mark 4: " + data[6]);
                System.out.println("Mark 5: " + data[7]);
                System.out.println("Grade: " + data[8]);

                System.out.println("-------------------------");
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

public void readRecordByName(String searchName) {

    boolean found = false;

    try {
        BufferedReader br = new BufferedReader(
            new FileReader("student.txt")
        );

        String line;

        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");

            if (data[2].equalsIgnoreCase(searchName)) {

                System.out.println("\nStudent Record Found!");
                System.out.println("Roll Number: " + data[0]);
                System.out.println("Age: " + data[1]);
                System.out.println("Name: " + data[2]);
                System.out.println("Mark 1: " + data[3]);
                System.out.println("Mark 2: " + data[4]);
                System.out.println("Mark 3: " + data[5]);
                System.out.println("Mark 4: " + data[6]);
                System.out.println("Mark 5: " + data[7]);
                System.out.println("Grade: " + data[8]);

                found = true;
                break;
            }
        }

        br.close();

        if (!found) {
            System.out.println("Student not found!");
        }

    } catch (IOException e) {
        System.out.println("Error: " + e.getMessage());
    }
}

public void readRecordByRollno(String searchRollno) {

    boolean found = false;

    try {
        BufferedReader br = new BufferedReader(
            new FileReader("student.txt")
        );

        String line;

        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");

            if (data[0].equals(searchRollno)) {

                System.out.println("\nStudent Record Found!");
                System.out.println("Roll Number: " + data[0]);
                System.out.println("Age: " + data[1]);
                System.out.println("Name: " + data[2]);
                System.out.println("Mark 1: " + data[3]);
                System.out.println("Mark 2: " + data[4]);
                System.out.println("Mark 3: " + data[5]);
                System.out.println("Mark 4: " + data[6]);
                System.out.println("Mark 5: " + data[7]);
                System.out.println("Grade: " + data[8]);

                found = true;
                break;
            }
        }

        br.close();

        if (!found) {
            System.out.println("Student not found!");
        }

    } catch (IOException e) {
        System.out.println("Error: " + e.getMessage());
    }
}


   
}
