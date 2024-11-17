
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Read user input
        int userNumber = Integer.valueOf(scanner.nextLine());
        
        //Variable to keep track of the number
        int number = 0;
        
        //Loop to print the number till user Number
        while(number <= userNumber) {
            System.out.println(number);
            
            //Increase value of number by 1
            number++;
        }
    }
}
