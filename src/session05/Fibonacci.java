package session;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find the corresponding value in the fibonacci sequence: ");
        int n = scanner.nextInt();
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n ==1 | n == 2) {
            return n-1;
        } else {
            int fn_1 = fibonacci(n-1);
            int fn_2 = fibonacci(n-2);
            return fn_1 + fn_2;
        }
    }
}
