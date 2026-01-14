module se2203.exercise3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens se2203.exercise3 to javafx.fxml;
    exports se2203.exercise3;
}