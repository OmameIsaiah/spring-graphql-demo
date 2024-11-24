package spring.graphql.demo.movie;

import java.util.List;

public record Movie(Long id, String title, Integer year, List<String> genres, String director) {
}

