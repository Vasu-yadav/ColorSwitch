package sample;

import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;

public class HomeScreen implements Initializable {
    @FXML
    private Circle c1, c2;
    @FXML
    private Button play_btn;
    @FXML
    private StackPane parentPane;
    @FXML
    private Pane PaneRoot;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setRotate(c1,true,-360,10);
        setRotate(c2,true,360,10);
    }

    public void startgame(ActionEvent event) throws IOException
    {
        Parent gameview = FXMLLoader.load(getClass().getResource("gameview.fxml"));
        Scene gameviewscene =  play_btn.getScene();
        gameview.translateYProperty().set(gameviewscene.getHeight());
        parentPane.getChildren().add(gameview);
        Timeline timeline = new Timeline();
        KeyValue kv = new KeyValue(gameview.translateYProperty(), 0, Interpolator.EASE_IN);
        KeyFrame kf = new KeyFrame(Duration.seconds(1), kv);
        timeline.getKeyFrames().add(kf);
        timeline.setOnFinished(event1 -> {
            parentPane.getChildren().remove(PaneRoot);
        });
        timeline.play();

    }

    public static void setRotate (Circle c, boolean reverse, int angle, int duration )
    {
        RotateTransition rt = new RotateTransition(Duration.seconds(duration), c);
        rt.setAutoReverse(reverse);
        rt.setByAngle(angle);
        rt.setDelay(Duration.seconds(0));
        rt.setRate(3);
        rt.setCycleCount(Animation.INDEFINITE);
        rt.play();
    }


}
