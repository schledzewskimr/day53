import java.util.Scanner;
import java.util.ArrayList;

public class TvShowMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TvShow> showList = new ArrayList<TvShow>();

        while (true) {
            System.out.println("name of show:");
            String showName = scanner.nextLine();
            if (showName.isBlank()) {
                for (TvShow TvShow : showList) {
                    System.out.println("The show is called " + TvShow.showName() + ". It has " + TvShow.numberOfEpisodes()+ " episodes. The genre is " + TvShow.genre());
                }
                break;
            }
            System.out.println("how many episodes?");
            int numberOfEpisodes = scanner.nextInt();
            System.out.println("what is the genre?");
            String fixABug = scanner.nextLine();
            String genre = scanner.nextLine();

            showList.add(new TvShow(showName, numberOfEpisodes, genre));

        }
    }
    
}
