package se2203.exercise1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ListViewApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ListViewApplication.class.getResource("ListView-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 250, 400);
        stage.setTitle("ListView");
        stage.setScene(scene);
        stage.show();
    }
}
