import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest { //Due to no programming logic in base code test will fail
    @Test
    void test_saveItem() {
        //Test that item is created and saved to array
        //Will use an assertEquals for the string at array index and the temp item

        TodoList todolist;
        todolist = new TodoList();

        String tempItem = "Temp item for test purposes";
        //Use a function call of saveItem
        //Using the temp variables as inputs, saveItem will make strings into an array component
        //Save Item will update array
        String[] tempArray = Item.saveItem(todolist.items);

        assertEquals(tempArray[0], tempItem);
    }

}