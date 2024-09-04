package com.crud.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String generoMusica;
    private String nacionalidade;

    @Column(length = 1000)
    private String biografia;

    @OneToMany(mappedBy = "artista")
    private List<Musica> musicas = new ArrayList<>();

}
