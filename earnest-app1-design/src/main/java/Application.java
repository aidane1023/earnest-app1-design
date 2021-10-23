import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws Exception {
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

    public void newListButton() {
        //Open TodoListEditor page from fxml files

        //Create new String array and add to map at next index
        //If no previous list exist, make new map
        //In case on no list call builder function from Directory
    }

    public void existingListButton() {
        //Open TodoListDirector page from fxml files
    }
}
