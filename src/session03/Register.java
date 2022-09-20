package activities;

import java.util.Scanner;

public class Register {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the charge: ");
        double charge = scanner.nextDouble();
        System.out.println("Enter the payment: ");
        double payment = scanner.nextDouble();

        System.out.println(getChange(charge, payment));
    }

    static String getChange(double charge, double payment) {
        double change = payment - charge;
        if (change==0)
            return "You have no change!";
        boolean owes = (change<0);
        if (owes)
            change = -1 * change;
        int dollars = (int) change;
        double remaining = change - dollars;
        int cents = (int) (remaining*100);
        return (owes ? "You still owe" : "Your change is ")+ dollars + " dollar"+(dollars==1?"":"s") + " and " + cents + " cent" + (cents==1?"":"s");
        }
}

