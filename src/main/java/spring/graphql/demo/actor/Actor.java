package spring.graphql.demo.actor;


import spring.graphql.demo.movie.Movie;

import java.util.List;

public record Actor(Long id, String name, String birthDate, List<Movie> movies) {

}

