package sample;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

import java.util.Random;

public class Colorball {
        private final Paint[]  colorlist  = {Color.AQUA,Color.RED, Color.GREEN, Color.YELLOW };

    public  Paint setColor() {
        Random rand = new Random();
        int i = rand.nextInt(4);
        return colorlist[i];
    }
}
