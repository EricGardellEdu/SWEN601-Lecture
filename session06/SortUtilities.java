package session;

import java.util.Random;

public class SortUtilities {
    private static Random RNG = new Random();

    public static void main(String[] args) {
//        int[] arr = makeArray(12);
//        System.out.println(sorted(arr));
    }

    public static boolean sorted(int[] arr) {
        // Returns True if arr is sorted, False otherwise
        int curr_val;
        for (int i=1; i<arr.length; i++) {
            if (arr[i-1] > arr[i])
                return false;
        }
        return true;
    }

    public static int[] swap(int[] input, int a, int b) {
        int temp = input[a];
        input[a] = input[b];
        input[b] = temp;
//        System.out.println("the values at "+a+" and "+b+" were swapped");
        return input;
    }

    public static int[] makeArray(int length) {
        int [] output = new int[length];
        for (int i=0; i<output.length; i++)
            output[i] = RNG.nextInt(length+1);
        return output;
    }
}
