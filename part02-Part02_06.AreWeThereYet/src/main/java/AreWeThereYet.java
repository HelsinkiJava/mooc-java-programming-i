
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int num = Integer.valueOf(scanner.nextLine());
        while(num != 4){
            System.out.println("Give a number:");
            num = Integer.valueOf(scanner.nextLine());
        }

    }
}
