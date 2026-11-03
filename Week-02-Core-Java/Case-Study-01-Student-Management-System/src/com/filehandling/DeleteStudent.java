package com.filehandling;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DeleteStudent {

    public void deleteRecord(Scanner sc) {

        ArrayList<String> records = new ArrayList<>();

        System.out.print("Enter Roll Number to Delete: ");
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
                    continue;
                }

                records.add(line);
            }

            br.close();

            if (found) {

                FileWriter fw = new FileWriter("student.txt");

                for (String record : records) {
                    fw.write(record + System.lineSeparator());
                }

                fw.close();

                System.out.println("Student Record Deleted Successfully!");

            } else {
                System.out.println("Student Record Not Found!");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
