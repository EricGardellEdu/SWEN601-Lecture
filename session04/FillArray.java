package activities;

import java.util.Scanner;

public class FillArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int [] arr = getArray(num);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int[] getArray(int length) {
        int [] arr = new int[length];
        for (int i=0; i<length; i++)
            arr[i] = 10*i;
        return  arr;
    }
}
