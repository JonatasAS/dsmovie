package com.devsuperior.desmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.desmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
