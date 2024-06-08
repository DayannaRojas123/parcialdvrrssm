package com.parcial.app.repositories;

import com.parcial.app.variables.Coordinador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoordinadorRepository extends JpaRepository<Coordinador, Long> {
    Coordinador findByNombre(String nombre);
}
