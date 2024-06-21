package ec.com.orion.learn.javase.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class WritingToFileTestDrive {

    private static final String PATH = "D:/dev/java-se/playbook/src/main/resources";


    public static void main(String[] args) throws IOException {
        


        Path appendPath = Path.of(String.format("%s/%s",PATH,"list.txt"));
        List<String> names = Arrays.asList("diego","emi");
        writeListOfItems(appendPath, names);

    }


    public static void writingToFileWithCreateNewOption(Path somePath) throws IOException{
        Files.writeString(somePath, "demo string", StandardOpenOption.CREATE_NEW);
    }

    public static void createNewFilePerInvocation(String path) throws IOException{
        Path content = Path.of(String.format("%s/writeToMe-%s",path,Instant.now().toString().replace(":", "-")));
        Files.writeString(content,"die another day\\n");
    }

    public static void appendTextToAnExistingFile(Path path, String content) throws IOException{
        Files.writeString(path,content,StandardOpenOption.APPEND);
    }

    public static void emptyAFile(Path path) throws IOException{
        Files.writeString(path,"");

    }

    public static void writeListOfItems(Path somePath, List<String> lines) throws IOException{
        StringBuilder sb = new StringBuilder();
        for(String line : lines){
            sb.append(String.format("%s\n",line));
        }
        Files.writeString(somePath, sb.toString());
    }
}
