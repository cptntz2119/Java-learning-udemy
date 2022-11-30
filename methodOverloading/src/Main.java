public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("new score is " + newScore);
        calculateScore(600, "Tim");

    }

    public static int calculateScore (String playerName, int score){
        System.out.println("player " + playerName + " scored " + score + " points");
        return score*1000;
    }

    public static int calculateScore (int score, String playerName){
        System.out.println("player " + playerName + " scored " + score + " points");
        return score*1000;
    }


}