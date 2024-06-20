package ec.com.orion.learn.javase.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class ReadBigFiles {

    private static final String path = "D:/dev/java-se/playbook/src/main/resources/demo.txt";

    public static void main(String[] args) throws IOException {
        Path somePath = Path.of(path);
        try(BufferedReader reader = Files.newBufferedReader(somePath)){
            String line = null;
            while((line = reader.readLine()) != null ){
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.out.println(String.format("Problem reading the file %s",ex.getMessage()));
            throw new UncheckedIOException(ex);
        }

        System.out.println("Another approach");
        readWithFewerLines(somePath);

    }
    

    public static void readWithFewerLines(Path somePath) throws IOException{
        Stream<String> lines = Files.lines(somePath);
        lines.forEach(System.out::println);
    }
}
