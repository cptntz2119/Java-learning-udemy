public class Challenge {
    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("the high score " + highScore);
        calculateScore(true, 10000, 8, 200);
    }

    public static int calculateScore (boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
//            System.out.println("your final score was from a method " + finalScore);
        }
        return finalScore;
    }


}