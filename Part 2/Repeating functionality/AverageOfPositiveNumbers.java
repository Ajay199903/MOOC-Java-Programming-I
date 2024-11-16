
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Variable to keep track of count of postive numbers
        int countOfPositiveNumbers = 0;
        
        //Variable to keep track of sum of positive numbers
        int sumOfPositiveNumbers = 0;
        
        //Loop to ask for user input
        while(true) {
            System.out.println("Give a number:");
            
            //Read user input
            int number = Integer.valueOf(scanner.nextLine());
            
            //Exit the loop when user enters 0
            if(number == 0) {
                break;
            }
            
            //Check number is positive
            if(number > 0) {
                //Increase count of postive numbers
                countOfPositiveNumbers = countOfPositiveNumbers + 1;
                
                //Add number ot sum
                sumOfPositiveNumbers = sumOfPositiveNumbers + number;
            }
        }
        
        //Check if count of positive numbers is greater than 0 or not
        if(countOfPositiveNumbers > 0) {
            //Calculate average of positive numbers
            double average = 1.0 * sumOfPositiveNumbers / countOfPositiveNumbers;
            
            //Print average
            System.out.println(average);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
