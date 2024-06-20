package ec.com.orion.learn.javase.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadingSmallFile {

    private static final String path = "D:/dev/java-se/playbook/src/main/resources/demo.txt";
    
    
    
    public static void main(String[] args) throws IOException {

        Path demoPath = Path.of(path);
        System.out.println(readSmallFile(demoPath));
        System.out.println("Another approach");
        List<String> smallFileLineByLine = readSmallFileLineByLine(demoPath);
        System.out.println(smallFileLineByLine);
        
    }

    public static String readSmallFile(Path somePath) throws IOException{
        return Files.readString(somePath);
    }

    public static List<String> readSmallFileLineByLine(Path somePath) throws IOException{
        return Files.readAllLines(somePath);
    }

}
