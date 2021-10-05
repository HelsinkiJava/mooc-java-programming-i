
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int numOne = Integer.valueOf(scanner.nextLine());
        System.out.println("Last Number?");
        int numTwo = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        for(int i = numOne; i <= numTwo; i++){
            sum +=i;
        }
        System.out.println("The sum is: " + sum);

    }
}
