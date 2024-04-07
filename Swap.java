package javabasics.OOPS;
import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the firstnumber:");
        int firstnumber = scanner.nextInt();
        System.out.println("Enter the secondnumber:");
        int secondnumber = scanner.nextInt();
        System.out.println("Original values:");
        System.out.println("First number: " + firstnumber);
        System.out.println("Second number: " + secondnumber);
        
        // Swap the values of the two numbers using a temporary variable
        int temp = firstnumber;
        firstnumber = secondnumber;
        secondnumber = temp;
        
        // Print the swapped values of the two numbers
        System.out.println("\nSwapped values:");
        System.out.println("First number: " + firstnumber);
        System.out.println("Second number: " + secondnumber);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
    }

