package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexao.Conexao;
import entidades.Produto;

public class ProdutoDAO {
    public List<Produto> listar() {
        List<Produto> produtos = new ArrayList<>();

        try (Connection con = new Conexao().getConnection();
             PreparedStatement stm = con.prepareStatement("SELECT * FROM produto");
             ResultSet rs = stm.executeQuery()) {

            while (rs.next()) {
                Produto produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setPreco(rs.getDouble("preco"));
                
                produtos.add(produto);
            }

            rs.close();
            stm.close();
            con.close();

        } catch (SQLException e) {
            throw new RuntimeException("Error while fetching products from the database", e);
        }

        return produtos;
    }
}
