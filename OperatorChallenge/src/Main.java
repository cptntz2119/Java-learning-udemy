public class Main {
    public static void main(String[] args) {
        double myFirstVal = 20.00d;
        double mySecondVal = 80.00d;

        double result = (myFirstVal + mySecondVal) * 100.00;

        double reminderVal = result % 40.00;

        boolean isRemainder = (reminderVal == 0) ? true : false;
        if (!isRemainder){
            System.out.println("Got some remainder");
        }

    }
}