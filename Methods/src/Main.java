/**
 * Created by Daniel on 18/08/2017.
 */
public class Main {

        public static void main(String[] args) {

            boolean gameOver = true;
            int score = 800;
            int levelCompleted = 5;
            int bonus = 100;

            int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
            System.out.println("Your new final score was " + highScore);

            score = 10000;
            levelCompleted = 8;
            bonus = 200;

            highScore = calculateScore(gameOver, score, levelCompleted, bonus);
            System.out.println("Your new final score was " + highScore);

            int highScorePosition = calculateHighScorePosition(1500);
            displayHighScorePosition("Tim", highScorePosition);

            highScorePosition = calculateHighScorePosition(900);
            displayHighScorePosition("Bob", highScorePosition);

            highScorePosition = calculateHighScorePosition(400);
            displayHighScorePosition("Percy", highScorePosition);

            highScorePosition = calculateHighScorePosition(50);
            displayHighScorePosition("Gilbert", highScorePosition);
        }

        public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

            if (gameOver) {
                int finalScore = score + (levelCompleted * bonus);
                finalScore += 2000;
                return finalScore;
            }

            return -1;

        }

        public static void displayHighScorePosition(String playerName, int position) {

            System.out.println(
                    playerName
                    + " managed to get into position "
                    + position
                    + " on the high score table");
        }

        public static int calculateHighScorePosition(int playerScore) {
            int position;
            if (playerScore >= 1000) {
                position = 1;
            } else if (playerScore < 1000 && playerScore >= 500) {
                position = 2;
            } else if (playerScore >= 100 && playerScore < 500) {
                position = 3;
            } else {
                position = 4;
            }
            return position;

        }
}
