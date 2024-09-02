package com.principal.repaso.controllers;

import java.lang.ProcessBuilder.Redirect;

import javax.naming.Binding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.principal.repaso.models.Course;
import com.principal.repaso.services.CourseService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    // Método para mostrar la vista de cursos
    @GetMapping("")
    public String index(HttpSession session, Model model, @RequestParam(value = "sort", required = false) String sort) {

        // Si no hay un usuario logueado, redirigimos al login
        if (session.getAttribute("currentUser") == null) {
            return "redirect:/";
        }
        if(sort != null){
            model.addAttribute("courses", courseService.findAll(sort));
            return "courses/index.jsp";
        }
        model.addAttribute("courses", courseService.findAll());
        return "courses/index.jsp";
    }

    // Método para mostrar la vista de curso por id
    @GetMapping("/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        model.addAttribute("course", courseService.findById(id));
        return "courses/show.jsp";
    }

    // Método para mostrar la vista de crear curso
    @GetMapping("/new")
    public String create(@ModelAttribute("course") Course course) {
        return "courses/create.jsp";
    }

    // Método para guardar un curso
    @PostMapping("/new")
    public String save(@Valid @ModelAttribute("course") Course course, BindingResult result) {

        if (result.hasErrors()) {
            return "courses/create.jsp";
        }
        courseService.create(course);
        return "redirect:/courses";
    }

    // Método para mostrar la vista de editar curso
    @GetMapping("/{currentId}/edit")
    public String edit(
            @Valid @ModelAttribute("course") Course course, BindingResult result,
            Model model,
            @PathVariable("currentId") Long currentId) {
        // SIGNIFICA QUE NO TENEMOS UN MODELO DE CURSO POR REDIRECCION ENTONCES LO
        // BUSCAMOS
        if (course.getId() == null) {
            course = courseService.findById(currentId);
        }
        model.addAttribute("course", course);
        return "courses/edit.jsp";
    }

    // Método para actualizar un curso
    @PutMapping("/{id}/edit")
    public String update(@Valid @ModelAttribute("course") Course course, BindingResult result,
            RedirectAttributes redirectAttributes, @PathVariable("id") Long id) {

        if (result.hasErrors()) {
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.course", result);
            redirectAttributes.addFlashAttribute("course", course);
            return "redirect:/courses/" + id + "/edit";
        }
        courseService.update(course);
        return "redirect:/courses";
    }

    // Método para eliminar un curso
    @DeleteMapping("/{id}")
    public String delete() {
        return "redirect:/courses";
    }

}
