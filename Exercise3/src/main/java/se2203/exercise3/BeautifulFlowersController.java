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
    @FXML
    private Label nameLabel;
    @FXML
    private Label emailLabel;

    // ADD LINES FOR TASK #3 HERE
    // Declare private fields for the images
    private Image rose;
    private Image callaLily;
    private Image canna;
    private Image bleedingHeart;
    private Image cherryBlossom;
    // Initialize method
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        rose = new Image(getClass().getResource("Rose.gif").toExternalForm());
        callaLily = new Image(getClass().getResource("Calla Lily.gif").toExternalForm());
        canna = new Image(getClass().getResource("Canna.gif").toExternalForm());
        bleedingHeart = new Image(getClass().getResource("Bleeding Heart.gif").toExternalForm());
        cherryBlossom = new Image(getClass().getResource("Cherry Blossom.gif").toExternalForm());
    }
    public void roseRadioButtonListener() {
        flowersImageView.setImage(rose);
        flowersNote.setText("This beautiful flower and symbol of love belongs the genus Rosa. The family name of this \n" +
                "flower is Rosaceae and it contains different other species in almost all parts of the world. The \n" +
                "flower of rose vary in size from each other depending upon the species to which they belong. \n" +
                "A large number of species of this flower are found in different parts of Asia. ");
    }

    public void callaLilyRadioButtonListener() {
        flowersImageView.setImage(callaLily);
        flowersNote.setText("One simple and common name of this beautiful flower is arum lily and this flowering plant \n" +
                "belongs to the family known as Araceae. This flowering plant is grown well in areas which \n" +
                "have reasonable rainfall and moderate temperatures. ");
    }

    public void cannaRadioButtonListener() {
        flowersImageView.setImage(canna);
        flowersNote.setText("This beautiful flowering plant belongs to a genus that contain around 10 species and its family \n" +
                "is known as Cannaceae. This flower plant also provides large quantity of starch which is \n" +
                "further used for different purposes. This flower is mostly found in tropical regions of the \n" +
                "world. The flowers of this plant have three sepals and three petals. ");
    }

    public void bleedingHeartRadioButtonListener() {
        flowersImageView.setImage(bleedingHeart);
        flowersNote.setText("The bleeding heart flower belongs to the family known as Papaveraceae. This heart shaped \n" +
                "flower is famous all over the world due to its unique beauty and is found in great numbers in \n" +
                "Siberia and China. Blooming season of this flower starts in spring when there spread beautiful \n" +
                "pink heart-shaped flowers in gardens. Lady-in-a-bath is also a common name of this flower. ");
    }

    public void cherryBlossomRadioButtonListener() {
        flowersImageView.setImage(cherryBlossom);
        flowersNote.setText("Cherry blossom, a beautiful flowering plant is found in different parts of the world including \n" +
                "the Northern Hemisphere. It is found in those areas which have moderate climate. All species \n" +
                "of this flowering plant do not produce cherries as there are special species of this flower that \n" +
                "produce edible cherries. ");
    }

    @FXML
    public void aboutMeClickHandler() {
        if (aboutMe.isExpanded()) {
            nameLabel.setText("Name: Asil Abdul Azeez");
            emailLabel.setText("Email: aabdu48@uwo.ca");
            aboutMe.setPrefHeight(60);
        } else {
            aboutMe.setPrefHeight(25);
        }
    }

    // Repeat and modify the above handler for the rest of the other flowers.

}