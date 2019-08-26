/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmlanches1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jenif
 */
public class P32CadastrarController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private void cadastrar(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Cadastrar.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
     }  
    
    @FXML
    private void escolherlanche(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("EscolherFood.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    public void informacao() {
            Alert info = new Alert(Alert.AlertType.INFORMATION);
            ButtonType ok = new ButtonType("OK");
            info.setTitle("Diálogo de informação");
            info.setHeaderText("Cadastro realizado com sucesso!!!");
            info.show();
//            info.getButtonTypes().setAll(ok);
//            info.showAndWait().ifPresent(b -> {
//                if(b == ok){
//                    FXMLLoader loader = new FXMLLoader(getClass().getResource("EscolherFood.fxml"));
//                    try {
//                        Parent root = loader.load();
//                    } catch (IOException ex) {
//                        Logger.getLogger(P32CadastrarController.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//
//                } 
//            });
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
