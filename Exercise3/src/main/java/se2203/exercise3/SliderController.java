package se2203.exercise3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class SliderController {

    @FXML
    private Label celsiusLabel;

    @FXML
    private Slider slider;

    @FXML
    private Label fahrenheitLabel;

    @FXML
    void updateLabel() {
        celsiusLabel.setText(String.format("%.1f", slider.getValue()));
        double fahrenheit = (9.0 / 5.0) * slider.getValue() + 32;
        fahrenheitLabel.setText(String.format("%.1f", fahrenheit));
    }

}
