
import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Once you have implemented the division method, you can
        // try it out here. Fopr example division(3,5);
        // should print "0.6"

        // division(3, 5);
        
        //Read value of numerator from the user
        int numerator = Integer.valueOf(scanner.nextLine());
        
        //Read value of denominator from the user
        int denominator = Integer.valueOf(scanner.nextLine());
        
        //Call division method
        division(numerator, denominator);
    }

    // implement the method here
    public static void division(int numerator, int denominator) {
        //Divide the numbers and print them
        System.out.println(1.0 * numerator / denominator);
    }
}
