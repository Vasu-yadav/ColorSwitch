package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PauseMenu implements Initializable {
    @FXML
    Circle cA,cR,cG,cY;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        HomeScreen.setRotate(cA,false,360,5);
        HomeScreen.setRotate(cR,false,-360,5);
        HomeScreen.setRotate(cG,false,360,5);
        HomeScreen.setRotate(cY,false,-360,5);
    }

    public void exitHome(ActionEvent event) throws IOException {
        Parent gameview = FXMLLoader.load(getClass().getResource("HomeScreen.fxml"));
        Scene gameviewscene = new Scene(gameview);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(gameviewscene);
        window.show();
    }
    public void RestartGame(ActionEvent event) throws IOException {
        Parent gameview = FXMLLoader.load(getClass().getResource("gameview.fxml"));
        Scene gameviewscene = new Scene(gameview);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(gameviewscene);
        window.show();
    }


}
