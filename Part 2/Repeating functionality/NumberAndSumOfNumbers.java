
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Variable to keep track of count of numbers inputted by user
        int countOfNumbers = 0;
        
        //Variable to keep track of sum of the numbers inputted by user
        int sumOfNumbers = 0;
        
        //Loop to ask the user to enter the numbers
        while(true) {
            System.out.println("Give a number:");
            
            //Read user input
            int number = Integer.valueOf(scanner.nextLine());
            
            //Exit the loop when user enters 0
            if(number == 0) {
                break;
            }
            
            //Increase the count of numbers entered by user
            countOfNumbers = countOfNumbers + 1;
            
            //Increase the sum of the numbers entered by user
            sumOfNumbers = sumOfNumbers + number;
        }
        
        //Print count of numbers entered by user
        System.out.println("Number of numbers: " + countOfNumbers);
        
        //Print sum of numbers entered by user
        System.out.println("Sum of the numbers: " + sumOfNumbers);
    }
}
