package com.parcial.app.controllers;

import com.parcial.app.services.EstudianteService;
import com.parcial.app.variables.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/estudiante")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping
    public String getAllEstudiantes(Model model) {
        List<Estudiante> estudiantes = estudianteService.getAllEstudiantes();
        model.addAttribute("estudiantes", estudiantes);
        return "estudiante/estudiante-list";
    }

    @GetMapping("/form")
    public String estudianteForm(Model model) {
        model.addAttribute("estudiante", new Estudiante());
        return "estudiante/estudiante-form";
    }

    @PostMapping
    public String createEstudiante(@ModelAttribute Estudiante estudiante) {
        estudianteService.saveEstudiante(estudiante);
        return "redirect:/estudiante/success";
    }

    @GetMapping("/success")
    public String estudianteSuccess() {
        return "estudiante/estudiante-success";
    }

    @GetMapping("/{id}")
    public String getEstudianteById(@PathVariable Long id, Model model) {
        Estudiante estudiante = estudianteService.getEstudianteById(id);
        model.addAttribute("estudiante", estudiante);
        return "estudiante/estudiante-detail";
    }

    @DeleteMapping("/{id}")
    public void deleteEstudiante(@PathVariable Long id) {
        estudianteService.deleteEstudiante(id);
    }
}
