package javabasics.OOPS;
import java.util.Scanner;
public class Integerlength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();
        int digitCount = String.valueOf(number).length();
        System.out.println("Number of digits in " + number + " is: " + digitCount);
    
    }
}
