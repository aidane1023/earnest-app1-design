import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;


class ApplicationTest {
    @Test
    void test_newListButton() {
        //Test for calling map builder if no previous list have been made
        //Will use and assert not null on a temp map made from builder

        Directory directory;
        directory = new Directory();
        HashMap<Integer, String[]>temp = directory.buildMap();

        assertNotNull(temp);
    }
}