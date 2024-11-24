# Spring and GraphQL Example

This is a simple example of how to use Spring Boot and GraphQL together.

## About

See the src/main/resources/schema.graphqls file for the GraphQL schema. 

## Queries

---

GraphQL Playground URL: http://localhost:8181/dev-movie-service/graphiql?path=/dev-movie-service/api/v1/query
Endpoint URL: http://localhost:8181/dev-movie-service/api/v1/query

query {
movieById(id: 1) {
id
title
year
genres
director
}
}

mutation {
addMovie(
id: 4
title: "Inception"
year: 2010
genres: ["Action", "SciFi"]
director: "Christopher Nolan"
) {
id
title
year
genres
director
}
}

query {
movieById(id: 4) {
title
year
}
}
---

