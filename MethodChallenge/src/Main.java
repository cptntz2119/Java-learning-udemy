public class Main {
    public static void main(String[] args) {

        int calScore = calculatedHighScorePosition(1500);
        displayHighScorePosition("Tim", calScore);

        calScore = calculatedHighScorePosition(1000);
        displayHighScorePosition("Tim", calScore);

        calScore = calculatedHighScorePosition(500);
        displayHighScorePosition("Tim", calScore);

    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position "
                + position + " on the high score list"
        );
    }

    public static int calculatedHighScorePosition (int score) {
        int position = 4;
        if (score >= 1000) {
            position =  1;
        }else if (score >=500){
            position =   2;

        }else if (score >= 100 ) {
            position =  3;
        }

        return position;
    }
}