package com.company.project.lesson17.homework;

import javafx.print.Printer;

import java.io.PrintWriter;
import java.util.*;

public class Task1 {
    public static Map<String, Long> getCountsWordFromList(Collection<String> words) {
        Map<String, Long> counts = new HashMap<String, Long>();
        for (String word : words) {
            if (!counts.containsKey(word)) {
                counts.put(word, 1L);
            } else {
                Long x = counts.get(word) + 1;
                counts.put(word, x);
            }
        }
        return counts;
    }

    public static Map<String, Long> getCountsWordFromText(String word, String text) {
        Map<String, Long> counts = new HashMap<String, Long>();
        counts.put(word.toLowerCase(), 0L);
        String[] words = text.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("^[\\w]]", "").toLowerCase();
        }
        for (String j : words) {
            if (j.equals(word.toLowerCase())) {
                Long x = counts.get(word) + 1;
                counts.put(word, x);

            }
        }
        return counts;
    }

    public static Map<Integer, List<String>> getLengthWord(String text) {
        Map<Integer, List<String>> counts = new HashMap<>();
        String[] words = text.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("^[\\w]]", "").toLowerCase();
        }
        Set<String> wordsSet = new HashSet<>();
        for (String word : words)
            wordsSet.add(word);
        for (String j : wordsSet) {
            counts.put(j.length(), new ArrayList<>());
            counts.get(j.length()).add(j);

        }
        return counts;
    }

    public static void getLengthWordWithOutArticles(String text) {
        Set<String> wordsSet = new HashSet<>();
        String[] words = text.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("^[\\w]]", "").toLowerCase();
        }
        List<String> articles = new ArrayList<>();
        articles.add("a");
        articles.add("at");
        articles.add("the");
        articles.add("is");
        articles.add("on");
        articles.add("in");
        articles.add("that");
        articles.add("it");
        articles.add("as");
        articles.add("by");
        articles.add("of");
        articles.add("to");

        for (String word : words) {
            if (!articles.contains(word)) {
                wordsSet.add(word);
            }

        }
        Map<String, Long> counts = getCountsWordFromList(wordsSet);
        counts = sortByValue(counts);
        Set<String> tenWords = counts.keySet();
        int i = 0;
        for (String word : tenWords) {
            if (i >= tenWords.size() - 10)
                System.out.println(word);
            i++;
        }

    }

    private static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    public static void main(String[] args) {
        Map<String, Long> counts = getCountsWordFromList(Arrays.asList("Moskva", "Tver", "Spb", "Moskva", "Tver", "Moskva"));
        Map<String, Long> counts1 = getCountsWordFromText("дождь", "Весь сад в дожде! Весь дождь в саду!\n" +
                "Погибнут дождь и сад друг в друге,\n" +
                "Оставив мне решать судьбу\n" +
                "Зимы, явив\u00ADшей\u00ADся на юге.");
        String text = "It is a uncover long established fact that a reader will be distracted uncover by the readable content of a page " +
                "when looking at its layout The point of using uncover Lorem Ipsum is that sites it has a more-or-less normal distribution of letters" +
                "as uncover opposed to still using Content here humour uncover content here making it look like readable English Many desktop publishing " +
                "packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will " +
                "uncover many web sites still uncover in their infancy Various versions uncover have evolved over the years uncover sometimes by accident" +
                " sometimes on purpose injected humour and the like";
        Map<Integer, List<String>> text1 = getLengthWord(text);

        PrintWriter w = new PrintWriter(System.out);
        getLengthWordWithOutArticles(text);
        w.println(counts.get("Moskva"));
        w.println(counts1.get("дождь"));
        w.flush();
        w.close();

    }
}
