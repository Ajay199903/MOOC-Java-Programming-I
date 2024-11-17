
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        
        //Ask the user for upper limit
        System.out.println("Where to?");
        
        //Read upper limit
        int endingNumber = Integer.valueOf(scanner.nextLine());
        
        //Ask the user for lower limit
        System.out.println("Where from?");
        
        //Read lower limit
        int startingNumber = Integer.valueOf(scanner.nextLine());
        
        //Loop to print number from lower limit to upper limit
        for(int i = startingNumber; i <= endingNumber; i++) {
            System.out.print(i + " ");
        }
        
    }
}
