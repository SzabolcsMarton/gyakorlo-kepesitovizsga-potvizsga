package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileHandler {
    public int sumIgnoreComments(String filename) {
        int sum = 0;
        try (BufferedReader reader = Files.newBufferedReader(Path.of(filename))){
            String line;
            while ((line = reader.readLine()) != null){
                if(!line.startsWith("//")){
                    sum += Integer.parseInt(line);
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file",ioe);
        }

        return sum;
    }

}
