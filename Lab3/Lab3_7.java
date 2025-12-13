package Lab3;

import java.util.Scanner;

class Employee {

    private String employeeId;
    private String department;

    public Employee(String employeeId, String department) {
        this.employeeId = employeeId;
        this.department = department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String newDepartment) {
        department = newDepartment;
    }
}

public class Lab3_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String employeeId = sc.nextLine();
        String department = sc.nextLine();
        String newDepartment = sc.nextLine();

        Employee emp = new Employee(employeeId, department);
        emp.setDepartment(newDepartment);

        System.out.println(emp.getEmployeeId());
        System.out.println(emp.getDepartment());

        sc.close();
    }
}
