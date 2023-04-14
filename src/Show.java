public abstract class Show {
    private String movieTitle;
    private int productionYear;
    private String country;
    private double rating;
    private int numberOfRatings;

    public Show(String movieTitle, int productionYear, String country, double rating, int numberOfRatings) {
        this.movieTitle = movieTitle;
        this.productionYear = productionYear;
        this.country = country;
        this.rating = rating;
        this.numberOfRatings = numberOfRatings;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getCountry() {
        return country;
    }

    public double getRating() {
        return rating;
    }

    public int getNumberOfRatings() {
        return numberOfRatings;
    }


}
