
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int average = 0;
        int length = 0;
        String name = " ";
        while(true){
            String info = scanner.nextLine();
            if(info.isEmpty()){
                break;
            }else{
                String[] parts = info.split(",");
                sum += Integer.valueOf(parts[1]);
                average++;
                if(length < parts[0].length()){
                    length = parts[0].length();
                    name = parts[0];
                }
            }
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (double)sum / average);



    }
}
