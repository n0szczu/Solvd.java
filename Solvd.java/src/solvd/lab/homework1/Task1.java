package solvd.lab.homework1;

import java.util.Scanner;

public class Task1 {


    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = name.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input
    }
}
