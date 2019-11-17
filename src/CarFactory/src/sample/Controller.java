package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label test1;

    public void sayHello(ActionEvent actionEvent) {
        test1.setText("Hello!");
    }
}
