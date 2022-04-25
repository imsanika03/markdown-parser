

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
            List<String> expected1 = Arrays.asList("https://something.com", "some-thing.html"); 
        
            Path fileName = Path.of("test-file.md");
            String content = Files.readString(fileName);
            ArrayList<String> links = MarkdownParse.getLinks(content); 
            
            assertEquals(expected1, links);
            

            



       
       
       

       
    }

    @Test 
    public void test2() throws IOException{
        List<String> expected2 = Arrays.asList("https://something.com", "some-page.html"); 

        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content); 
        
        assertEquals(expected2, links);

    }

    @Test 
    public void test3() throws IOException{
        List<String> expected3 = new ArrayList<>();
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content); 
        
        assertEquals(expected3, links);

    }

    @Test 
    public void test4() throws IOException{
        List<String> expected4 = new ArrayList<>(); 
        Path fileName = Path.of("test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content); 
        
        assertEquals(expected4, links);

    }

    @Test 
    public void test5() throws IOException{
        List<String> expected5 = Arrays.asList("page.com"); 
        Path fileName = Path.of("test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content); 
        
        assertEquals(expected5, links);

    }

    @Test 
    public void test6() throws IOException{
        List<String> expected6 = new ArrayList<>(); 
        Path fileName = Path.of("test-file6.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content); 
        
        assertEquals(expected6, links);

    }

    @Test 
    public void test7() throws IOException{
        List<String> expected7 = new ArrayList<>();  
        Path fileName = Path.of("test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content); 
        
        assertEquals(expected7, links);

    }

    @Test 
    public void test8() throws IOException{
        List<String> expected8 = Arrays.asList("a link on the first line"); 
        Path fileName = Path.of("test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content); 
        
        assertEquals(expected8, links);

    }

 


}
