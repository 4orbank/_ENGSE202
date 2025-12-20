package Lab4;
import java.util.Scanner;

class Color {

    private int red;
    private int green;
    private int blue;

    public Color(int r, int g, int b) {
        red = adjustValue(r);
        green = adjustValue(g);
        blue = adjustValue(b);
    }

    private int adjustValue(int value) {
        if (value < 0) {
            return 0;
        }
        if (value > 255) {
            return 255;
        }
        return value;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public void displayRGB() {
        System.out.println("R=" + red + ", G=" + green + ", B=" + blue);
    }
}

public class Lab4_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int redValue = input.nextInt();
        int greenValue = input.nextInt();
        int blueValue = input.nextInt();

        Color color = new Color(redValue, greenValue, blueValue);
        color.displayRGB();
    }
}
