
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<Item>();
        while(true){
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if(id.isEmpty()){
                break;
            }else{
                System.out.println("Name? (empty will stop)");
                String name = scanner.nextLine();
                if(name.isEmpty()){
                    break;
                }else{
                    Item item = new Item(name, id);
                    if(items.contains(item)){
                        System.out.println("Already on the list");
                    }else{
                        items.add(item);
                    }
                }
            }
        }
        System.out.println("==Items==");
        for(Item i : items){
            System.out.println(i);
        }


    }
}
