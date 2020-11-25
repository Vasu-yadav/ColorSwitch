package sample;
import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.util.Duration;


import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Game implements Initializable {
    private Paint color;
    Boolean ballActivate;
    Colorball colorobj = new Colorball();
    TranslateTransition ball_move = new TranslateTransition();
    Ball ballobj;
    @FXML
    Circle ball;
    @FXML
    Text start_text;
    @FXML
    Line start_line;
    @FXML
    private Button  pause_btn;

    private void firstcolor()
    {
       color = colorobj.setColor();
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        firstcolor();
        ball.setFill(color);
    }
    public void startOnclick(ActionEvent event)
    {
        start_line.setOpacity(0);
        start_text.setOpacity(0);
    }

    public void callPause(ActionEvent event) throws IOException {
        Parent pauseview = FXMLLoader.load(getClass().getResource("pauseMenu.fxml"));
        Scene pausescene =  pause_btn.getScene();
    }


}
