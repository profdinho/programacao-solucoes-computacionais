package br.com.profdinho.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import br.com.profdinho.jdbc.ConexaoBD;
import br.com.profdinho.model.Usuario;

/**
 *
 * @author dinho
 */
public class UsuarioDAO {
    private final Connection conexao;
    
    public UsuarioDAO() {
            this.conexao = new ConexaoBD().getConnection();
    }
    
    public void adicionaUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuario " +
                    "(nome, celular, email, senha) " +
                    "VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getCelular());
            ps.setString(3, usuario.getEmail());
            ps.setString(4, usuario.getSenha());
            ps.execute();
            ps.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<Usuario> getLista() {
        List<Usuario> usuarios = new ArrayList<>();
        try {
            String sql = "SELECT * FROM usuario";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setCelular(rs.getString("celular"));
                usuario.setEmail(rs.getString("email"));
                usuarios.add(usuario);
            }
            rs.close();
            ps.close();
            return usuarios;
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public boolean login(String usuario, String senha) {
        String sql = "SELECT * FROM usuario WHERE nome = ?"
                + " AND senha = ?";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, senha);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
            else {
                return false;
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
}
