package br.com.profdinho.teste;

import br.com.profdinho.dao.UsuarioDAO;
import br.com.profdinho.model.Usuario;

public class TestaUsuario {
    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuario = new Usuario();
        usuario.setNome("Dinho");
        usuario.setCelular("11999999999");
        usuario.setEmail("prof.dinho.ti@gmail.com");
        usuario.setSenha("123456");
        usuarioDAO.adicionaUsuario(usuario);
    }
    
}
