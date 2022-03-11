package com.devsuperior.desmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.desmovie.entities.Score;
import com.devsuperior.desmovie.entities.ScorePK;


public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
	
	
}


