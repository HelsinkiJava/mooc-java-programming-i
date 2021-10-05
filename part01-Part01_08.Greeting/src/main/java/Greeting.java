
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        String name = "";
        System.out.println("What's your name?");
        name = scanner.nextLine();
        System.out.println("Hi " + name);

    }
}
