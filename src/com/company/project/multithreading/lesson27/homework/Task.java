package com.company.project.multithreading.lesson27.homework;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task extends Thread {
    File file;

    public Task(String path) {
        this.file = new File(path);
    }

    @Override
    public void run() {
       try(BufferedReader br = new BufferedReader(new FileReader(file))){
           String line;
           while ((line=br.readLine()) != null){
               String result = null;
               Matcher matcher = Pattern.compile(":\\d:").matcher(line);
               while (matcher.find()) {
                   result =matcher.group();
               }
               String x = result.substring(1, result.length()-1);

               if (Integer.parseInt(x)>6){
                   System.out.println(line);
               }
           }

       } catch (IOException e) {
           throw new RuntimeException(e);
       }
    }

    public static void main(String[] args) {
       Task t1 =new Task("save.txt");
       Task t2 =new Task("save.txt");
       Task t3 =new Task("save.txt" );
       Task t4 =new Task("save.txt");

       t1.start();
       t2.start();
       t3.start();
       t4.start();
    }
}
