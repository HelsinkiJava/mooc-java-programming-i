
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        System.out.println("Last number?");
        int num = Integer.valueOf(scanner.nextLine());
        //while (count <= num) {
        for (int i = count; i <= num; i++) {
            sum += i;

        }
        System.out.println("The sum is " + sum);


        //System.out.println(sum);
        //System.out.println(count);
        //System.out.println(num);
        //sum += 1;
        count++;

        //}
        //System.out.println("The sum is " + sum);

    }
}
