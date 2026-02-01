package SE2203b.Exercise5.views;

import com.vaadin.flow.component.ModalityMode;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.NativeLabel;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

import java.lang.annotation.Native;

@Route("")
public class HomeView extends VerticalLayout {

    //title signifying which page this class is on
    private H1 title = new H1("Profile");
    private H1 homeText = new H1("Welcome to my home page");

    //label telling current section
    private NativeLabel currentSection = new NativeLabel("Current Section: Profile");
    private NativeLabel previewLabel = new NativeLabel("Fill in the form and click Preview.");
    private NativeLabel homeLabel = new NativeLabel("My name is Asil Abdul Azeez");

    // Add two textfileds
    private final TextField fullName = new TextField("Name");
    private final EmailField email = new EmailField("Email");

    // Add a ComboBox textfileds
    private final ComboBox<String> favoriteLanguage = new ComboBox<>("Favorite language");

    public HomeView() {

        //initializing all buttons for the page
        Button home = new Button("Home");
        Button profile = new Button("Profile");
        Button help = new Button("Help");
        Button preview = new Button("Preview");
        Button clear = new Button("Clear");

        //organizing buttons from left to right in order
        HorizontalLayout menu = new HorizontalLayout(home, profile, help);
        HorizontalLayout actions = new HorizontalLayout(preview, clear);

        //set the menu to the width of the full screen so it can scale properly
        menu.setWidthFull();

        //align the menu items properly
        menu.setJustifyContentMode(JustifyContentMode.START);
        menu.setAlignItems(FlexComponent.Alignment.CENTER);

        //add the components to the webpage from top to bottom in order
        add(menu, currentSection, title, homeText, homeLabel);
        homeText.setVisible(false);
        homeLabel.setVisible(false);
        //padding for the page so it is organized and easy to look at
        setPadding(true);
        setSpacing(true);

        //spacing for the menu component
        menu.setSpacing(true);

        // Add two textfileds
        fullName.setPlaceholder("e.g. Alice Smith");
        email.setPlaceholder("e.g. alice@example.com");

        // Set the ComboBox values
        favoriteLanguage.setItems("Java", "Kotlin", "Python", "JavaScript");

        // Create a VerticalLayout container
        VerticalLayout formLayout = new VerticalLayout(fullName, email, favoriteLanguage);

        // Click listener for Preview button
        preview.addClickListener(e -> {
            // Check if any of the fields are empty
            if (fullName.isEmpty() || email.isEmpty() || favoriteLanguage.isEmpty()) {
                // If any field is empty, notify the user and return early
                previewLabel.setText("Please fill in all fields.");
                return;
            }

            // If all fields are filled, construct the preview message
            String text = "Name=" + fullName.getValue()
                    + ", Email=" + email.getValue()
                    + ", Favorite Language=" + favoriteLanguage.getValue();
            previewLabel.setText(text);
            Notification.show("Saved (preview updated)"); // common feedback pattern
        });

        // Click listener Clear button
        clear.addClickListener(e -> {
            fullName.clear();
            email.clear();
            favoriteLanguage.clear();
            previewLabel.setText("Fill in the form and click Preview.");
        });

        // Click listener for Home button
        home.addClickListener(e -> {
            currentSection.setText("Current Section: Home");
            title.setText("Home");
            homeText.setVisible(true);
            formLayout.setVisible(false);
            actions.setVisible(false);
            homeLabel.setVisible(true);
            previewLabel.setVisible(false);
        });

        // Click listener for Profile button
        profile.addClickListener(e -> {
            currentSection.setText("Current Section: Profile");
            title.setText("Profile");
            formLayout.setVisible(true);
            previewLabel.setVisible(true);
            homeText.setVisible(false);
            actions.setVisible(true);
        });

        // Click listener for Help button
        help.addClickListener(e -> {
            currentSection.setText("Current Section: Help");
            title.setText("Help");
            formLayout.setVisible(false);
            homeText.setVisible(false);
            actions.setVisible(false);
            previewLabel.setVisible(false);
            homeLabel.setVisible(false);
        });

        // Adding a simple help dialog that has a label and a close button
        Dialog helpDialog = new Dialog();
        VerticalLayout dialogLayout = new VerticalLayout();
        NativeLabel dialogLabel = new NativeLabel("How can I help you?");
        Button dialogClose = new Button("Close", e -> {
            // close the dialog
            helpDialog.close();
        });
        dialogLayout.add(dialogLabel, dialogClose);
        // Prevent users from closing the dialog by clicking outside or pressing Escape
        helpDialog.setCloseOnEsc(false);
        helpDialog.setCloseOnOutsideClick(false);
        // Block all background interaction
        helpDialog.setModality(ModalityMode.STRICT);
        helpDialog.add(dialogLayout);
        // Show Help screen when user clicks Help
        help.addClickListener(e -> {
            helpDialog.open();
        });

        // Set the container format
        formLayout.setWidth("400px");
        formLayout.setAlignItems(FlexComponent.Alignment.STRETCH);
        add(formLayout);
        add(actions);
        add(previewLabel);
    }

}
