
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            if(num == 0){
                if(sum == 0){
                    System.out.println("Cannot calculate the average");
                }
                break;
            }else if(num > 0){
                sum += num;
                count ++;
            }
        }
        System.out.println((double)sum / count);

    }
}
