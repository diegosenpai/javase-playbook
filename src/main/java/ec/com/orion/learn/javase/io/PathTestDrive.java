package ec.com.orion.learn.javase.io;

import java.nio.file.Files;
import java.nio.file.Path;

public class PathTestDrive {

    private static final String demo = "D:\\dev\\java-se\\playbook\\src\\main\\resources\\demo.txt";

    public static void main(String[] args) {
        Path demoPath = Path.of(demo);
        System.out.println(String.format("the path %s, exists? %b", demo, Files.exists(demoPath)));
    }

}
