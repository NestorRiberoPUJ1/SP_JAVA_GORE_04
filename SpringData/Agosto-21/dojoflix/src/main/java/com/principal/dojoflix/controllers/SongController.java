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
import org.springframework.web.bind.annotation.RequestMapping;

import com.principal.dojoflix.models.Song;
import com.principal.dojoflix.services.SongService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
@RequestMapping("/songs")
public class SongController {

    @Autowired
    private SongService songService;

    // Método que permite buscar todas las canciones
    @GetMapping("")
    public String index(Model model) {
        List<Song> songs = songService.findAll(); // Servicio que permite buscar todas las canciones
        model.addAttribute("songs", songs);
        return "songs/songs.jsp";
    }

    // Método que permite buscar una cancion por su id
    @GetMapping("/{id}")
    public String show(@PathVariable("id") Long id,Model model) {
        // Lógica adicional
        Song song = songService.findById(id); // Servicio que permite buscar una cancion por su id
        model.addAttribute("song", song);
        return "songs/song.jsp";
    }

    // Método que permite mostrar el formulario para crear una nueva cancion
    @GetMapping("/new")
    public String newSong(@ModelAttribute("song") Song song) {
        return "songs/songForm.jsp";
    }

    @PostMapping("/new")
    public String saveSong(@Valid @ModelAttribute("song") Song song,BindingResult result) {
        // Lógica adicional
        if(result.hasErrors()) {
            return "songs/songForm.jsp";
        }
        songService.save(song); // Servicio que permite guardar una cancion
        return "redirect:/songs";
    }

    // Método que permite mostrar el formulario para editar una cancion
    @GetMapping("/edit/{id}")
    public String editSong(@PathVariable("id") Long id) {
        // Lógica adicional
        return "songs/songForm.jsp";
    }

}
