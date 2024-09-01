package com.crud.domain.repository;

import com.crud.domain.model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicaRepository extends JpaRepository<Musica, Long> {
}
