import java.util.HashMap;

public class Directory extends Application {
    //Declare maps for storing user data
    private HashMap<String, String[]> todoList;
    private HashMap<String, String[]> selection;

    public void addList() {
        //Open TodoListEditor page from fxml files
    }

    public void deleteList(HashMap<String, String[]> selection) {
        //Remove selected items from todoList Map.
        //Update todoList Map and clear selection Map
    }

    public void editList(HashMap<String, String[]> selection) {
        //Run an if/else, must have one list selected
        //If condition is met, open selection in TodoListEditor fxml page
        //Else throw error message (requires selection of one list)
    }

    public void saveList(HashMap<String, String[]> selection) {
        //Request name for file
        //Request location for file
        //Save contents of each array from selection map to a txt file with user provided location and name
    }
}
