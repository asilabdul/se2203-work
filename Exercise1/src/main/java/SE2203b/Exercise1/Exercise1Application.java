package SE2203b.Exercise1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.page.AppShellConfigurator;

@SpringBootApplication
@StyleSheet("styles.css")
public class Exercise1Application implements AppShellConfigurator {

    public static void main(String[] args) {
        SpringApplication.run(Exercise1Application.class, args);
    }
}
