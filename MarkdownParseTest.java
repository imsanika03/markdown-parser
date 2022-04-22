

import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*; 
public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test 
    public void checkParseTest1() throws IOException{
        ArrayList<String> expected = new ArrayList<>(); 
        expected.add("https://something.com"); 
        expected.add("some-page.html"); 
       

        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content); 
        
        assertEquals(expected, links);
    }

    @Test 
    public void checkParseTest2() throws IOException{
        ArrayList<String> expected = new ArrayList<>(); 
        expected.add("https://something.com"); 
        expected.add("some-thing.html"); 
       

        Path fileName = Path.of("test2-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content); 
        
        assertEquals(expected, links);
    }

    @Test 
    public void checkParseTest3() throws IOException{
        ArrayList<String> expected = new ArrayList<>(); 
        expected.add("https://something.com"); 
        expected.add("https://something.com"); 
        expected.add("some-thing.html"); 
        expected.add("https://something.com"); 
        expected.add("some-thing.html"); 
        expected.add("https://something.com"); 
        expected.add("some-thing.img"); 
       

        Path fileName = Path.of("test3-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content); 
        
        assertEquals(expected, links);
    }

    @Test 
    public void checkParseTest4() throws IOException{
        ArrayList<String> expected = new ArrayList<>(); 
        expected.add("https://something.com"); 
        expected.add("https://something.com"); 
        expected.add("some-thing.html"); 
        expected.add("https://something.com"); 
        expected.add("some-thing.html"); 
        expected.add("https://something.com"); 
        expected.add("some-thing.html"); 
       

        Path fileName = Path.of("test4-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content); 
        
        assertEquals(expected, links);
    }


}
