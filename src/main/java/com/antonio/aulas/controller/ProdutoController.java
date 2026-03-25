package com.antonio.aulas.controller;

import com.antonio.aulas.models.Produto;
import com.antonio.aulas.services.ProdutoService;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class ProdutoController {
    @FXML private TextField txtId;
    @FXML private TextField txtNome;
    @FXML private TextField txtPreco;
    @FXML private TextField txtEstoque;

    private ProdutoService ps = new ProdutoService();

    @FXML
    public void salvar(){
        Produto prod = new Produto();
        prod.setNome(txtNome.getText());
        prod.setPreco(Double.valueOf(txtPreco.getText()));
        prod.setEstoque(Double.valueOf(txtEstoque.getText()));
        ps.salvar(prod);
        System.out.println("Produto salvo com sucesso!");
    }

}
