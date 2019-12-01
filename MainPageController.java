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

/**
 * FXML Controller class
 *
 * @author sayg9
 */
public class MainPageController implements Initializable {

   @FXML
    private Label lblTitle;
    @FXML
    private ImageView imgBranch;
    @FXML
    private ImageView imgShort;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void AllBranches(MouseEvent event) throws IOException {
        imgBranch.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("AllBranches.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle("All The Branches");
        stage.setScene(scene);
        stage.show();
    }

   
    @FXML
    private void shortPath(MouseEvent event) throws IOException {
        imgShort.getScene().getWindow().hide();
        //Parent root = FXMLLoader.load(getClass().getResource("ShortPath.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("shortPath_.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle("Short Path");
        stage.setScene(scene);
        stage.show();
    }
}
