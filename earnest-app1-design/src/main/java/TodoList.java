/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 aidan earnest
 */

import java.util.HashMap;

public class TodoList extends Directory {
    private String name;
    private String[] items;
    private String selectedItem;

    public void addItem(String[] items) {
        //Open TodoListItem page from fxml files
    }
    public String[] deleteItem(String[] items, String selectedItem) {
        //Remove selectedItem from items string
        //Clear selectedItem String

        //return updated items array
        return null;
    }

    public String[] editItem(String[] items, String selectedItem) {
        //Open TodoListItem page from fxml files

        //Return any changes made to items array
        return null;
    }

    public HashMap<Integer, String[]> saveContents(HashMap<Integer, String[]> todoList) {
        //Use map from superclass
        //Save to same index as superclass
        //Update all items of array that were changed

        //Return updated map to todoList
        return null;
    }
}
