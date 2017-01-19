package com.example.server;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false, unique = true)
    String name;

    @Column(nullable = false)
    String password;

    @OneToMany(mappedBy = "user")
    List<Game> games;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
