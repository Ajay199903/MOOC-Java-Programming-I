
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Variable to track sum of numbers entered by the user
        int sum = 0;
        
        //Loop to ask the user to enter the numbers
        while(true) {
            System.out.println("Give a number:");
            
            //Read user input
            int number = Integer.valueOf(scanner.nextLine());
            
            //Exit loop if entered number is 0
            if(number == 0) {
                break;
            }
        
            //Add the number to the sum
            sum = sum + number;
        }
        
        //Print the sum of the numbers entered by the user
        System.out.println("Sum of the numbers: " + sum);
    }
}
