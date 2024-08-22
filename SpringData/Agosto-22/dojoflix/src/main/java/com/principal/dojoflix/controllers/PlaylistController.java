package com.principal.dojoflix.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.principal.dojoflix.models.Movie;
import com.principal.dojoflix.models.Playlist;
import com.principal.dojoflix.models.Song;
import com.principal.dojoflix.services.MovieService;
import com.principal.dojoflix.services.PlaylistService;
import com.principal.dojoflix.services.SongService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
@RequestMapping("/playlists")
public class PlaylistController {

    @Autowired
    private PlaylistService playlistService;
    private MovieService movieService;
    private SongService songService;

    @GetMapping("")
    public String index(Model model) {
        List<Playlist> playlists = playlistService.findAll(); // Servicio que permite buscar todas las playlists
        model.addAttribute("playlists", playlists);
        return "playlists/playlists.jsp";
    }

    @GetMapping("/new")
    public String newPlaylist(@ModelAttribute("playlist") Playlist playlist, Model model) {

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

        return "redirect:/playlists";
    }

    @GetMapping("/edit/{id}")
    public String editPlaylist(Model model, @PathVariable("id") Long id) {
        Playlist playlist = playlistService.findById(id);
        model.addAttribute("playlist", playlist);
        List<Movie> movies = movieService.findAllWithoutPlaylist(); // Servicio que permite buscar todas las películas
        movies.add(playlist.getMovie());  // Agrega la película actual de la playlist a la lista de películas
        model.addAttribute("movies", movies);
        List<Song> songs = songService.findAll(); // Servicio que permite buscar todas las canciones
        model.addAttribute("songs", songs);
        return "playlists/playlistFormEdit.jsp";
    }

    @PutMapping("/edit/{id}")
    public String updatePlaylist(@Valid @ModelAttribute("playlist") Playlist playlist, BindingResult result,
            Model model) {
        if (result.hasErrors()) {
            return "playlists/playlistForm.jsp"; // Si hay errores, regresa al formulario
        }
        // Si no hay errores, guarda la playlist
        playlistService.save(playlist); // Servicio que permite guardar una playlist

        return "redirect:/playlists";
    }

}
