package com.parcial.app.services;

import com.parcial.app.variables.Profesor;
import com.parcial.app.repositories.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorService {

    @Autowired
    private ProfesorRepository profesorRepository;

    public List<Profesor> getAllProfesores() {
        return profesorRepository.findAll();
    }

    public Profesor saveProfesor(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    public Profesor getProfesorById(Long id) {
        return profesorRepository.findById(id).orElse(null);
    }

    public void deleteProfesor(Long id) {
        profesorRepository.deleteById(id);
    }

    public Profesor findByNombre(String nombre) {
        return profesorRepository.findByNombre(nombre);
    }
}
