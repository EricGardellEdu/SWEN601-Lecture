package session;

public class Factorial {
    public static void main(String[] args) {
        for (int i=0; i<15; i++) {
            int result = factorial(i);
            System.out.println(i+": "+result);
        }
    }

    public static int factorial(int n) {
        if (n < 0 )
            return -1;
        else if (n == 0 || n == 1) {
            return 1;
        } else {
            int next = n-1;
            int rest = factorial(next);
            return n * rest;
        }
    }
}
