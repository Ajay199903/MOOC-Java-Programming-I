
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Read lower limit
        int lowerLimit = Integer.valueOf(scanner.nextLine());
        
        //Read upper limit
        int upperLimit = Integer.valueOf(scanner.nextLine());
        
        //Call the method
        divisibleByThreeInRange(lowerLimit, upperLimit);
    }

    //Define divisibleByThreeInRange
    //It prints all the number divisible by 3 between the range
    public static void divisibleByThreeInRange(int lowerLimit, int upperLimit) {
        //Loop throudh the range and print numbers divisible by 3
        for(int i = lowerLimit; i <= upperLimit; i++) {
            if(i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
