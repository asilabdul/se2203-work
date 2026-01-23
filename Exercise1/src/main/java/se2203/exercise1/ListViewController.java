package se2203.exercise1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class ListViewController implements Initializable {
    @FXML
    private Label selectedItem;

    @FXML
    private ListView<String> lvItem;

    @FXML
    private Button listViewBtn;

    @FXML
    void displaySelectedItem() {
        selectedItem.setText(lvItem.getSelectionModel().getSelectedIndex() + "-" + lvItem.getSelectionModel().getSelectedItem());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lvItem.getItems().addAll("Poodle", "Great Dane", "Labrador", "Terrier");
    }
}
