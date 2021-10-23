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
            Scene scene = new Scene(root); // attach scene graph to scene
            stage.setTitle("Todo List Manager"); // displayed in window's title ba
            stage.setScene(scene); // attach scene to stage
            stage.show(); // display the stage
        }

        public static void main(String[] args) {
            // create a TipCalculator object and call its start method
            launch(args);
        }
    }
