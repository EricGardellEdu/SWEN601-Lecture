package activities;

import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.println("Enter the day of the month as an integer: ");
        int day = scanner.nextInt();
        String suffix = getSuffix(day);
        if (suffix == null)
            System.out.println("That is an invalid day!");
        else
            System.out.println("It is the " +day+ "" + suffix + ". ");
    }

    static  String getSuffix(int day) {
        if (day<1)
            return null;
        return switch (day) {
            case 11, 12, 13 -> "th";
            default -> switch ((day % 10)) {
                case 1 -> "st";
                case 2 -> "nd";
                case 3 -> "rd";
                default -> "th";
            };
        };
    }
}
