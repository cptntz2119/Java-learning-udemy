public class Main {
    public static void main(String[] args) {
        printConversion(1.25);
        printConversion(95.75);
        System.out.println(shouldWakeUp(false, 2));
    }

    public static long toMilesPerHour(double kilometersPerHour) {

        return kilometersPerHour >= 0 ? Math.round(kilometersPerHour / 1.609) : -1;
    }

    public static void printConversion (double kilometersPerHour) {
        System.out.println( (kilometersPerHour >= 0 ) ? kilometersPerHour + " km/h = "
                + toMilesPerHour(kilometersPerHour) + " mi/h" : "Invalid Value");
    }

    public static boolean shouldWakeUp (boolean isCurrentlyBarking, int hourOfDay){
        if ((isCurrentlyBarking ) &&
                ((hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay < 24))){
                return true;
            }

        return false;

    }
}