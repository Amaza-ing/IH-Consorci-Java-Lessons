package com.ironhack.w1.d1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");


        // PRIMITIVE DATA TYPES

        byte myByte = 127;
        short myShort = 1000;
        int myInt = 9999;
        long myLong = 50000000000L;
        float myFloat = 1.2345f;
        double myDouble = 3.456;
        boolean myBoolean = true;
        char myChar = 'a';

        System.out.println("myByte: " + myByte);
        System.out.println("myShort: " + myShort);
        System.out.println("myInt: " + myInt);
        System.out.println("myLong: " + myLong);
        System.out.println("myFloat: " + myFloat);
        System.out.println("myDouble: " + myDouble);
        System.out.println("myBoolean: " + myBoolean);
        System.out.println("myChar: " + myChar);

        myInt = 1234;
        System.out.println("myInt: " + myInt);


//        STRINGS

        String myString = "Hello to everyone!";
        System.out.println(myString);


//        OPERATORS

        int number = 10;
        double doubleNumber = 10;

        System.out.println(number + 5);
        System.out.println(number - 5);
        System.out.println(number * 5);
        System.out.println(number / 3);
        System.out.println(doubleNumber / 3);
        System.out.println(number % 3);


//        CONDITIONALS

//        if-else syntax

        number = 5000;

        if (number == 0) {
            System.out.println("Number is equal to 0");
        } else if (number >= 100 && number <= 1000) {
            System.out.println("Number is bigger or equal than 100 and less or equal than 1000");
        } else {
            System.out.println("Number has another value");
        }

        if (number >= 10 || number <= -10) {
            System.out.println("Number has at least 2 digits");
        }

        if (number % 2 == 0) System.out.println("Number is even");
        else System.out.println("Number is odd");

        boolean myCondition = false;

        if (myCondition) System.out.println("Condition is true");
        else System.out.println("Condition is false");


//        switch case

        int day = 4;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
                break;
        }


//        CALLING METHODS

        myMethod();
        myMethod();
        myMethod();

        String info = getInfo(10);
        System.out.println(info);


//        STRING METHODS

        String address = "Fake Street, 123";

        System.out.println("Address: " + address);
        System.out.println("Address length: " + address.length());
        System.out.println(address.toUpperCase());
        System.out.println(address.toUpperCase().replace("E", "-"));

        String address2 = "Fake Street, 123";

        if (address.equals(address2)) System.out.println("They are the same address");
        else System.out.println("They are different addresses");


//        WRAPPERS

        Integer myNum = 100;
        System.out.println(myNum);
    }

//    METHODS

    public static void myMethod() {
        System.out.println("This");
        System.out.println("Is");
        System.out.println("Inside");
        System.out.println("myMethod");
    }

    public static String getInfo(int option) {
        if (option == 1) return "My name is Adrián";
        else if (option == 2) return "This is a Java bootcamp";
        else return "option " + option + " provides no info";
    }
}