//package exam2.service;
//
//import exam2.models.Sequence;
//
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
//
//public class Initialize {
//
//    public static String[] init(String result) throws FileNotFoundException {
//        String[] array = new String[2];
//        try (BufferedReader br = new BufferedReader(new FileReader("text.txt"))) {
//            String line = null;
//
//            while ((line = br.readLine()) != null) {
//                if (line.endsWith(result)) {
//                    System.out.println(line);
//
//                } else {
//
//                    } if (line.startsWith("1. ")) {
//                        array[0] = line.substring(3, line.length());
//                    } else if (line.startsWith("2. ")) {
//                        array[1] = line.substring(3, line.length());
//                        System.out.println(line);
//                        break;
//                    }
//                    System.out.println(line);
//                }
//
//            }
//         catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        return array;
//    }
//
//}


