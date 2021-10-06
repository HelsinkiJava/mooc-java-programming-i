


import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        int game = 0;
        int wins = 0;
        int losses = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        try (Scanner fileScan = new Scanner(Paths.get(file))) {
            while (fileScan.hasNextLine()) {
                String[] parts = fileScan.nextLine().split(",");
                String home = parts[0].trim();
                String away = parts[1].trim();
                int pointsHome = Integer.valueOf(parts[2].trim());
                int pointsAway = Integer.valueOf(parts[3].trim());
                if (team.equals(home)) {
                    game++;
                    if (pointsHome < pointsAway) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
                if (team.equals(away)) {
                    game++;
                    if (pointsAway > pointsHome) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
            System.out.println("Games: " + game);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
