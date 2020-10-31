package Controller;

import Model.Model;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.awt.*;

public class Controller implements EventHandler<ActionEvent> {

    @FXML
    private Button btnMiembro1;
    @FXML
    private Label titleMiembro1;
    @FXML
    private Label textMiembro1;

    Model miembro1 = new Model("Miembro 1:", "José María Muñoz Quijada");

    public void initialize() {
        btnMiembro1.setOnAction(this);
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        if((Button)actionEvent.getSource() == btnMiembro1) {
            titleMiembro1.setText(miembro1.getTitle());
            textMiembro1.setText(miembro1.getMiembro());
        }
    }
}
