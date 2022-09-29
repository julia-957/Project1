package dk.javahandson.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.*;

public class MainController {
    @FXML
    private Label label;
    @FXML
    private TextField txtInput;

    @FXML
    private void clickButton(ActionEvent actionEvent){
        //System.out.println("You clicked a button!");

        label.setText(txtInput.getText());
        txtInput.setOpacity(0.5);

        Stage stage = (Stage) label.getScene().getWindow();
        stage.setTitle(txtInput.getText());
    }
}
