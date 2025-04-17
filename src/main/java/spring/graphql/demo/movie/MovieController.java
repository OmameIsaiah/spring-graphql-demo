package spring.graphql.demo.movie;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Arrays;
import java.util.List;


@Controller
public class MovieController {
    private final MovieRepository movieRepository;

    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @QueryMapping
    public Movie movieById(@Argument Long id) {
        return movieRepository.getById(id);
    }

    @QueryMapping
    public Movie movieByTitle(@Argument String title) {
        return movieRepository.getByTitle(title);
    }

    @QueryMapping
    public List<Movie> movies() {
        return movieRepository.getAll();
    }

    @MutationMapping
    public Movie addMovie(@Argument Long id, @Argument String title, @Argument Integer year, @Argument List<String> genres,
                          @Argument String director) {
        Movie movie = new Movie(id, title, year, genres, director);
        movieRepository.addMovie(movie);
        return movie;
    }
}
