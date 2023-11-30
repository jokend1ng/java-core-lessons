package exam2.service;

import java.io.*;

public class ReadAndWrite {
    public static void writeResultsToFile(String g) throws IOException {

       try(BufferedWriter writer = new BufferedWriter(new FileWriter("save.txt"))){
           writer.write(g);
           writer.flush();
       }catch(Exception e){
           e.printStackTrace();
       }
    }
     public static String readResultsfromFile() throws IOException {
         String line = null;
         try (BufferedReader reader = new BufferedReader(new FileReader("save.txt"))) {
             line = reader.readLine();

         } catch (Exception e) {
             e.printStackTrace();
         }
         return line;
     }
}
