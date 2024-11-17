
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Read user input
        int startingNumber = Integer.valueOf(scanner.nextLine());
        
        //Loop to print number till 100
        for(int i = startingNumber; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }
}
