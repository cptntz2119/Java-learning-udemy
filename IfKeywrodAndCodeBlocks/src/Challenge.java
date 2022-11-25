public class Challenge {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;
         if (gameOver) {
             finalScore += (levelCompleted * bonus);
             System.out.println("your final score was " + finalScore);
         }

         score = 10000;
         levelCompleted = 8;
         bonus = 200;

         finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore);
        }

        calculateScore(true, 800, 5, 100);
    }

    public static void calculateScore (boolean gameOver, int score, int levelCompleted, int bonus) {


        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("your final score was from a method " + finalScore);
        }
    }


}