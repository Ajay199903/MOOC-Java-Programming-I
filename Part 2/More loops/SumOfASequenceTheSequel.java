
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ask the user for starting number
        System.out.println("First number?");
        
        //Read first number
        int firstNumber = Integer.valueOf(scanner.nextLine());
        
        //Ask the user for ending number
        System.out.println("Last Number?");
        
        //Read last number
        int lastNumber = Integer.valueOf(scanner.nextLine());
        
        //Variable to keep track sum of numbers
        int sumOfNumbers = 0;
        
        //Loop to find sum from first number till last number
        for(int i = firstNumber; i <= lastNumber; i++) {
            sumOfNumbers += i;
        }
        
        System.out.println("The sum is: " + sumOfNumbers);
    }
}
