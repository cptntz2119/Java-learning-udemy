public class Main {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(5,8));
        System.out.println(convertToCentimeters(68));
    }

    public static double convertToCentimeters (int height) {
        return (double) height * 2.54;
    }

    public static double convertToCentimeters (int heightFeet, int heightInch ) {
        return convertToCentimeters( heightFeet * 12 + heightInch);
    }
}