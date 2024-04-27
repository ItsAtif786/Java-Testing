// package com.example;

public class Main {

    public static void displayHomePage(int i, String name) {
        System.out.println(i + " Hello, this is the home page, " + name);
    }

    public static void main(String[] args) {
        Index index = new Index(); 
        index.sayHello(); 
        System.out.print("Hey, I am Atif. How are you?");

        // Variable declarations
        int a = 1;
        int b = 4;
        double salary = 300.33;
        char gender = 'M';
        String name = "Atif"; 

        if (a > 2 && !name.equals("Atif") && gender != 'M') {
            System.out.println("Okay");
            for (int i = 0; i < 5; i++) {
                System.out.println("Hey, I am running. Count: " + i + ". Okay.");
            }
        } else if (a > 4 && a < 8 && a != b) {
            System.out.println("Sorry");
            int age = 12;
            while (age < 18) {
                System.out.println("Sorry, you are underage.");
                age++;
            }
        } else {
            int income = 333;
            if (income >= 333) {
                int myFees = 222;
                char myGender = 'M';
                while (myFees < income) {
                    System.out.println("Hello, " + myGender + ". My fees: " + myFees + ". Total income: " + income);
                    myFees++;
                }
            }
            inc(income);
            System.out.println("You cannot do.");
        }
    }

    // Method to display age
    public static void inc(int age) {
        System.out.println("Your age is: " + age);
    }

    // Method to display salary
    public static void inc(double salary) {
        System.out.println("Your salary is: " + salary);
    }
}
