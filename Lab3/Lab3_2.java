package Lab3;

import java.util.Scanner;
import java.util.InputMismatchException;

// Class Player ใช้เก็บและจัดการคะแนนของผู้เล่น
class Player {

    // เก็บคะแนนของผู้เล่น
    private int score;

    // Constructor กำหนดค่าเริ่มต้นของคะแนน
    public Player(int initialScore) {
        this.score = initialScore;
    }

    // คืนค่าคะแนนปัจจุบัน
    public int getScore() {
        return score;
    }

    // อัปเดตคะแนนใหม่
    public void setScore(int newScore) {
        this.score = newScore;
    }
}

public class Lab3_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // รับคะแนนเริ่มต้น
        	System.out.print("Enter score : ");
            int initialScore = sc.nextInt();

            // รับคะแนนที่อัปเดต
            System.out.print("Enter update score : ");
            int updatedScore = sc.nextInt();

            // สร้างออบเจ็กต์ Player
            Player player = new Player(initialScore);

            // อัปเดตคะแนน
            player.setScore(updatedScore);

            // แสดงคะแนนล่าสุด
            System.out.print("Now score is : ");
            System.out.println(player.getScore());

        } catch (InputMismatchException e) {
            // กรณีผู้ใช้ป้อนข้อมูลไม่ใช่ตัวเลข
            System.out.println("Err: Pls enter a number only.");
        } finally {
            // ปิด Scanner เพื่อป้องกัน resource leak
            sc.close();
        }
    }
}
