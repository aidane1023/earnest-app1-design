import java.util.HashMap;

public class TodoList extends Directory {
    private String name;
    private String[] items;
    private String selectedItem;

    public void addItem(String[] items) {
        //Open TodoListItem page from fxml files
    }
    public void deleteItem(String[] items, String selectedItem) {
        //Remove selectedItem from items string
        //Clear selectedItem String
    }

    public void editItem(String[] items, String selectedItem) {
        //Open TodoListItem page from fxml files
    }

    public void saveContents(HashMap<String, String[]> todoList) {
        //Use map from superclass
        //Save to same index as superclass
        //Update all items of array that were changed
    }
}
