package com.principal.repaso.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.principal.repaso.models.Course;
import com.principal.repaso.models.User;
import com.principal.repaso.services.CourseService;
import com.principal.repaso.services.UserService;

import jakarta.servlet.http.HttpSession;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
@RequestMapping("/inscriptions")
public class InscriptonController {

    @Autowired
    private UserService userService;
    private CourseService courseService;

    @PostMapping("")
    public String create(@RequestParam("courseId") Long courseId, HttpSession session) {
        User currentUser = (User) session.getAttribute("currentUser");
        Course foundCourse = courseService.findById(courseId);
        session.setAttribute("currentUser", userService.addCourse(currentUser, foundCourse));

        return "redirect:/courses";
    }

    @DeleteMapping("")
    public String delete(@RequestParam("courseId") Long courseId, HttpSession session) {
        User currentUser = (User) session.getAttribute("currentUser");
        Course foundCourse = courseService.findById(courseId);
        session.setAttribute("currentUser", userService.removeCourse(currentUser, foundCourse));
        return "redirect:/courses";
    }

}
