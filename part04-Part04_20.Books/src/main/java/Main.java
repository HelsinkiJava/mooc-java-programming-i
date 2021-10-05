import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> book = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("Title:");
            String title = scan.nextLine();
            if(title.isEmpty()){
                break;
            }
            System.out.print("Pages:");
            int pages = Integer.valueOf(scan.nextLine());
            System.out.print("Publication year:");
            int year = Integer.valueOf(scan.nextLine());
            book.add(new Book(title, pages, year));
        }
        System.out.print("What information will be printed?");
        String info = scan.nextLine();
        if(info.equals("everything")){
            for(Book b: book){
                System.out.println(b.getTitle() + ", " + b.getPages() + " pages, " + b.getYear());
            }
        }else if(info.equals("name")){
            for(Book b: book){
                System.out.println(b.getTitle());
            }
        }
    }
}
