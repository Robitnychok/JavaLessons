package lesson26_Input_Output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileInputExample {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("C:\\Users\\Sofia\\IdeaProjects\\zwskij lern 2\\article.txt", StandardCharsets.UTF_8);


        while(fileReader.ready()){
            char read = (char) fileReader.read();
            System.out.print(read);
        }



    }
}
