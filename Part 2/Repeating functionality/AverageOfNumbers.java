
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Variable to keep track of sum of numbers
        int sumOfNumbers = 0;
        
        //Variable to keep track of count of numbers
        int countOfNumbers = 0;
        
        //Loop to ask for user input
        while(true) {
            System.out.println("Give a number: ");
            
            //Read user input
            int number = Integer.valueOf(scanner.nextLine());
            
            //Exit the loop when user enters 0
            if(number == 0) {
                break;
            }
            
            //Increase the count of numbers
            countOfNumbers = countOfNumbers + 1;
            
            //Add number to sum of numbers
            sumOfNumbers = sumOfNumbers + number;
        }
        
        //Check whether the count of number is greater than 0 and then print average of numbers
        if(countOfNumbers > 0) {
            //Calculate average of numbers;
            double average = 1.0 * sumOfNumbers / countOfNumbers;
            
            //Print average of numbers
            System.out.println("Average of the numbers: " + average);
        }
    }
}
