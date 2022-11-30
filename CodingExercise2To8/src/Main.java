public class Main {
    public static void main(String[] args) {
        printConversion(1.25);
        printConversion(95.75);
        System.out.println(shouldWakeUp(false, 2));
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-2500);
        printMegaBytesAndKiloBytes(5000);
        System.out.println(areEqualByThreeDecimalPlaces(-3.175,-3.1756));
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

    public static boolean isLeapYear(int year){
        if(year>=1 && year <=9999){
            if((year%4==0 && year%100!=0)|| year%400==0){
                return true;
            }
        }
        return false;
    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        if (kiloBytes >= 0) {
            System.out.println(kiloBytes + " KB= " + kiloBytes / 1024 + " MB " + kiloBytes % 1024 + " KB");
        }else {
            System.out.println("Invalid Value");
        }
    }

    public static boolean areEqualByThreeDecimalPlaces (double num1, double num2) {
        if ((int)(num1*1000) == (int)(num2*1000)){
            return true;
        }
        return false;
    }

    public static boolean hasEqualSum (int num1, int num2, int num3) {
        if (num1 == num3 - num2) {
            return true;
        }

        return false;
    }

    public static boolean hasTeen (int num1, int num2, int num3) {
        return isTeen(num1) || isTeen(num2) || isTeen(num3);
    }
    public static boolean isTeen (int nr1){
            return (nr1 >= 13 && nr1 <= 19);
    }





}