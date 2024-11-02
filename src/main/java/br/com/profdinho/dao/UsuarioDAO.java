/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.profdinho.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
    
}
