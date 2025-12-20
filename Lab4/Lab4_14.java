package Lab4;
import java.util.Scanner;

class ScoreBoard {

    private final String gameName;
    private final int[] scores;

    public ScoreBoard(String gameName, int[] scores) {
        this.gameName = gameName;
        this.scores = scores;
    }

    public ScoreBoard(ScoreBoard other) {
        this.gameName = other.gameName;
        this.scores = new int[other.scores.length];

        for (int i = 0; i < other.scores.length; i++) {
            this.scores[i] = other.scores[i];
        }
    }

    public void displayScores() {
        System.out.println(
                gameName + ": " +
                scores[0] + ", " +
                scores[1] + ", " +
                scores[2]
        );
    }
}

public class Lab4_14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String gameName = input.nextLine();

        int score1 = Integer.parseInt(input.nextLine());
        int score2 = Integer.parseInt(input.nextLine());
        int score3 = Integer.parseInt(input.nextLine());

        int[] originalScores = new int[] { score1, score2, score3 };

        ScoreBoard sb1 = new ScoreBoard(gameName, originalScores);
        ScoreBoard sb2 = new ScoreBoard(sb1);

        int changedValue = Integer.parseInt(input.nextLine());
        originalScores[0] = changedValue;

        sb1.displayScores();
        sb2.displayScores();
    }
}
