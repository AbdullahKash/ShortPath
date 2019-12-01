/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system_delivrey;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

/**
 * FXML Controller class
 *
 * @author sayg9
 */
public class AddBrancheController implements Initializable {

    @FXML
    private Button btnAdd;
    @FXML
    private TextField textName;
    @FXML
    private TextField textWeight;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ImageView imageview =  new ImageView( new Image(getClass().getResourceAsStream("image/five.png")));
        imageview.setFitWidth(30);
        
        
    }

    @FXML
    private void Add(ActionEvent event) throws IOException {

        btnAdd.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("ShortPath.fxml"));
         
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle("Short Path");
        stage.setScene(scene);
        stage.show();
        
    }

}
