package se2203.exercise1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

import java.net.URL;
import java.util.ArrayList;
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
        selectedItem.setText(String.valueOf(lvItem.getSelectionModel().getSelectedItems()));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lvItem.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        ArrayList<String> nameList = new ArrayList<>(){{ add("Poodle"); add("Great Dane"); add("Labrador"); add("Terrier"); }};
        ObservableList<String> nameObservableList = FXCollections.observableArrayList(nameList);
        lvItem.setItems(nameObservableList);
    }
}
