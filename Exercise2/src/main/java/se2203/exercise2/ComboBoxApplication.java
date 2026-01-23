package se2203.exercise2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ComboBoxApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ComboBoxApplication.class.getResource("ComboBox-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 310, 310);
        stage.setTitle("ComboBox");
        stage.setScene(scene);
        stage.show();
    }
}
