package com.antonio.aulas.services;

import com.antonio.aulas.dao.ProdutoDAO;
import com.antonio.aulas.dao.ProdutoDAOImpl;
import com.antonio.aulas.models.Produto;

import java.util.List;

public class ProdutoService {
    private ProdutoDAO dao = new ProdutoDAOImpl();

    public void salvar(Produto produto){
        if(produto.getNome().isEmpty()){
            throw new IllegalArgumentException("Nome deve ser informado");
        }
        if(produto.getPreco() <= 0){
            throw new IllegalArgumentException("Preço deve ser um valor maior do que zero!");
        }
        dao.salvar(produto);
    }

    public List<Produto> listar(){
        return dao.listar();
    }

}
