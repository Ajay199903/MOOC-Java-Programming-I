
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ask the user for a number whose factorial need to be calculated
        System.out.println("Give a number:");
        
        //Read the number;
        int number = Integer.valueOf(scanner.nextLine());
        
        //Variable to keep track of the factorial
        int factorial = 1;
        
        //Loop to calculate the factorial of a number
        while(number > 0) {
            factorial *= number;
            
            number--;
        }
        
        //Print the facotorial of the number
        System.out.println("Factorial: " + factorial);
    }
}
