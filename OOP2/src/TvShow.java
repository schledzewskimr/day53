public class TvShow {
    private String showName;
    private int numberOfEpisodes;
    private String genre;

    public TvShow(String showName, int numberOfEpisodes, String genre) {
        this.showName = showName;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = genre;
    }

    public TvShow(String showName, String genre) {
        this.showName = showName;
        this.genre = genre;
    }
    
    public TvShow(String showName) {

    }
    
    public TvShow() {
        
    }

    public String showName() {
        return showName;
    }
    
    public int numberOfEpisodes() {
        return numberOfEpisodes;
    }

    public String genre() {
        return genre;
    }
}
