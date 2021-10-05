
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while(true){
            String info = scanner.nextLine();
            if(info.equals("end")){
                break;
            }
            count++;
        }
        System.out.print(count);

    }
}
