import model.Show;
import repository.ShowRepository;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        ShowRepository repository = new ShowRepository();
        List<Show> shows = repository.getAllShows();
        for (Show show : shows) {
            System.out.println(show.toString());
        }
    }
}
