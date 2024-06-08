package pe.edu.cibertec.DAAII_T1_FLORES_ANAKIN.service;

import pe.edu.cibertec.DAAII_T1_FLORES_ANAKIN.model.bd.Usuario;

import java.util.List;

public interface IUsuarioService {

    Usuario buscarUsuarioXNomUsuario(String nomusuario);
    Usuario guardarUsuario(Usuario usuario);
    void actualizarUsuario(Usuario usuario);
    List<Usuario> listarUsuario();
    Usuario buscarUsuarioXIdUsuario(Integer idusuario);
}
