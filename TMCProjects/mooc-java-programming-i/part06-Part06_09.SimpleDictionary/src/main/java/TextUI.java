import java.util.Scanner;

public class TextUI {
    private Scanner scan;
    private SimpleDictionary dict;

    //Scanner scan = new Scanner(System.in);
    public TextUI(Scanner scan, SimpleDictionary dict) {
        this.scan = scan;
        this.dict = dict;
    }

    public void start() {
        String command = scan.nextLine();
        System.out.print("Command:");
        if (command.equals("end"))
            System.out.println("Bye bye!");
        else {
            System.out.println("Unknown command");
        }
    }
}
