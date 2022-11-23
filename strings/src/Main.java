public class Main {
    public static void main(String[] args) {

        // byte short int long float  double char boolean

        String myString = " this is a string";
        System.out.println("my string is equal to " + myString);
        myString = myString + ", this is more.";
        System.out.println(myString);
        myString = myString + " \u00A9 2019";
        System.out.println(myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("last string is " + lastString);

        double doubleNum = 140.45d;
        lastString = lastString + doubleNum;
        System.out.println(lastString);

        //string is class and immutable
    }
}