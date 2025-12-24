package Lab5;
import java.util.Scanner;

class ProjectTask {
    protected String description;
    protected int baseHours;

    public ProjectTask(String description, int baseHours) {
        this.description = description;
        this.baseHours = baseHours;
    }

    public double calculateCost() {
        return baseHours * 50.0;
    }
}

class ComplexTask extends ProjectTask {
    protected double setupFee;

    public ComplexTask(String description, int baseHours, double setupFee) {
        super(description, baseHours);
        this.setupFee = setupFee;
    }

    @Override
    public double calculateCost() {
        return (super.calculateCost() * 1.10) + setupFee;
    }
}

class SimpleTask extends ProjectTask {
    public SimpleTask(String description, int baseHours) {
        super(description, baseHours);
    }

    @Override
    public double calculateCost() {
        return super.calculateCost();
    }
}

public class Lab5_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String complexDescription = input.nextLine();
        int complexHours = input.nextInt();
        double setupFee = input.nextDouble();
        input.nextLine();

        String simpleDescription = input.nextLine();
        int simpleHours = input.nextInt();

        ProjectTask complexTask = new ComplexTask(complexDescription, complexHours, setupFee);
        ProjectTask simpleTask = new SimpleTask(simpleDescription, simpleHours);

        ProjectTask[] tasks = { complexTask, simpleTask };

        for (ProjectTask task : tasks) {
            System.out.println(task.calculateCost());
        }
    }
}
