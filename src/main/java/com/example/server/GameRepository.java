package com.example.server;


import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GameRepository extends CrudRepository<Game, Integer> {
    List<Game> findByGenre(String genre);
    List<Game> findByReleaseYear(int year);
    List<Game> findByUser(User user);
}