public class TvShow {
    private String showName;
    private int numberOfEpisodes;
    private String genre;

    public TvShow(String showName, int numberOfEpisodes, String genre) {
        this.showName = showName;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = genre;
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
