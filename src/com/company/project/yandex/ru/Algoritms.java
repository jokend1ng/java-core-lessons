package com.company.project.yandex.ru;

import java.io.*;
import java.util.*;


public class Algoritms {


    public static void main(String[] args) throws IOException {

        int range = 10;

        try (var br = new BufferedReader(new InputStreamReader(System.in));
             var bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
            var line = br.readLine();
            List<String> data = new ArrayList<>();

            int n = Integer.parseInt(line);
            for (int i = 0; i < n; i++) {
                data.add(br.readLine());

            }


            PrintWriter w = new PrintWriter(System.out);

            w.println("Initial array:");
            for(int i = 0; i < data.size(); i++) {
                if (i == data.size()-1) {
                    w.println(data.get(i));
                } else {
                    w.print(data.get(i) + ", ");
                }
            }


            for (int i = 0; i < data.get(0).length(); i++) {
                w.print("**********\n");
                w.print("Phase " + (i + 1) + "\n");

                List<List<String>> buckets = new ArrayList<>();
                for (int j = 0; j < range; j++) {
                    buckets.add(new ArrayList<>());
                }

                for (String x : data) {
                 String h=new StringBuilder(x).reverse().toString();
                    int q= h.charAt(i)-'0';
                    buckets.get(q).add(x);
                }

                data.clear();
                for (int j = 0; j < range; j++) {
                    data.addAll(buckets.get(j));
                    w.print("Bucket " + j + ": ");
                    if (buckets.get(j).isEmpty()) {
                        w.print("empty\n");
                    } else {
                        w.print(String.join(", ", buckets.get(j)) + "\n");
                    }
                }
            }

            w.print("**********\n");
            w.print("Sorted array:\n");
            w.print(String.join(", ", data));

            w.flush();
            w.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}






