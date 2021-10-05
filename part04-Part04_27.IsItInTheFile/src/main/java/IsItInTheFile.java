
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        ArrayList<String> guest = new ArrayList<>();
        boolean found = false;
        try (Scanner s = new Scanner(Paths.get(file))) {
            while (s.hasNextLine()) {
                guest.add(s.nextLine());
            }
            for (String l : guest) {
                if(l.equals(searchedFor)){
                    found = true;
                }
            }
            if(found){
                System.out.println("Found!");
            }else{
                System.out.println("Not found.");
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}
