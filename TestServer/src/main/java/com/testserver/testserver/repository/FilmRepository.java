package com.testserver.testserver.repository;

import com.testserver.testserver.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Integer> {



}
