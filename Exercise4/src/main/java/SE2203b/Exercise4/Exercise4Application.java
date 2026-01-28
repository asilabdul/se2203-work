package SE2203b.Exercise4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.page.AppShellConfigurator;

@SpringBootApplication
@StyleSheet("styles.css")
public class Exercise4Application implements AppShellConfigurator {

    public static void main(String[] args) {
        SpringApplication.run(Exercise4Application.class, args);
    }
}
