package layout;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Quadrado extends Rectangle {

    private static int i = 0;

    private String[] cores = {
            "#C33C5E", "#39AAC6", "#28D79A",
            "#FB750E", "#6657A8", "#F9060E"
    };

    public Quadrado() {
        this(100);
    }

    public Quadrado(int tamanho) {

        setWidth(tamanho);
        setHeight(tamanho);

        setFill(Color.web(cores[i]));

        i++;
        if(i == 6) i = 0;
    }

}
