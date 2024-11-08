package edu.proyectoApi.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.proyectoApi.modelos.Usuario;
import edu.proyectoApi.servicios.UsuarioService;

@Controller
public class RegistroController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/registro")
    public String showRegistrationForm() {
        return "registro";
    }

    @PostMapping("/registro")
    @ResponseBody
    public String registerUser(@RequestParam("username") String username,
                               @RequestParam("email") String email,
                               @RequestParam("password") String password) {
        System.out.println("Datos recibidos del formulario: " + username + ", " + email + ", " + password);

        Usuario usuario = new Usuario();
        usuario.setUsername(username);
        usuario.setEmail(email);
        usuario.setPassword(password);

        System.out.println("Datos del objeto Usuario: " + usuario.getUsername() + ", " + usuario.getEmail() + ", " + usuario.getPassword());

        usuarioService.registrarUsuario(usuario);
        return "success";
    }
}
