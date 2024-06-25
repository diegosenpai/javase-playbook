package ec.com.orion.learn.javase.io;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;

public class CopyFileTestDrive {

    private static final String sourcePath = "D:/dev/java-se/playbook/src/main/resources/demo.txt";
    private static final String targetPath = "D:/dev/java-se/playbook/src/main/resources/demo-copied.txt";

    public static void main(String[] args) throws IOException {
        Path source = Path.of(sourcePath);
        Path target = Path.of(targetPath);
        try {
            Files.copy(source, target);
        } catch (FileAlreadyExistsException e) {
            Files.copy(source, Path.of(String.format("D:/dev/java-se/playbook/src/main/resources/demo-copied-%s.txt", Instant.now().toString().replace(":", "-"))));
        }
    }

}
