package ec.com.orion.learn.javase.io;

import java.nio.file.Files;
import java.nio.file.Path;

public class PathSeparatorTestDrive {

private static final String unixPath = "D:/dev/java-se/playbook/src/main/resources/demo.txt";
private static final String winPath = "D:\\dev\\java-se\\playbook\\src\\main\\resources\\demo.txt";


public static void main(String[] args) {
    Path uPath = Path.of(unixPath);
    Path wPath = Path.of(winPath);
    System.out.println(String.format("%s, exists? %b",unixPath,Files.exists(uPath)));
    System.out.println(String.format("%s, exists? %b",wPath,Files.exists(wPath)));
    Path aPath = Path.of("d:","dev","java-se","playbook","src","main","resources","demo.txt");
    System.out.println(String.format("Verifiying path from vargs of builder:%b",Files.exists(aPath)));
}

}
