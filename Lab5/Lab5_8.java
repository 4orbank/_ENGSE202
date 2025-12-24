package Lab5;

import java.util.Scanner;

class HumanProfile {
    protected String personalName;

    public HumanProfile(String personalName) {
        this.personalName = personalName;
    }

    public String getStatus() {
        return "Person: " + personalName;
    }
}

class LearningMember extends HumanProfile {
    protected int registrationCode;

    public LearningMember(String personalName, int registrationCode) {
        super(personalName);
        this.registrationCode = registrationCode;
    }

    @Override
    public String getStatus() {
        return "Student: " + personalName + ", ID: " + registrationCode;
    }
}

class WorkingMember extends HumanProfile {
    protected double currentSalary;

    public WorkingMember(String personalName, double currentSalary) {
        super(personalName);
        this.currentSalary = currentSalary;
    }

    public void applyBonus(double extraAmount) {
        currentSalary += extraAmount;
    }

    @Override
    public String getStatus() {
        return "Employee: " + personalName + ", Salary: " + currentSalary;
    }
}

public class Lab5_8 {
    public static void main(String[] args) {
        Scanner dataReceiver = new Scanner(System.in);

        String studentNameInput = dataReceiver.nextLine();
        int studentIdInput = Integer.parseInt(dataReceiver.nextLine());

        String employeeNameInput = dataReceiver.nextLine();
        double employeeSalaryInput = Double.parseDouble(dataReceiver.nextLine());

        HumanProfile studentObject =
                new LearningMember(studentNameInput, studentIdInput);

        HumanProfile employeeObject =
                new WorkingMember(employeeNameInput, employeeSalaryInput);

        HumanProfile[] profileList = { studentObject, employeeObject };

        for (HumanProfile profileUnit : profileList) {
            if (profileUnit instanceof WorkingMember) {
                WorkingMember staffUnit = (WorkingMember) profileUnit;
                staffUnit.applyBonus(1000.0);
            }
        }

        for (HumanProfile profileUnit : profileList) {
            System.out.println(profileUnit.getStatus());
        }

        dataReceiver.close();
    }
}
