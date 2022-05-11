import java.util.Scanner;
import java.util.ArrayList;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<Book>();

        while (true) {
            System.out.println("name of book:");
            String title = scanner.nextLine();
            if (title.isBlank()) {
                System.out.println("What information will be printed? title/pages/year/everything");
                String info = scanner.nextLine();
                if (info.equalsIgnoreCase("everything")) {
                    for (Book Book : list) {
                        System.out.println("The book is called " + Book.title() + ". It has " + Book.numberOfPages()
                                + " pages. The year published is " + Book.year());
                    }
                    break;
                }
                if (info.equalsIgnoreCase("title")) {
                    for (Book Book : list) {
                        System.out.println("The book is called " + Book.title());
                    }
                    break;
                }
                if (info.equalsIgnoreCase("pages")) {
                    for (Book Book : list) {
                        System.out.println(Book.title() + " has " + Book.numberOfPages() + " pages");
                    }
                    break;
                }
                if (info.equalsIgnoreCase("year")) {
                    for (Book Book : list) {
                        System.out.println(Book.title() + " was published in " + Book.year());
                    }
                    break;
                }
                else {
                    System.out.println("enter everything/title/pages/year");
                }
            }
            System.out.println("how many pages?");
            int numberOfPages = scanner.nextInt();
            System.out.println("when was it published?");
            int year = scanner.nextInt();
            String fixAbug = scanner.nextLine();

            list.add(new Book(title, numberOfPages, year));

        }
    }
    
}
