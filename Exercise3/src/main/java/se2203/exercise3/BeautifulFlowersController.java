package se2203.exercise3;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.net.URL;
import java.util.ResourceBundle;

public class BeautifulFlowersController implements Initializable {
    @FXML
    private ImageView flowersImageView;
    @FXML
    private Label flowersNote;
    @FXML
    private RadioButton roseRadioButton;
    @FXML
    private RadioButton callaLilyRadioButton;
    @FXML
    private RadioButton cannaRadioButton;
    @FXML
    private RadioButton bleedingHeartRadioButton;
    @FXML
    private RadioButton cherryBlossomRadioButton;
    @FXML
    private TitledPane aboutMe;

    // ADD LINES FOR TASK #3 HERE
    // Declare private fields for the images

    // Initialize method
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // ADD LINES FOR TASK #3 HERE
        // Load the image files in the intialize method

    }
    public void roseRadioButtonListener() {

        // ADD THE LINES FOR TASK #3 HERE
        // If this radio button is selected,
        // display image and data for Rose.

    }

    // Repeat and modify the above handler for the rest of the other flowers.

}