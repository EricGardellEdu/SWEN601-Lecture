package activities;

import java.util.Scanner;

public class EvensAndOdds {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner scanner = new Scanner((System.in));
        int num = scanner.nextInt();

        if (num % 5 == 0)
            System.out.println("The Number is Even!");
        else if (num%2 == 0)
            System.out.println("The number is divisible by 5");
        else
            System.out.println("The Number is odd");

    }
}
