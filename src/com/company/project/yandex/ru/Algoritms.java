package com.company.project.yandex.ru;

import java.io.*;
import java.util.*;


public class Algoritms {


    public static void  main(String[] args) throws IOException {
        var br =new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        int n = Integer.parseInt(br.readLine());
        int x_=257;
        long[] h = new long[line.length()+1];
        long x [] = new long[line.length()+1];
        int p=(int)Math.pow(10,9)+7;
        x[0]=1;
        line="_"+line;

       for (int i = 1; i < line.length(); i++) {
           h[i] = (h[i-1]*x_+(line.charAt(i)))%p;
           x[i]=(x[i-1]*x_)%p;
       }
       PrintWriter w = new PrintWriter(System.out);
        w.println();
       for (int i = 0;i<n;i++) {
           String line1 = br.readLine();


           int[] array= Arrays.stream(line1.split(" ")).mapToInt(Integer::parseInt).toArray();
           array[1] += 1;
           array[2] += 1;

           if((h[array[1]+array[0]-1]+h[array[2]+1])*x[array[0]]%p==
                   (h[array[2]+array[0]-1]+h[array[1]+1])*x[array[0]]%p){
               w.println("yes");
           } else{
               w.println("no");
           }
            w.flush();
       }
       w.close();
    }


    }







