import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
/**
 * Pair exercise — build sorted array, pick target, time both searches.
 */
public class SearchBenchmark {

    public static void main(String[] args) {
        Random rand = new Random();

        int N1 = 100000;
        int[] testList = buildSortedEvens(N1);
        int target = testList[rand.nextInt(N1)];
        long startTime = System.nanoTime();
        SearchLib.linearSearch(testList, target);
        float timeDurationL1 = (System.nanoTime() - startTime) / 1000000;
        startTime = System.nanoTime();
        SearchLib.binarySearch(testList, target);
        float timeDurationB1 = (System.nanoTime() - startTime) / 1000000;

        int N2 = 5000000;
        testList = buildSortedEvens(N2);
        target = testList[rand.nextInt(N2)];
        startTime = System.nanoTime();
        SearchLib.linearSearch(testList, target);
        float timeDurationL2 = (System.nanoTime() - startTime) / 1000000;
        startTime = System.nanoTime();
        SearchLib.binarySearch(testList, target);
        float timeDurationB2 = (System.nanoTime() - startTime) / 1000000;

        try (PrintWriter writer = new PrintWriter(new FileWriter("RESULTS.md"))) {
            writer.println("# Linear vs binary — results");
            writer.println(); 
            writer.println("## Round 1 (N = " + N1 + ")");
            writer.println();
            writer.println("| Algorithm | Time (ms) | Notes |");
            writer.println("|-----------|-----------|-------|");
            writer.printf("| Linear    | %.4f    |       |%n", timeDurationL1);
            writer.printf("| Binary    | %.4f    |       |%n", timeDurationB1);
            writer.println();
            writer.println("## Round 2 (N = " + N2 + ")");
            writer.println();
            writer.println("| Algorithm | Time (ms) | Notes |");
            writer.println("|-----------|-----------|-------|");
            writer.printf("| Linear    | %.4f    |       |%n", timeDurationL2);
            writer.printf("| Binary    | %.4f    |       |%n", timeDurationB2);
            writer.println();
            writer.println("## Big-O discussion");
            writer.println("Before testing I thought that the linear would be slower than the bineary search and round 2 would be slower than round 1");
            writer.println();
            writer.println("But after testing it was revield that linear was infact slower than bineary but round 2 even though it had more elements was still faster than round 1");
            writer.println();
            writer.println("It turns out that there are a lot of different variables that go into the programs run time");
            writer.println("There is what index the target is located at");
            writer.println("The initital JVM warmup time to fetch the relavant resources");
            writer.println("And what information is alread in cache");

        } catch (IOException e) {
            System.err.println("An error occurred while writing the file");
        }
    }

    static int[] buildSortedEvens(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i * 2;
        }
        return arr;
    }
}