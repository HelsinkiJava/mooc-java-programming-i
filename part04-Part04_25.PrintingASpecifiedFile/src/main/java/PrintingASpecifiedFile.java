
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have it contents printed?");
        String info = scanner.nextLine();
        try(Scanner s = new Scanner(Paths.get(info))){
            while(s.hasNextLine()){
                String name = s.nextLine();
                System.out.println(name);
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
