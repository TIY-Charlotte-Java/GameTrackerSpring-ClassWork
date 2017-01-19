package com.example.server;


import javax.persistence.*;

@Entity
@Table(name = "games")
public class Game {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String platform;

    @Column(nullable = false)
    String genre;

    @Column(nullable = false)
    int releaseYear;

    @ManyToOne
    User user;

    public Game() {
    }

    public Game(String name, String platform, String genre, int releaseYear, User user) {
        this.name = name;
        this.platform = platform;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.user = user;
    }
}
