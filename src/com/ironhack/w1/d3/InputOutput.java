package com.ironhack.w1.d3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) throws IOException {
//        System.out.println("Normal console output");
//        System.err.println("Error console output");


//        SCANNER CLASS

//        Scanner scanner = new Scanner(System.in);
//
//        String name;
//        do {
//            System.out.println("Please write your name");
//            name = scanner.nextLine();
//        } while (name.length() <= 3);
//        System.out.println("Your name is: " + name);
//
////        System.out.println("Please write your age");
////        int age = scanner.nextInt();
////        System.out.println("Your age is: " + age);
//
//        do {
//            scanner = new Scanner(System.in);
//            System.out.println("Please write your age");
//        } while (!scanner.hasNextInt());
//
//        int age = scanner.nextInt();
//        System.out.println("Your age is: " + age);
//
//        scanner.close();


//        FILE HANDLING

        String filePath = "src/com/ironhack/w1/d3/file.txt";

        FileWriter fileWriter = new FileWriter(filePath, true);
        fileWriter.write("This is a line\n");
        fileWriter.write("This is another line\n");
        fileWriter.close();


        File file = new File(filePath);
        Scanner fileScanner = new Scanner(file);
        String str = "";

        while (fileScanner.hasNextLine()) {
            str += fileScanner.nextLine() + "\n";
        }

        fileScanner.close();
        System.out.println(str);
    }
}
