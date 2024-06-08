package com.parcial.app.services;

import com.parcial.app.variables.Coordinador;
import com.parcial.app.repositories.CoordinadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoordinadorService {

    @Autowired
    private CoordinadorRepository coordinadorRepository;

    public List<Coordinador> getAllCoordinadores() {
        return coordinadorRepository.findAll();
    }

    public Coordinador saveCoordinador(Coordinador coordinador) {
        return coordinadorRepository.save(coordinador);
    }

    public Coordinador getCoordinadorById(Long id) {
        return coordinadorRepository.findById(id).orElse(null);
    }

    public void deleteCoordinador(Long id) {
        coordinadorRepository.deleteById(id);
    }

    public Coordinador findByNombre(String nombre) {
        return coordinadorRepository.findByNombre(nombre);
    }
}
