package Lab4;
import java.util.Scanner;

class Schedule {
    private int hour;

    public Schedule(int hour) {
        this.hour = hour;
    }

    public void setHour(int newHour) {
        this.hour = newHour;
    }

    public int getHour() {
        return hour;
    }

    public Schedule(Schedule other) {
        this.hour = other.hour;
    }
}

class EmployeeSchedule {

    private String name;
    private Schedule schedule;

    public EmployeeSchedule(String name, Schedule schedule) {
        this.name = name;
        this.schedule = schedule;
    }

    public EmployeeSchedule(EmployeeSchedule other) {
        this.name = other.name;
        this.schedule = new Schedule(other.schedule);
    }

    public void displaySchedule() {
        System.out.println(name + ": " + schedule.getHour() + ":00");
    }
}

public class Lab4_12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String employeeName = input.nextLine();
        int startHour = Integer.parseInt(input.nextLine());
        int newHour = Integer.parseInt(input.nextLine());

        Schedule originalSchedule = new Schedule(startHour);

        EmployeeSchedule emp1 =
                new EmployeeSchedule(employeeName, originalSchedule);

        EmployeeSchedule emp2 =
                new EmployeeSchedule(emp1);

        originalSchedule.setHour(newHour);

        emp1.displaySchedule();
        emp2.displaySchedule();
    }
}
