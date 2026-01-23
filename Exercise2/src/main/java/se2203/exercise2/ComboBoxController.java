package se2203.exercise2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class ComboBoxController implements Initializable {
    @FXML
    private Label nameLabel;

    @FXML
    private ComboBox<String> nameComboBox;

    @FXML
    void comboBoxListener() {
        nameLabel.setText("Welcome\n" + nameComboBox.getSelectionModel().getSelectedItem() + "!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nameComboBox.getItems().addAll("Will", "Megan", "Amanda", "Tyler");
    }

}
