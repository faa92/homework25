public class Film extends Show {
    public Film(
            String movieTitle,
            int productionYear,
            String country,
            double rating,
            int numberOfRatings
    ) {
        super(movieTitle,
                productionYear,
                country,
                rating,
                numberOfRatings);
    }

    @Override
    public String toString() {
        return "[Фильм ] %-40s  %-9s  %s             %.1f  %7s"
                .formatted(getMovieTitle(), getProductionYear(), getCountry(),
                        getRating(), getNumberOfRatings());
    }
}