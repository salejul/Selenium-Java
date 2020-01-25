package com.herokuapp.theinternet;

import java.util.Scanner;

public class Primer {
    @SuppressWarnings("resource")
	public static void main(String[ ] args) {
        System.out.println("Hello Java lovers.");
        System.out.println("Let's try fizzbuzz");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input
        
        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("Value: FIZZ BUZZ.");
            } else if (i % 3 == 0){
                System.out.println("Value: FIZZ.");
            } else if (i % 5 == 0){
                System.out.println("Value: BUZZ.");
            } else {
                System.out.println("Value: " + i + ".");
            }
        }
        

    }
}
