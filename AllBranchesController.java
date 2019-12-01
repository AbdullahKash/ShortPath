/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system_delivrey;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 * FXML Controller class
 *
 * @author sayg9
 */
public class AllBranchesController implements Initializable {

    @FXML
    private Label lblTitle;
    @FXML
    private ImageView imageBack;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BackMain(MouseEvent event) throws IOException {
        imageBack.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle("Main Page");
        stage.setScene(scene);
        stage.show();
    }
    
}
