package task;

import java.util.Scanner;

public class Employee_branch {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask for the user's age
        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        // Branching logic based on the user's age
        if (age < 18) {
            System.out.println("You are a minor.");
        } else if (age >= 18 && age < 65) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior.");
        }

        // Close the scanner object
        scanner.close();
    }
}
