package com.testserver.testserver.service;

import com.testserver.testserver.entity.Film;
import com.testserver.testserver.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {

    @Autowired
    private FilmRepository repository;

    public Film saveFilm(Film film) {
        return repository.save(film);
    }

    public List<Film> saveAllFilms(List<Film> films) {
        return repository.saveAll(films);
    }

    public List<Film> getFilms() {
        return repository.findAll();
    }

    public Film getFilm(int id) {
        return repository.findById(id).orElse(null);
    }

    public String deleteFilm(int id) {
        repository.deleteById(id);
        return "Film removed. " + id;
    }

    public Film updateFilm(Film film) {
        Film existingFilm = repository.findById(film.getId()).orElse(null);
        existingFilm.setName(film.getName());
        existingFilm.setLength(film.getLength());
        return repository.save(existingFilm);
    }

}
