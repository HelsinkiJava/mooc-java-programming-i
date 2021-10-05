
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        try (Scanner fileScan = new Scanner(Paths.get(file))) {
            while (fileScan.hasNextLine()) {
                String[] parts = fileScan.nextLine().split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                // Used because if above one-year old or age 0 we use years if between we only use year
                if (age > 1 || age == 0) {
                    System.out.println(name + ", age: " + age + " years");
                } else {
                    System.out.println(name + ", age: " + age + " year");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
