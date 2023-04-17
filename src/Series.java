public class Series extends Show {
    private int lastSeasonYear;
    private int numberOfSeasons;
    private int numberOfEpisodes;

    public int getLastSeasonYear() {
        return lastSeasonYear;
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public Series(String movieTitle,
                  int productionYear,
                  int lastSeasonYear,
                  String country,
                  int numberOfSeasons,
                  int numberOfEpisodes,
                  double rating,
                  int numberOfRatings
    ) {
        super(movieTitle, productionYear, country, rating, numberOfRatings);
        if (numberOfSeasons < 0) throw new IllegalArgumentException("Неверное количество сезонов");
        if (numberOfEpisodes < 0) throw new IllegalArgumentException("Неверное количество епизодов");

        this.lastSeasonYear = lastSeasonYear;
        this.numberOfSeasons = numberOfSeasons;
        this.numberOfEpisodes = numberOfEpisodes;
    }

    @Override
    public String toString() {
        return "[Сериал] %-40s  %s–%s  %s  %2s  %3s  %.1f  %7s"
                .formatted(getMovieTitle(), getProductionYear(), getLastSeasonYear(),
                        getCountry(), getNumberOfSeasons(), getNumberOfEpisodes(), getRating(), getNumberOfRatings());
    }
}
