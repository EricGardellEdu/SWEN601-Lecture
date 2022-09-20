package activities;

import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        System.out.println(("Enter the day as an integer with 0 being Monday: "));
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        // Enhanced switch statement as suggested by intelliJ
        switch (day) {
            case 0 -> System.out.println("It is Monday");
            case 1 -> System.out.println("It is Tuesday");
            case 2 -> System.out.println("It is Wednesday");
            case 3 -> System.out.println("It is Thursday");
            case 4 -> System.out.println("It is Friday");
            case 5 -> System.out.println("It is Saturday");
            case 6 -> System.out.println("It is Sunday");
            default -> System.out.println("That is not a valid date");
        }
    }
}
