package repository;

import model.Film;
import model.Series;
import model.Show;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ShowRepository {
    public static final String FILMS_FILE = "films.csv";
    public static final String SERIES_FILE = "series.csv";

    public List<Show> getAllShows() {
        List<Show> shows = new ArrayList<>();

        try {
            BufferedReader filmsReader = new BufferedReader(new FileReader(FILMS_FILE));
            String line;
            while ((line = filmsReader.readLine()) != null) {
                String[] data = line.split(",");
                String title = data[0];
                int year = Integer.parseInt(data[1]);
                String country = data[2];
                double rating = Double.parseDouble(data[3]);
                int numberOfRatings = Integer.parseInt(data[4]);
                shows.add(new Film(title, year, country, rating, numberOfRatings));
            }
            filmsReader.close();

            BufferedReader seriesReader = new BufferedReader(new FileReader(SERIES_FILE));
            while ((line = seriesReader.readLine()) != null) {
                String[] data = line.split(",");
                String title = data[0];
                int productionYear = Integer.parseInt(data[1]);
                int lastEpisodeYear = Integer.parseInt(data[2]);
                String country = data[3];
                int numSeasons = Integer.parseInt(data[4]);
                int numberOfEpisodes = Integer.parseInt(data[5]);
                double rating = Double.parseDouble(data[6]);
                int numberOfRatings = Integer.parseInt(data[7]);
                shows.add(new Series(title, productionYear, lastEpisodeYear, country,
                        numSeasons, numberOfEpisodes, rating, numberOfRatings));
            }
            seriesReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return shows;
    }

}
