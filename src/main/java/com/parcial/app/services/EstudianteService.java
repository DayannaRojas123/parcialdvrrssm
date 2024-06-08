package com.parcial.app.services;

import com.parcial.app.variables.Estudiante;
import com.parcial.app.repositories.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    public List<Estudiante> getAllEstudiantes() {
        return estudianteRepository.findAll();
    }

    public Estudiante saveEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    public Estudiante getEstudianteById(Long id) {
        return estudianteRepository.findById(id).orElse(null);
    }

    public void deleteEstudiante(Long id) {
        estudianteRepository.deleteById(id);
    }

    public Estudiante findByNombre(String nombre) {
        return estudianteRepository.findByNombre(nombre);
    }
}
