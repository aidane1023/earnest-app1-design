import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class TodoListTest {
    @Test
    void test_saveContents() { //Test will fail because no code logic for assignment in base code
        //Test that todolist array is created and saved to map
        //Will use an assertEquals for the string[] at map index and the temp array

        Directory directory;
        directory = new Directory();

        String[] tempTodoList = {"Temp", "array", "for", "test", "purposes"};
        //Use a function call of saveContents
        //Using the temp variables as inputs, saveContents will make strings into an array component
        //Save Item will update array
        HashMap<Integer,String[]> tempMap = TodoList.saveContents(directory.todoList);
        tempMap.put(0,tempTodoList);

        assertArrayEquals(tempMap.get(0), tempTodoList);
    }

    @Test
    void test_editItem() { //Will fail due to lack of logic in base code
        //Test that if item is created and saved to array, returns edited array
        //Will use an assertEquals for the string at array index and the temp item

        TodoList todolist;
        todolist = new TodoList();

        String tempItem = "Temp item for test purposes";
        //Use a function call of saveItem
        //Using the temp variables as inputs, saveItem will make strings into an array component
        //Save Item will update array
        String[] tempArray = Item.saveItem(todolist.items);
        todolist.items = tempArray;

        assertArrayEquals(tempArray, todolist.items);
    }

    @Test
    void test_deleteItem() { //Will fail due to lack of logic in base code
        //Test that if item is deleted from normal array
        //Will use an assertEquals for the string at array index and the temp item

        TodoList todolist;
        todolist = new TodoList();

        String tempItem = "Temp item for test purposes";
        //Test that clearing contents works
        todolist.items[0] = tempItem;
        todolist.items[0] = "";

        assertNotEquals(tempItem, todolist.items[0]);
    }
}