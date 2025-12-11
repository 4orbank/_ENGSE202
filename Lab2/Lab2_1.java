package Lab2;

import java.util.Scanner;

public class Lab2_1 {
    static class Student {
        String studentId;
        String name;

        Student(String studentId, String name) {
            this.studentId = studentId;
            this.name = name;
        }
    }

    public static void main(String[] args) {

        Scanner getstudent = new Scanner(System.in);
        System.out.print("Enter StudenId : ");
        String id = getstudent.nextLine();
        System.out.print("Enter Name : ");
        String fullname = getstudent.nextLine();

        Student stu = new Student(id, fullname);
        
        System.out.println(stu.studentId);
        System.out.println(stu.name);

        getstudent.close();
    }
}
