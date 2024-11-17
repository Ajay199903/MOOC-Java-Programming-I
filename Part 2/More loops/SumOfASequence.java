
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ask the user for last number
        System.out.println("Last number?");
        
        //Read the value of last number
        int lastNumber = Integer.valueOf(scanner.nextLine());
        
        //Variable to keep track of sum of numbers
        int sumOfNumbers = 0;
        
        //Loop to find sum of first n numbers
        for(int i = 1; i <= lastNumber; i++) {
            sumOfNumbers += i;
        }
        
        //Print the sum of first n numbers
        System.out.println("The sum is " + sumOfNumbers);
    }
}
