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

    private H1 title = new H1("Profile");

    private NativeLabel currentSection = new NativeLabel("Current Section: Profile");

    public HomeView() {
        Button home = new Button("Home");
        Button profile = new Button("Profile");
        Button help = new Button("Help");

        HorizontalLayout menu = new HorizontalLayout(home, profile, help);

        menu.setWidthFull();
        menu.setJustifyContentMode(JustifyContentMode.START);
        menu.setAlignItems(FlexComponent.Alignment.CENTER);

        add(menu, currentSection, title);

        setPadding(true);
        setSpacing(true);

        menu.setSpacing(true);

    }
}
