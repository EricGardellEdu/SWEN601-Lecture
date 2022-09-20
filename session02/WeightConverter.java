package activities;

public class WeightConverter {
    public static float PoundsToKilos (float pounds) {
        System.out.println("Pounds: "+pounds);
        float kilos = pounds * (float) 2.2;
        System.out.println("Kilos: "+kilos);
        return kilos;
    }

    public static void main (String[] args) {
        float a = PoundsToKilos(45);
        float b = PoundsToKilos(135);

        System.out.println("Sum: "+(a+b));
    }
}
