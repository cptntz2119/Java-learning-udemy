public class Main {
    public static void main(String[] args) {

        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }

        for (double rate = 2.0; rate <=5.0; rate++){
            double interestAmount = calculateInterest(10000.0, rate);
            if (rate > 4){
                break;
            }
            System.out.println("10000 at " + rate + "% interest = " + interestAmount);
        }


    }

    public static double calculateInterest (double amount, double interestRate){

        return (amount * (interestRate /100));
    }
}