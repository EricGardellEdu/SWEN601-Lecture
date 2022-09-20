package activities;
import java.util.Scanner;

public class Calculator {
    public static void calc (float x, float y) {
        System.out.println("X="+x+", Y="+y);
        float z = x+y;
        System.out.println("x + y = " + z);
        z = x*y;
        System.out.println("x * y = " + z);
        z = x-y;
        System.out.println("x - y = " + z);
        z = x/y;
        System.out.println("x / y = " + z + "\n");
    }

    public static void main (String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner scanner = new Scanner(System.in);
        calc(scanner.nextFloat(), scanner.nextFloat());
    }
}
