
import java.nio.file.Paths;
import java.security.spec.ECField;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int count = 0;
        int num = 0;
        try(Scanner s = new Scanner(Paths.get(file))){
            while(s.hasNextLine()){
                num = Integer.valueOf(s.nextLine());
                if(num >= lowerBound && num <= upperBound){
                    count++;
                }
            }
        }catch(Exception e){
            System.out.println("Error!");
        }
        System.out.print("Numbers: " + count);

    }

}
