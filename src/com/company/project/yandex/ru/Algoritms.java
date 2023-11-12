package com.company.project.yandex.ru;

import java.io.*;
import java.util.*;

public class Algoritms {


    public static void main(String[] args) throws IOException {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
             var bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
            var line = br.readLine();
            ArrayList<String> numbers = new ArrayList<>();
            for (int i = 0; i < Integer.parseInt(line); i++) {
                numbers.add(br.readLine());
            }


            PrintWriter w = new PrintWriter(System.out);

            w.println("Initial array:");
            for (int i = 0; i < numbers.size(); i++) {
                if (i < numbers.size() - 1) {
                    w.print(numbers.get(i) + ", ");
                } else {
                    w.print(numbers.get(i) + "\n");
                }
            }

            w.println("**********");
            ArrayList<String> Bucket_0 = new ArrayList<String>();
            ArrayList<String> Bucket_1 = new ArrayList<String>();
            ArrayList<String> Bucket_2 = new ArrayList<String>();
            ArrayList<String> Bucket_3 = new ArrayList<String>();
            ArrayList<String> Bucket_4 = new ArrayList<String>();
            ArrayList<String> Bucket_5 = new ArrayList<String>();
            ArrayList<String> Bucket_6 = new ArrayList<String>();
            ArrayList<String> Bucket_7 = new ArrayList<String>();
            ArrayList<String> Bucket_8 = new ArrayList<String>();
            ArrayList<String> Bucket_9 = new ArrayList<String>();

            for (int i = 0; i < 20; i++) {
                w.println("Phase " + (i + 1));
                for (int z = 0; z < numbers.size(); z++) {
                    int length = numbers.get(z).length();
                    if (i > length - i - 1) {
                        continue;
                    }
                    switch (numbers.get(z).charAt(length - i - 1)) {
                        case '0' -> {
                            Bucket_0.add(numbers.get(z));

                            Bucket_1.remove(numbers.get(z));

                            Bucket_2.remove(numbers.get(z));


                            Bucket_3.remove(numbers.get(z));


                            Bucket_4.remove(numbers.get(z));

                            Bucket_5.remove(numbers.get(z));


                            Bucket_6.remove(numbers.get(z));


                            Bucket_7.remove(numbers.get(z));


                            Bucket_8.remove(numbers.get(z));


                            Bucket_9.remove(numbers.get(z));
                            break;

                        }
                        case '1' -> {
                            Bucket_1.add(numbers.get(z));

                            Bucket_1.remove(numbers.get(z));


                            Bucket_2.remove(numbers.get(z));


                            Bucket_3.remove(numbers.get(z));


                            Bucket_4.remove(numbers.get(z));


                            Bucket_5.remove(numbers.get(z));

                            Bucket_6.remove(numbers.get(z));


                            Bucket_7.remove(numbers.get(z));

                            Bucket_8.remove(numbers.get(z));

                            Bucket_9.remove(numbers.get(z));
                            break;

                        }
                        case '2' -> {
                            Bucket_2.add(numbers.get(z));

                            Bucket_1.remove(numbers.get(z));


                            Bucket_2.remove(numbers.get(z));


                            Bucket_3.remove(numbers.get(z));

                            Bucket_4.remove(numbers.get(z));


                            Bucket_5.remove(numbers.get(z));


                            Bucket_6.remove(numbers.get(z));

                            Bucket_7.remove(numbers.get(z));

                            Bucket_8.remove(numbers.get(z));


                            Bucket_9.remove(numbers.get(z));
                            break;

                        }
                        case '3' -> {
                            Bucket_3.add(numbers.get(z));

                            Bucket_1.remove(numbers.get(z));


                            Bucket_2.remove(numbers.get(z));


                            Bucket_3.remove(numbers.get(z));

                            Bucket_4.remove(numbers.get(z));

                            Bucket_5.remove(numbers.get(z));

                            Bucket_6.remove(numbers.get(z));


                            Bucket_7.remove(numbers.get(z));


                            Bucket_8.remove(numbers.get(z));


                            Bucket_9.remove(numbers.get(z));
                            break;

                        }
                        case '4' -> {
                            Bucket_4.add(numbers.get(z));

                            Bucket_1.remove(numbers.get(z));

                            Bucket_2.remove(numbers.get(z));


                            Bucket_3.remove(numbers.get(z));


                            Bucket_4.remove(numbers.get(z));


                            Bucket_5.remove(numbers.get(z));


                            Bucket_6.remove(numbers.get(z));


                            Bucket_7.remove(numbers.get(z));


                            Bucket_8.remove(numbers.get(z));


                            Bucket_9.remove(numbers.get(z));
                            break;

                        }
                        case '5' -> {
                            Bucket_5.add(numbers.get(z));

                            Bucket_1.remove(numbers.get(z));


                            Bucket_2.remove(numbers.get(z));


                            Bucket_3.remove(numbers.get(z));


                            Bucket_4.remove(numbers.get(z));

                            Bucket_5.remove(numbers.get(z));


                            Bucket_6.remove(numbers.get(z));


                            Bucket_7.remove(numbers.get(z));

                            Bucket_8.remove(numbers.get(z));

                            Bucket_9.remove(numbers.get(z));

                            break;
                        }
                        case '6' -> {
                            Bucket_6.add(numbers.get(z));

                            Bucket_1.remove(numbers.get(z));


                            Bucket_2.remove(numbers.get(z));


                            Bucket_3.remove(numbers.get(z));


                            Bucket_4.remove(numbers.get(z));

                            Bucket_5.remove(numbers.get(z));


                            Bucket_6.remove(numbers.get(z));


                            Bucket_7.remove(numbers.get(z));


                            Bucket_8.remove(numbers.get(z));

                            Bucket_9.remove(numbers.get(z));

                            break;
                        }
                        case '7' -> {
                            Bucket_7.add(numbers.get(z));

                            Bucket_1.remove(numbers.get(z));


                            Bucket_2.remove(numbers.get(z));


                            Bucket_3.remove(numbers.get(z));

                            Bucket_4.remove(numbers.get(z));


                            Bucket_5.remove(numbers.get(z));

                            Bucket_6.remove(numbers.get(z));


                            Bucket_7.remove(numbers.get(z));

                            Bucket_8.remove(numbers.get(z));


                            Bucket_9.remove(numbers.get(z));

                            break;
                        }
                        case '8' -> {
                            Bucket_8.add(numbers.get(z));

                            Bucket_1.remove(numbers.get(z));


                            Bucket_2.remove(numbers.get(z));

                            Bucket_3.remove(numbers.get(z));


                            Bucket_4.remove(numbers.get(z));

                            Bucket_5.remove(numbers.get(z));


                            Bucket_6.remove(numbers.get(z));

                            Bucket_7.remove(numbers.get(z));

                            Bucket_8.remove(numbers.get(z));


                            Bucket_9.remove(numbers.get(z));
                            break;

                        }
                        case '9' -> {
                            Bucket_9.add(numbers.get(z));
                            Bucket_1.remove(numbers.get(z));
                            Bucket_2.remove(numbers.get(z));


                            Bucket_3.remove(numbers.get(z));

                            Bucket_4.remove(numbers.get(z));

                            Bucket_5.remove(numbers.get(z));

                            Bucket_6.remove(numbers.get(z));


                            Bucket_7.remove(numbers.get(z));

                            Bucket_8.remove(numbers.get(z));


                            Bucket_9.remove(numbers.get(z));
                            break;

                        }
                    }


                    for (int j = 0; j < 10; j++) {
                        switch (j) {
                            case 0 -> w.println("Bucket 0:" + Bucket_0.toString());
                            case 1 -> w.println("Bucket 1:" + Bucket_1.toString());
                            case 2 -> w.println("Bucket 2:" + Bucket_2.toString());
                            case 3 -> w.println("Bucket 3:" + Bucket_3.toString());
                            case 4 -> w.println("Bucket 4:" + Bucket_4.toString());
                            case 5 -> w.println("Bucket 5:" + Bucket_5.toString());
                            case 6 -> w.println("Bucket 6:" + Bucket_6.toString());
                            case 7 -> w.println("Bucket 7:" + Bucket_7.toString());
                            case 8 -> w.println("Bucket 8:" + Bucket_8.toString());
                            case 9 -> w.println("Bucket 9:" + Bucket_9.toString());
                        }
                    }
                }
            }

                w.flush();
                w.close();
            }
        }

    }




