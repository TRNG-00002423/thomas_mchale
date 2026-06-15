import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Week 2 Exercise — String analysis (implement TODO methods).
 *
 * Compile: javac TextAnalyzer.java
 * Run:     java TextAnalyzer
 */
public class TextAnalyzer {

    public static int wordCount(String text) 
    {
        String[] wordList = text.split(" ");
        return wordList.length;
    }

    public static boolean isPalindrome(String token) 
    {
        if (token == null || token.isEmpty()) 
        {
            return true; 
        }
        char[] letters = token.toCharArray();
        for (int i = 0; i < letters.length / 2; i++)
        {
            if (letters[i] != letters[letters.length - 1 - i])
            {
                return false;
            }
        }
        return true;
    }

    public static int countOccurrences(String haystack, String needle) 
    {
        String[] wordList = haystack.split(" ");
        int total = 0;
        for (int i = 0; i < wordList.length; i++)
        {
            if (wordList[i].equals(needle))
            {
                total += 1;
            }
        }
        return total;
    }

    public static void main(String[] args) throws IOException 
    {
        System.out.println(wordCount("this sentence is 5 words"));
        System.out.println(isPalindrome("not pal"));
        System.out.println(isPalindrome("abcba"));
        System.out.println(isPalindrome("abccba"));
        System.out.println(countOccurrences("a b c b a", "a"));
        System.out.println(countOccurrences("b b c b b", "a"));

        System.out.println("_".repeat(20));
        Path p = Path.of("sample.txt");
        String body = Files.readString(p);
        System.out.println("words=" + wordCount(body));
        System.out.println("palindrome(Radar)=" + isPalindrome("Radar"));
        System.out.println("occurrences of 'QA'=" + countOccurrences(body, "QA"));
    }
}