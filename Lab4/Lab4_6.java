package Lab4;
import java.util.Scanner;

class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point move(int dx, int dy) {
        return new Point(x + dx, y + dy);
    }

    public void displayInfo() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

public class Lab4_6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int startX = input.nextInt();
        int startY = input.nextInt();
        int moveX = input.nextInt();
        int moveY = input.nextInt();

        Point p1 = new Point(startX, startY);
        Point p2 = p1.move(moveX, moveY);
        Point p3 = p2.move(moveX, moveY);

        p1.displayInfo();

        if (moveX != 0 || moveY != 0) {
            p2.displayInfo();
            p3.displayInfo();
        }
    }
}
