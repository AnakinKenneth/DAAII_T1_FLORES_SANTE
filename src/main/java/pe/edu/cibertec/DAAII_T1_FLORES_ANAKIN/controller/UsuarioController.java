package pe.edu.cibertec.DAAII_T1_FLORES_ANAKIN.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.DAAII_T1_FLORES_ANAKIN.model.bd.Usuario;
import pe.edu.cibertec.DAAII_T1_FLORES_ANAKIN.repository.UsuarioRepository;
import pe.edu.cibertec.DAAII_T1_FLORES_ANAKIN.service.UsuarioService;

import java.util.List;

@Controller
public class UsuarioController {
    private UsuarioService usuarioService;
    private UsuarioRepository usuarioRepository;
    @GetMapping("/usuario")
    public String frmMantUsuario(Model model){
        model.addAttribute("listaUsuarios",
                usuarioService.listarUsuario());
        List<Usuario> usuarios = usuarioRepository.findAll();
        model.addAttribute("usuarios", usuarios);
        return "usuarios";
    }

}
