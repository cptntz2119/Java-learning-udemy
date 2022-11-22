public class Main {
    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("float min value = " + myMinFloatValue);
        System.out.println(("float max value " + myMaxFloatValue));

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double min value = " + myMinDoubleValue);
        System.out.println(("Double max value " + myMaxDoubleValue));

        int myIntValue = 5/2;
        float myFloatValue = 5f / 3f; //or 5.25f
        double myDoubleValue = 5.00d / 3d;
        System.out.println("my int val = " + myIntValue);
        System.out.println("my float val = " + myFloatValue);
        System.out.println("my double val = " + myDoubleValue);

        double poundValue = 200d;
        double kilogramsValue = poundValue * 0.45359237d;
        System.out.println("pound value " + poundValue + " is " + kilogramsValue + " kilograms");

        double anotherNum = 3_000_000.4_567_890d;
        System.out.println("another number is " + anotherNum);
    }
}