public class Challenge {
    public static void main(String[] args) {

        boolean gameOVer = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;
         if (gameOVer) {
             finalScore += (levelCompleted * bonus);
             System.out.println("your final score was " + finalScore);
         }

         score = 10000;
         levelCompleted = 8;
         bonus = 200;

         finalScore = score;

        if (gameOVer) {
            finalScore += (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore);
        }
    }
}