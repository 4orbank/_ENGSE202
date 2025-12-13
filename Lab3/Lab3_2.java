package Lab3;

import java.util.Scanner;

class Player {

    private int score;

    public Player(int initialScore) {
        score = initialScore;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int newScore) {
        score = newScore;
    }
}

public class Lab3_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int initialScore = sc.nextInt();
        int updatedScore = sc.nextInt();

        Player p = new Player(initialScore);
        p.setScore(updatedScore);

        System.out.println(p.getScore());

        sc.close();
    }
}
