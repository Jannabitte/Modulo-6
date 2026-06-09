package cl.veterinaria.vetsecuritycare.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.stream.Collectors;

@Controller
public class HomeController {

    @GetMapping("/")
    public String publicPage() {
        return "publico";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/bienvenida")
    public String bienvenida(Authentication authentication, Model model) {
        cargarDatosUsuario(authentication, model);
        return "bienvenida";
    }

    @GetMapping("/usuario")
    public String usuario(Authentication authentication, Model model) {
        cargarDatosUsuario(authentication, model);
        return "usuario";
    }

    @GetMapping("/admin")
    public String admin(Authentication authentication, Model model) {
        cargarDatosUsuario(authentication, model);
        return "admin";
    }

    @GetMapping("/acceso-denegado")
    public String accesoDenegado() {
        return "acceso-denegado";
    }

    private void cargarDatosUsuario(Authentication authentication, Model model) {
        String roles = authentication.getAuthorities()
                .stream()
                .map(GrantedAuthority::getAuthority)
                .filter(rol -> rol.startsWith("ROLE_"))
                .collect(Collectors.joining(", "));

        model.addAttribute("usuario", authentication.getName());
        model.addAttribute("roles", roles);
    }
}