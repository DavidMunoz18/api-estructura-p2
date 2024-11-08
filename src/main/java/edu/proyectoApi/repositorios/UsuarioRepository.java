package edu.proyectoApi.repositorios;

import edu.proyectoApi.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByUsernameOrEmail(String usernameOrEmail, String email);
}
