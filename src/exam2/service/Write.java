package exam2.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public interface Write {
    default   void writeResultsToFile(String g) throws IOException {

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("save.txt"))){
            writer.write(g);
            writer.flush();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
