
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        
        //Variable to keep track of sum of numbers
        int sumOfNumbers = 0;
        
        //Variable to keep track of count of numbers entered by user
        int countOfNumbers = 0;
        
        //Variable to keep track of count of even numbers
        int countOfEvenNumbers = 0;
        
        //Variable to keep track of count of odd numbers
        int countOfOddNumbers = 0;
        
        //Loop to ask the user for numbers
        while(true) {
            System.out.println("Give numbers:");
            
            //Read user input
            int number = Integer.valueOf(scanner.nextLine());
            
            //Exit the loop if user input is -1
            if(number == -1) {
                break;
            }
            
            //Add number to sum of numbers
            sumOfNumbers += number;
            
            //Increase the count of numbers by 1
            countOfNumbers += 1;
            
            //Increaase count of even and odd numbers accordingly
            if(number % 2 == 0) {
                countOfEvenNumbers += 1;
            } else {
                countOfOddNumbers += 1;
            }
        }
        
        //Caclulate Average of Numbers
        double averageOfNumbers = 1.0 * sumOfNumbers / countOfNumbers;
        
        //Print Output to user
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sumOfNumbers);
        System.out.println("Numbers: " + countOfNumbers);
        System.out.println("Average: " + averageOfNumbers);
        System.out.println("Even: " + countOfEvenNumbers);
        System.out.println("Odd: " + countOfOddNumbers);
    }
}
