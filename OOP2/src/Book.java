public class Book {
    private String title;
    private int numberOfPages;
    private int year;

    public Book(String title, int numberOfPages, int year) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.year = year;
    }

    public Book(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public Book(String title) {
        this.title = title;
    }
    
    public Book() {
        
    }

    public String title() {
        return title;
    }
    
    public int numberOfPages() {
        return numberOfPages;
    }

    public int year() {
        return year;
    }
}
