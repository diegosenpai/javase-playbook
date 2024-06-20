package ec.com.orion.learn.javase.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class AccessFileTestDrive {

    private static final String path = "D:/dev/java-se/playbook/src/main/resources/demo.txt";

    public static void main(String[] args) throws IOException {
        Path somePath = Path.of(path);
        if(isReadableFile(somePath)){
            String content = Files.readString(somePath);
            System.out.println(content);
        }else{
            System.out.println("Problem with the file");
        }

    }

    public static boolean isReadableFile(Path aPath){
        return Files.isRegularFile(aPath) && Files.isReadable(aPath);
    }

}

