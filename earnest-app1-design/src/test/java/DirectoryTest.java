import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class DirectoryTest {
    @Test
    void test_editTodoList() { //Will fail due to lack of logic in base code
        //Test that if item is created and saved to array, returns edited array
        //Will use an assertEquals for the string at array index and the temp item

        Directory directory;
        directory = new Directory();

        String[] tempTodoList = {"Temp", "array", "for", "test", "purposes"};
        //Use a function call of saveContents
        //Using the temp variables as inputs, saveContents will make strings into an array component
        //Save array will update map
        HashMap<Integer,String[]> tempMap = TodoList.saveContents(directory.todoList);
        tempMap.put(0,tempTodoList);

        assertArrayEquals(tempMap.get(0), tempTodoList);
    }

    @Test
    void test_removeTodoList() { //Will fail due to lack of logic in base code
        //Test that if item is deleted from normal array
        //Will use an assertEquals for the string at array index and the temp item

        Directory directory;
        directory = new Directory();

        String[] tempTodoList = {"Temp", "array", "for", "test", "purposes"};
        //Use a function call of saveContents
        //Using the temp variables as inputs, saveContents will make strings into an array component
        //Save Item will update array
        HashMap<Integer,String[]> tempMap = TodoList.saveContents(directory.todoList);
        tempMap.put(0,tempTodoList);

        //Clear contents in map
        tempMap.put(0,new String[]{""});

        assertEquals(tempMap.get(0), "");
    }

    @Test
    void test_buildMap() {
        //Test for calling map builder if no previous list have been made
        //Will use and assert not null on a temp map made from builder

        Directory directory;
        directory = new Directory();
        HashMap<Integer, String[]>temp = directory.buildMap();

        assertNotNull(temp);
    }

}