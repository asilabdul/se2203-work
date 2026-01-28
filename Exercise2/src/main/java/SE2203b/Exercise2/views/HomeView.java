package SE2203b.Exercise2.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.NativeLabel;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class HomeView extends VerticalLayout {
    //title signifying which page this class is on
    private H1 title = new H1("Profile");
    //label telling current section
    private NativeLabel currentSection = new NativeLabel("Current Section: Profile");

    public HomeView() {
        //initializing all buttons for the page
        Button home = new Button("Home");
        Button profile = new Button("Profile");
        Button help = new Button("Help");
        //organizing buttons from left to right in order
        HorizontalLayout menu = new HorizontalLayout(home, profile, help);
        //set the menu to the width of the full screen so it can scale properly
        menu.setWidthFull();
        //align the menu items properly
        menu.setJustifyContentMode(JustifyContentMode.START);
        menu.setAlignItems(FlexComponent.Alignment.CENTER);
        //add the components to the webpage from top to bottom in order
        add(menu, currentSection, title);
        //padding for the page so it is organized and easy to look at
        setPadding(true);
        setSpacing(true);
        //spacing for the menu component
        menu.setSpacing(true);

    }
}
