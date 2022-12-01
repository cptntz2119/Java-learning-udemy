public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static double area(double radius) {
        if (radius < 0){
            return -1;
        }
        return Math.PI * Math.pow(radius,radius);
    }

    public static double area(double a, double b) {
        if (a <0 || b <0){
            return -1;
        }
        return Math.pow(a, b);
    }


}