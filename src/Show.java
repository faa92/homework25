public abstract class Show {
    public static final double MIN_RATING = 0;
    public static final double MAX_RATING = 10;
    public static final int COUNTRY_CODE_LENGTH = 2;

    private String movieTitle;
    private int productionYear;                 //YEAR class
    private String country;
    private double rating;
    private int numberOfRatings;

    public Show(
            String movieTitle,
            int productionYear,
            String country,
            double rating,
            int numberOfRatings
    ) {
        if (movieTitle.isEmpty()) throw new IllegalArgumentException("Нет названия шоу");
        if (country.length() != COUNTRY_CODE_LENGTH) throw new IllegalArgumentException("Неверный код страны");
        if (rating < MIN_RATING || rating > MAX_RATING) throw new IllegalArgumentException("Неверный рейтинг");
        if (numberOfRatings < 0) throw new IllegalArgumentException("Неверное количество оценок");

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
