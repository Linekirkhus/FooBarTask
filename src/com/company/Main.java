package com.company;


// TASK:
// Program a function that takes a number as an input.
// Create a for loop that loops through all the numbers (example from 0 to 30) and prints out the following based on the number:
// - it prints “Foo” if the number is divisable by 5
// - it prints “Bar” if the number is divisable by 3
// - it prints "FooBar" if the number is divisable with both 3 and 5

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        // Asks user to enter any number
        System.out.println("Enter a number: ");
        int userInput = sc.nextInt();

        // TASK Create a for loop that loops through all the numbers
        // for loop checks if user input is greater than 0, and increments by 1 until i is equal to  if true then loops though
        for (int i = 0; i < userInput; i++) {

        }
        // By calling the fooBarCheck method which takes the user input number as a parameter program prints a required statement based on set rules b
        System.out.println(fooBarCheck(userInput));
    }

    // TASK: Program a function that takes a number as an input.
    //  - it prints “Foo” if the number is divisable by 5
    // - it prints “Bar” if the number is divisable by 3
    // - it prints "FooBar" if the number is divisable with both 3 and 5


    // The fooBarCheck method is a static method that returns a String and takes an integer as a parameter
    // Method checks if the user input meets the set rules ( i.e if the given number is divisible by 3 and / or 5 )
    // If the if check returns true, the method sets an inline variable of type String to the required value
    // The method proceeds to return the correct string value and finishes.
    static String fooBarCheck(int userNum) {

        // Initializes empty String
        String fooBar = null;

        // Checks if user input is if the given number is divisible by 3 and 5 by checking if the remainder of both statements equals 0
        // Using modulo (%) which will return false if the remainder of user input does not return 0
        if (userNum % 3 == 0 && userNum % 5 == 0) {

            // Sets the returned value to foobar if true
            fooBar = "FooBar";

            // Method returns string and finishes
            return fooBar;
        }

        // If previous if check returns false method checks if user input is divisible by 3
        // if the remainder of the if check returns 0 the statement is true and sets string to set rules
        if (userNum % 3 == 0) {
            // Method then returns String and finishes
            fooBar = "Bar";
            return fooBar;
        }

        // If previous if check returns false method continues to check the next statement and  checks if user input is divisible by 5
        if (userNum % 5 == 0) {
            // Method then returns String and finishes
            fooBar = "Foo";
            return fooBar;

            // if all statements returns false method concludes that the user input number is not divisible by set rules
        } else {
            // Method then returns String and finishes
            fooBar = "The number not divisible by 3 or 5";
        }
        return fooBar;
    }
}
