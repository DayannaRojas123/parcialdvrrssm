package com.parcial.app.repositories;

import com.parcial.app.variables.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
    Profesor findByNombre(String nombre);
}
