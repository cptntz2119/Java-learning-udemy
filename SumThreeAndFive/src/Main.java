public class Main {
    public static void main(String[] args) {
        int countOfMatches = 0;
        int sumOfMatches =0;

        for (int loopNum = 1; loopNum <=1000; loopNum++){
            if ((loopNum %3 == 0) && (loopNum % 5 ==0)){
                countOfMatches++;
                sumOfMatches += loopNum;
                System.out.println("Found a match = " + loopNum);
            }

            if (countOfMatches == 5) {
                break;
            }
        }

        System.out.println("sum = " + sumOfMatches);


    }


}