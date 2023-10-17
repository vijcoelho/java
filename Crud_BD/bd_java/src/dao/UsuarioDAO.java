package dao;


import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.Conexao;
import entidades.Usuario;

public class UsuarioDAO {
    
    public void cadastrarUsuario(Usuario usuario) {

        String sql = "INSERT INTO USUARIO (NOME, LOGIN, SENHA, EMAIL) VALUES(?,?,?,?)";

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConnection().prepareStatement(sql);

            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getLogin());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getEmail());

            ps.execute();
            ps.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }  
    }
}
