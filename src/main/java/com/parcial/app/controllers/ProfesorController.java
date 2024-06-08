package com.parcial.app.controllers;

import com.parcial.app.services.ProfesorService;
import com.parcial.app.variables.Profesor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/profesor")
public class ProfesorController {

    @Autowired
    private ProfesorService profesorService;

    @GetMapping
    public String getAllProfesores(Model model) {
        List<Profesor> profesores = profesorService.getAllProfesores();
        model.addAttribute("profesores", profesores);
        return "profesor/profesor-list";
    }

    @GetMapping("/form")
    public String profesorForm(Model model) {
        model.addAttribute("profesor", new Profesor());
        return "profesor/profesor-form";
    }

    @PostMapping
    public String createProfesor(@ModelAttribute Profesor profesor) {
        profesorService.saveProfesor(profesor);
        return "redirect:/profesor/success";
    }

    @GetMapping("/success")
    public String profesorSuccess() {
        return "profesor/profesor-success";
    }

    @GetMapping("/{id}")
    public String getProfesorById(@PathVariable Long id, Model model) {
        Profesor profesor = profesorService.getProfesorById(id);
        model.addAttribute("profesor", profesor);
        return "profesor/profesor-detail";
    }

    @DeleteMapping("/{id}")
    public void deleteProfesor(@PathVariable Long id) {
        profesorService.deleteProfesor(id);
    }
}
