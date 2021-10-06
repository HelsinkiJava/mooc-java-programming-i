


import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        ArrayList<Game> info =readFile(file);
        for(Game game: info){
            System.out.println(game);
        }
    }

    public static ArrayList<Game> readFile(String file) {
        ArrayList<Game> gamesPlayed = new ArrayList<>();
        try(Scanner scanFile = new Scanner(Paths.get(file))){
            while(scanFile.hasNextLine()){
                String info[] = scanFile.nextLine().split(",");
                String name = info[0];
                int game = Integer.valueOf(info[1]);
                gamesPlayed.add(new Game(name, game));
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return gamesPlayed;
    }
}
