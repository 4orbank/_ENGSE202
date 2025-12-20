package Lab4;
import java.util.Scanner;

class TimePeriod {

    private int startHour;
    private int endHour;

    public TimePeriod() {
        this(9, 17);
    }

    public TimePeriod(int startHour, int endHour) {

        int validatedStart = startHour;
        int validatedEnd = endHour;

        if (validatedStart < 0) {
            validatedStart = 0;
        } else if (validatedStart > 23) {
            validatedStart = 23;
        }

        if (validatedEnd < 0) {
            validatedEnd = 0;
        } else if (validatedEnd > 23) {
            validatedEnd = 23;
        }

        if (validatedStart > validatedEnd) {
            int temp = validatedStart;
            validatedStart = validatedEnd;
            validatedEnd = temp;
        }

        this.startHour = validatedStart;
        this.endHour = validatedEnd;
    }

    public void displayPeriod() {
        System.out.println(startHour + ":00 - " + endHour + ":00");
    }
}

public class Lab4_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mode = input.nextInt();

        TimePeriod period;

        if (mode == 1) {
            period = new TimePeriod();
        } else {
            int startHour = input.nextInt();
            int endHour = input.nextInt();
            period = new TimePeriod(startHour, endHour);
        }

        period.displayPeriod();
    }
}
