package javabasics.OOPS;
import java.util.Scanner;
public class Primenumber {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        scanner.close();
        boolean isPrime =true;
        if(number<=1){
            isPrime =false;
        }
        else{
            for(int i=2; i<=Math.sqrt(number); i++){
                if (number%i ==0){
                    isPrime=false;
                    break;
                }
            }
        }
    }
}
