package edu.proyectoApi.repositorios;

import edu.proyectoApi.modelos.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<Rol, Long> {
    Rol findByNombre(String nombre);
}
