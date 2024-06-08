package com.parcial.app.controllers;

import com.parcial.app.services.ProfesorService;
import com.parcial.app.variables.Profesor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profesores")
public class ProfesorRestController {

    @Autowired
    private ProfesorService profesorService;

    @GetMapping
    public List<Profesor> getAllProfesores() {
        return profesorService.getAllProfesores();
    }

    @PostMapping
    public Profesor createProfesor(@RequestBody Profesor profesor) {
        return profesorService.saveProfesor(profesor);
    }

    @GetMapping("/{id}")
    public Profesor getProfesorById(@PathVariable Long id) {
        return profesorService.getProfesorById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteProfesor(@PathVariable Long id) {
        profesorService.deleteProfesor(id);
    }
}
