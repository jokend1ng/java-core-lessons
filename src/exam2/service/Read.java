package exam2.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public interface Read {
    default String readResultsfromFile() throws IOException {
        String line = null;
        try (BufferedReader reader = new BufferedReader(new FileReader("save.txt"))) {
            line = reader.readLine();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return line;
    }
}
