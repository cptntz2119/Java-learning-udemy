public class Main {
    public static void main(String[] args) {
        double kilometers = (100 * 1.609344);

        int highScore =50;
        if (highScore > 25) {
            highScore = 1000 + highScore;
        }

        //total of 6 expression below: 1 + 3 + 2
        int health = 100; //1
        if ((health < 25 ) && (highScore > 1000)){ //3
            highScore = highScore -1000; //2
        }

    }
}