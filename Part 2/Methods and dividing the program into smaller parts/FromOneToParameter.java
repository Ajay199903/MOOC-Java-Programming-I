
import java.util.Scanner;

public class FromOneToParameter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  
        //Ask the user for a number until which we need to print
        //starting from 1
        
        //Read user input
        int number = Integer.valueOf(scanner.nextLine());
        
        //Call the method
        printUntilNumber(number);
    }
    
    public static void printUntilNumber(int number) {
        //Loop from 1 until the number and print it
        for(int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }

}
