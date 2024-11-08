package edu.proyectoApi.servicios;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import edu.proyectoApi.modelos.Rol;
import edu.proyectoApi.modelos.Usuario;
import edu.proyectoApi.repositorios.RolRepository;
import edu.proyectoApi.repositorios.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RolRepository rolRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Usuario registrarUsuario(Usuario usuario) {
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));

        // Asignar rol de usuario por defecto
        Set<Rol> roles = new HashSet<>();
        roles.add(rolRepository.findByNombre("ROLE_USER"));
        usuario.setRoles(roles);

        System.out.println("Datos finales del objeto Usuario antes de guardar: " + usuario.getUsername() + ", " + usuario.getEmail() + ", " + usuario.getPassword());

        return usuarioRepository.save(usuario);
    }

    public Usuario findByUsernameOrEmail(String usernameOrEmail) {
        return usuarioRepository.findByUsernameOrEmail(usernameOrEmail, usernameOrEmail);
    }
}
