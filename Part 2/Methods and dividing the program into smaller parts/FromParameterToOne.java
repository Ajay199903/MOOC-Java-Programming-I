
import java.util.Scanner;

public class FromParameterToOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Read the number from the user and print all the
        //starting from the user entered number until 1
        int number = Integer.valueOf(scanner.nextLine());
        
        //call the method to print the numbers;
        printFromNumberToOne(number);
    }

    public static void printFromNumberToOne(int number) {
        //Loop from number until 1 and print
        for(int i = number; i > 0; i--) {
            System.out.println(i);
        }
    }
}
