public class Main {
    public static void main(String[] args) {
        byte myByteChallenge =  100;
        short myShortChallenge =  20000;
        int myIntChallenge = 500000;
        long myLongChallenge = 50000L + 10*(myByteChallenge + myShortChallenge + myIntChallenge);

        System.out.println(myLongChallenge);

    }
}