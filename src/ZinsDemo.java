public class ZinsDemo {
    public static void main(String[] args) {

        int kontostand;
        double zinsen;
        double laufzeit;
        //kontostand = 1000;
        //zinsen = 2.25;
        //laufzeit = kontostand / 100 * zinsen;

        //System.out.println("Die Laufzeit beträgt: " + laufzeit);
        double result = add(2.25, 1000);
        System.out.println("Die Laufzeit beträgt: " + result);

    }

    public static double add(double zinsen, double kontostand) {
        double result = kontostand / 100 * zinsen;
        return (double) result;

    }
}
