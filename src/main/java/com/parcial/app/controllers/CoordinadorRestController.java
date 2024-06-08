package com.parcial.app.controllers;

import com.parcial.app.services.CoordinadorService;
import com.parcial.app.variables.Coordinador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/coordinador")
public class CoordinadorRestController {

    @Autowired
    private CoordinadorService coordinadorService;

    @GetMapping
    public List<Coordinador> getAllCoordinadores() {
        return coordinadorService.getAllCoordinadores();
    }

    @PostMapping
    public Coordinador createCoordinador(@RequestBody Coordinador coordinador) {
        return coordinadorService.saveCoordinador(coordinador);
    }

    @GetMapping("/{id}")
    public Coordinador getCoordinadorById(@PathVariable Long id) {
        return coordinadorService.getCoordinadorById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCoordinador(@PathVariable Long id) {
        coordinadorService.deleteCoordinador(id);
    }
}
