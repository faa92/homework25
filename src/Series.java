public class Series extends Show {
    private int lastEpisodeYear;
    private int numberOfSeasons;
    private int numberOfEpisodes;

    public Series(String movieTitle, int productionYear, String country,
                  double rating, int numberOfRatings) {
        super(movieTitle, productionYear, country, rating, numberOfRatings);
        this.lastEpisodeYear = lastEpisodeYear;
        this.numberOfSeasons = numberOfSeasons;
        this.numberOfEpisodes = numberOfEpisodes;
    }

    @Override
    public String toString() {
        return "Series{" +
                "title='" + getMovieTitle() + '\'' +
                ", year=" + getProductionYear() +
                ", country='" + getCountry() + '\'' +
                ", rating=" + getRating() +
                ", numRatings=" + getNumberOfRatings() +
                ", lastEpisodeYear=" + lastEpisodeYear +
                ", numSeasons=" + numberOfSeasons +
                ", numEpisodes=" + numberOfEpisodes +
                '}';
    }
}
