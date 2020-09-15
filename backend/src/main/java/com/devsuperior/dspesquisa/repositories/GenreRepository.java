package com.devsuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dspesquisa.entities.Game;
import com.devsuperior.dspesquisa.entities.Genre;
import com.devsuperior.dspesquisa.entities.Record;

public interface GenreRepository extends JpaRepository<Record, Long>{

}
