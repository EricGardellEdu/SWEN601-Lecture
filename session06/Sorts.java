package session;

import java.util.Arrays;

public class Sorts {
    public static void main(String[] args) {
        int[] arr = SortUtilities.makeArray(10);
        SelectionSort(arr);
        System.out.println("Final sorted array: "+ Arrays.toString(arr));
    }

    public static int[] SelectionSort(int[] arr) {
        int currIndex=0;
        while (!SortUtilities.sorted(arr)) {
            System.out.println("Selection step: "+ Arrays.toString(arr));
            int minIndex = currIndex;
            for (int j=currIndex; j< arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            SortUtilities.swap(arr, currIndex, minIndex);
            currIndex++;
        }
        return arr;
    }
}
