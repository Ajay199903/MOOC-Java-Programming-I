
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Variable to track count of negative numbers
        int countOfNegativeNumbers = 0;
        
        //Loop to ask for user inputs
        while(true) {
            System.out.println("Give a number:");
            
            //Read user input
            int number = Integer.valueOf(scanner.nextLine());
            
            //Exit the loop if user input is 0
            if(number == 0) {
                break;
            }
            
            //Increase the count of negative numbers
            if(number < 0) {
                countOfNegativeNumbers = countOfNegativeNumbers + 1;
            }
        }
        
        //Print count of negative numbes inputted by user
        System.out.println("Number of negative numbers: " + countOfNegativeNumbers);
    }
}
