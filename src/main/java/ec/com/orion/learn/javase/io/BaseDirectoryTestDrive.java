package ec.com.orion.learn.javase.io;

import java.nio.file.Path;

public class BaseDirectoryTestDrive {


    public static void main(String[] args) {
        String baseDirectoryFromProperty = System.getProperty("user.dir");   
        Path baseDirectoryFromPath = Path.of("").toAbsolutePath();
        System.out.println(String.format("Base directory using System Properies:%s",baseDirectoryFromProperty));
        System.out.println(String.format("Base directory using Path interface: %s",baseDirectoryFromPath));
    }

}
