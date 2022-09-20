package activities;

import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int response = scanner.nextInt();

        while (response > 0) {
            response --; // decrement the response variable by 1
            System.out.println(response);
        }
    }
}
