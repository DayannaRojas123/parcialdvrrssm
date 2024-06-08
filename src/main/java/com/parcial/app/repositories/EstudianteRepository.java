package com.parcial.app.repositories;

import com.parcial.app.variables.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
    Estudiante findByNombre(String nombre);
}
