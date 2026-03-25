package com.antonio.aulas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/frmProduto.fxml"));
            Scene scene = new Scene(loader.load());
            stage.setTitle("Cadastro de produto");
            stage.setScene(scene);
            stage.setMaximized(true);
            stage.show();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    void main(){
        launch();
    }
}
