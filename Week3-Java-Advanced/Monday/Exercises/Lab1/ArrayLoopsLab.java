/**
 * Lab 1 — Arrays & loops. Implement the bodies.
 * See ../README.md
 */
public class ArrayLoopsLab {

    /** Reverse array in place. */
    public static void reverse(int[] data) {
        int midPoint = data.length / 2;
        for (int i = 0; i < midPoint; i++)
        {
            int cur = data[i];
            data[i] = data[data.length - 1 - i];
            data[data.length - 1 - i] = cur;
        }
        for (int i = 0; i < data.length; i++)
        {
            System.out.println(data[i]);
        }
    }

    /** Smallest element; illegal if null or empty. */
    public static int min(int[] data) {
        if (data == null || data.length < 1)
        {
            throw new IllegalArgumentException("Illegal Argument");
        }
        int curMin = data[0];
        for (int i = 0; i < data.length; i++)
        {
            if (data[i] < curMin)
            {
                curMin = data[i];
            }
        }
        return curMin;
    }

    /** Largest element; illegal if null or empty. */
    public static int max(int[] data) {
        if (data == null || data.length < 1)
        {
            throw new IllegalArgumentException("Illegal Argument");
        }
        int curMax = data[0];
        for (int i = 0; i < data.length; i++)
        {
            if (data[i] > curMax)
            {
                curMax = data[i];
            }
        }
        return curMax;
    }

    /** In-place ascending sort using nested loops only (no Arrays.sort). */
    public static void sortAscending(int[] data) {
        for (int i = 0; i < data.length - 1; i++)
        {
            for (int j = 0; j < data.length - 2 - i; j++)
            {
                if (data[j] > data[j + 1]) {
                    int cur = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = cur;
                }
            }
        }
        for (int i = 0; i < data.length; i++)
        {
            System.out.println(data[i]);
        }
    }

    public static void main(String[] args) {
        int[] myArray = {4,2,1,5,3};
        reverse(myArray);
        System.out.println();
        sortAscending(myArray);
    }
}