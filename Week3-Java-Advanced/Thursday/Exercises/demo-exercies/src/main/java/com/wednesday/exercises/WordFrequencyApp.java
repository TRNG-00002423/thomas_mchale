package com.wednesday.exercises;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * Partner A — word counts + sorted unique words.
 * See ../../README.md
 */
public class WordFrequencyApp {

    static final String SAMPLE = """
            Java collections maps sets queues lambdas
            Java maps and sets and more Java
            """;
    
    

    public static void main(String[] args) {
        String[] wordList = SAMPLE.trim().split("\\s+");
        Map<String, Integer> counts = new HashMap<>();
        for (String word: wordList)
        {
            if (!counts.containsKey(word))
            {
                counts.put(word, 1);
            }
            else
            {
                counts.put(word,counts.get(word) + 1);
            }
        }


        int topCount = 0;
        String topCountWord = "";
        for (Map.Entry<String,Integer> entry:counts.entrySet())
        {
            if (entry.getValue() > topCount)
            {
                topCount = entry.getValue();
                topCountWord = entry.getKey();
            }
        }

        TreeSet<String> vocabulary = new TreeSet<>();
        Arrays.stream(wordList).forEach(word -> vocabulary.add(word));

        System.out.printf("Counts: %d \ntop N: %s\n", topCount, topCountWord);
        System.out.printf("First: %s\n Last: %s", vocabulary.getFirst(), vocabulary.getLast());
    }
}