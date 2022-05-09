package com.testserver.testserver.controller;

import com.testserver.testserver.entity.Film;
import com.testserver.testserver.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FilmController {

    @Autowired
    private FilmService service;

    @PostMapping("/addFilm")
    public Film addFilm(@RequestBody Film film) {
        return service.saveFilm(film);
    }

    @PostMapping("/addFilms")
    public List<Film> addFilms(@RequestBody List<Film> films) {
        return service.saveAllFilms(films);
    }

    @GetMapping("/getFilms")
    public List<Film> findAllProducts(){
        return service.getFilms();
    }

    @GetMapping("/getFilm/{id}")
    public Film findFilmById(@PathVariable int id) {
        return service.getFilm(id);
    }

    @PutMapping("/update")
    public Film updateFilm(@RequestBody Film film) {
        return service.updateFilm(film);
    }

    @DeleteMapping("/delteFilm/{id}")
    public String deleteFilm(int id) {
        return service.deleteFilm(id);
    }

}
