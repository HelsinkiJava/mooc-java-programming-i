
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String name = " ";
        while(true){
            String info = scanner.nextLine();
            if(info.isEmpty()){
                break;
            }else{
                String[] parts = info.split(",");
                if(oldest < Integer.valueOf(parts[1])){
                    oldest = Integer.valueOf(parts[1]);
                    name = String.valueOf(parts[0]);
                }
            }
        }
        //name = String.valueOf(pars[oldest]);
        System.out.println("Name of the oldest: " + name);


    }
}
