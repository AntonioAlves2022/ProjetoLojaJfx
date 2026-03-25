package com.antonio.aulas.dao;

import com.antonio.aulas.models.Produto;
import java.util.List;

public interface ProdutoDAO {
    void salvar(Produto produto);
    List<Produto> listar();
}
