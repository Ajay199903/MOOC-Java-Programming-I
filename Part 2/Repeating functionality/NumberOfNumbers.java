
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //The task is to keep the count of inputted numbers
        int count = 0;
        
        //The task is to loop and ask the user for numbers repeatedly
        while(true) {
            System.out.println("Give a number:");
            
            //Read user input
            int number = Integer.valueOf(scanner.nextLine());
            
            //Exit the loop if user input is 0
            if(number == 0) {
                break;
            }
            
            //Increase count of numbers
            count = count + 1;
        }
        
        //Print count of numbers
        System.out.println("Number of numbers: " + count);
    }
}
