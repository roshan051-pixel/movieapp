package com.upgrad.movieapp.dao;

import com.upgrad.movieapp.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MovieDao extends JpaRepository<Movie, Integer> {

}
