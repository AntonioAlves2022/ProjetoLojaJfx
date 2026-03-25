package com.antonio.aulas.dao;

import com.antonio.aulas.models.Produto;
import com.antonio.aulas.utils.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAOImpl implements ProdutoDAO{
    @Override
    public void salvar(Produto produto) {
        String sql = "INSERT INTO produto "
                +"(nome, preco, estoque) "
                +"values(?,?,?)";
        try{
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setDouble(3, produto.getEstoque());
            stmt.executeUpdate();
        }catch (SQLException ex){
            throw new RuntimeException(ex);
        }
    }

    @Override
    public List<Produto> listar() {
        List<Produto> produtos = new ArrayList<>();
        String sql = "SELECT * FROM produto ORDER BY nome";
        try{
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                Produto p = new Produto();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setPreco(rs.getDouble("preco"));
                p.setEstoque(rs.getDouble("estoque"));
                produtos.add(p);
            }
        }catch (SQLException ex){
            throw new RuntimeException(ex);
        }
        return produtos;
    }
}
