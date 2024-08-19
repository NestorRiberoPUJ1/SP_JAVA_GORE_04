package com.principal.dojoflix.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.principal.dojoflix.models.Movie;
import com.principal.dojoflix.models.Playlist;
import com.principal.dojoflix.services.MovieService;
import com.principal.dojoflix.services.PlaylistService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
@RequestMapping("/playlists")
public class PlaylistController {

    @Autowired
    private PlaylistService playlistService;
    private MovieService movieService;

    @GetMapping("/new")
    public String newPlaylist(@ModelAttribute("playlist") Playlist playlist,Model model) {

        List<Movie> movies = movieService.findAllWithoutPlaylist(); // Servicio que permite buscar todas las películas
        model.addAttribute("movies", movies);
        return "playlists/playlistForm.jsp";
    }

    @PostMapping("/new")
    public String saveMovie(@Valid @ModelAttribute("playlist") Playlist playlist, BindingResult result) {
        if (result.hasErrors()) {
            return "playlists/playlistForm.jsp"; // Si hay errores, regresa al formulario
        }
        // Si no hay errores, guarda la playlist
        playlistService.save(playlist); // Servicio que permite guardar una playlist

        return "redirect:/movies";
    }

}
