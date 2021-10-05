
import java.util.Arrays;
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String text = scanner.nextLine();
            if(text.isEmpty()){
                break;
            }else{
                String[] pieces = text.split(" ");
                String word = pieces[pieces.length - 1];
                System.out.println(word);
            }
        }


    }
}
