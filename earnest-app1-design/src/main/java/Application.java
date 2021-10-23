import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Application extends javafx.application.Application {
    @Override
        public void start(Stage stage) throws Exception{
            Parent root =
                    FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TodoListManager.fxml")));
            Scene scene = new Scene(root);
            stage.setTitle("Todo List Manager");
            stage.setScene(scene);
            stage.show();
        }

        public static void main(String[] args) {
            launch(args);
        }
    }
