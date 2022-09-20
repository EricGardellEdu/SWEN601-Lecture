package activities;

import java.util.Scanner;

public class EvensAndOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.print("Enter a number: ");
            num = scanner.nextInt();
            if (num%2==0)
                System.out.println("Even.");
            else
                System.out.println("Odd.");
        } while (!(num ==0));
        System.out.println("Done!");
    }
}
