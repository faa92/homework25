public class Film extends Show {
    public Film(String movieTitle, int productionYear, String country, double rating, int numberOfRatings) {
        super(movieTitle, productionYear, country, rating, numberOfRatings);
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + getMovieTitle() + '\'' +
                ", year=" + getProductionYear() +
                ", country='" + getCountry() + '\'' +
                ", rating=" + getRating() +
                ", numRatings=" + getProductionYear() +
                '}';
    }
}