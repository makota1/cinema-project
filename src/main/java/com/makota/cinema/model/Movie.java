package com.makota.cinema.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "movie_name")
    private String movieName;

    @Column(name = "movie_genre")
    private String movieGenre;

    @OneToMany(mappedBy = "movie", cascade = CascadeType.REMOVE)
    List<Seance> seanceList;
}
