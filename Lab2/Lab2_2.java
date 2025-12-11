package Lab2;

import java.util.Scanner;

public class Lab2_2 {
    static class Student {
        String studentId;
        String name;

        Student(String studentId, String name) {
            this.studentId = studentId;
            this.name = name;
        }

        void displayInfo() {
            System.out.println(studentId);
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        Scanner getstudent = new Scanner(System.in);
        
        System.out.print("Enter studenId : ");
        String id = getstudent.nextLine();
        System.out.print("Enter studen name : ");
        String fullname = getstudent.nextLine();

        Student stu = new Student(id, fullname);

        stu.displayInfo();

        getstudent.close();
    }
}
