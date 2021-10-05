
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList<Integer> numbers = new ArrayList();
        int small = Integer.MAX_VALUE;

        while (true) {

            int input = Integer.valueOf(scanner.nextLine());
            numbers.add(input);
            if (input == 9999) {
                break;
            }
        }
        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            if (num < small) {
                small = num;

            }
        }
        System.out.println("Smallest number: " + small);
        for(int j = 0; j < numbers.size(); j++){
            if(small == numbers.get(j)){
                System.out.println("Found at index: " + j);
            }
        }



    }
}
