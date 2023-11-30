package exam2.menu;

import exam2.models.Sequence;
import exam2.repositiry.repository;
//import exam2.service.Initialize;
import exam2.service.ReadAndWrite;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    public static ArrayList<String> vozvrat = new ArrayList<>();
    public static String result;

    public static void play() throws IOException {

        File file = new File("save.txt");
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Начать игру");
        System.out.println("2. Вернуться к игре");
        System.out.println("3. Выйти из игры");
        System.out.println("4. Сохранить игру");
        if (file.length() == 0) {
        } else {
            System.out.println("5. Загрузить игру");
        }


        switch (scanner.nextInt()) {
            case 1 -> result = "Лисенок";
            case 2 -> result = vozvrat.get(vozvrat.size() - 1);
//            case 3 -> exit();
            case 4 -> {
                ReadAndWrite.writeResultsToFile(vozvrat.get(vozvrat.size() - 1));
                play();
            }
            case 5 -> result = ReadAndWrite.readResultsfromFile();
        }
        start(repository.initialMap(), result);
//        playGame(result);
    }

    public static void start(Map<String, Sequence> list, String s) throws FileNotFoundException, UnsupportedEncodingException {

        if (vozvrat.size() == 0) vozvrat.add("Лисенок");
        Scanner sc = new Scanner(System.in);
        System.out.println(list.get(s).getDescription());
        String[] linesA;
        String[] linesB;
        String A;
        String B;
        linesA = list.get(s).getWayA().split("->");
        linesB = list.get(s).getWayB().split("->");
        if (linesA.length > 1) {
            A = linesA[1];
        } else {
            A = linesA[0];
        }
        if (linesB.length > 1) {
            B = linesB[1];
        } else {
            B = linesB[0];
        }
        if (list.get(s).getWayA() == "" && list.get(s).getWayB() == "") {

        } else {
            System.out.println("1. " + list.get(s).getWayA());
            System.out.println("2. " + list.get(s).getWayB());
            System.out.println("3. Выйти в главное меню");

        }

        switch (sc.nextInt()) {
            case 1 -> {
                vozvrat.add(A.trim());
                start(list, A.trim());
            }

            case 2 -> {
                vozvrat.add(B.trim());
                start(list, B.trim());
            }
            case 3 -> {
                try {
                    play();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        ;
    }

//    public static void playGame(String s) throws FileNotFoundException, UnsupportedEncodingException {
//        if (vozvrat.size() == 0) vozvrat.add("Лисенок");
//        Scanner sc1 = new Scanner(System.in);
//        String [] arr = Initialize.init(s);
//        String[] linesA;
//        String[] linesB;
//        String A;
//        String B;
//        linesA = arr[0].split("->");
//        linesB = arr[1].split("->");
//        if (linesA.length > 1) {
//            A = linesA[1];
//        } else {
//            A = linesA[0];
//        }
//        if (linesB.length > 1) {
//            B = linesB[1];
//        } else {
//            B = linesB[0];
//        }
//
//            System.out.println("3. Выйти в главное меню");
//
//
//
//        switch (sc1.nextInt()) {
//            case 1 -> {
//                vozvrat.add(A.trim());
//                Initialize.init(A.trim());
//            }
//
//            case 2 -> {
//                vozvrat.add(B.trim());
//                Initialize.init(B.trim());
//            }
//            case 3 -> {
//                try {
//                    play();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
//    }


}
