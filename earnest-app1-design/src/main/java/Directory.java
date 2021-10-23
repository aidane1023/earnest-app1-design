import java.util.HashMap;

public class Directory extends Application {
    //Declare maps for storing user data
    private HashMap<Integer, String[]> todoList;
    private HashMap<Integer, String[]> selection;

    public void addList() {
        //Create new String array and add to map at next index
        //In case of no previous list, run builder

        //Open TodoListEditor page from fxml files
    }

    public void removeList(HashMap<Integer, String[]> todoList, HashMap<Integer, String[]> selection) {
        //Remove selected items from todoList Map.
        //Update todoList Map and clear selection Map
    }

    public HashMap<String, String[]> editList(HashMap<Integer, String[]> todoList, HashMap<Integer, String[]> selection) {
        //Run an if/else, must have one list selected
        //If condition is met, open selection in TodoListEditor fxml page
        //Else throw error message (requires selection of one list)

        //return updated todoList map
        return null;
    }

    public void saveList(HashMap<Integer, String[]> selection) {
        //Request name for file
        //Read in name
        //Request location for file
        //Read in location
        //Save contents of each array from selection map to a txt file with user provided location and name
    }

    public void buildMap() {
        //build map to contain all todolist for user (up to 256)
        HashMap<Integer,String> todoList = new HashMap<Integer,String>();
    }
}
