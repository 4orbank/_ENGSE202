package Lab3;

import java.util.Scanner;

class Player {
    private int score;

    public Player(int initialScore){
        this.score = initialScore;
    }

    public int getScore(){
        return score;
    }

    public void setScore(int newScore){
        score = newScore;
    }
}

public class Lab3_2 {
    public static void main(String[] args) {
        Scanner Getscore = new Scanner(System.in);
        System.out.print("กรอกคะแนนเริ่มต้น : ");
        int start = Getscore.nextInt();
        System.out.print("กรอกคะแนนใหม่ล่าสุด : ");
        int updated = Getscore.nextInt();
        
        Player p = new Player(start);
        p.setScore(updated);
        System.out.println("คะแนนปัจจุบัน : " + p.getScore()); 
    }
}
