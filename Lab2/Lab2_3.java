package Lab2;

import java.util.Scanner;

public class Lab2_3 {
    static class Student {
        String studentId;
        String name;

        static int Count = 0;
        Student(String studentId, String name) {
            this.studentId = studentId;
            this.name = name;
            Count++;
        }
    }

    public static void main(String[] args) {
        Scanner getstudents = new Scanner(System.in);

        System.out.print("Enter the number of students in the class : ");
        int n = getstudents.nextInt();
        getstudents.nextLine();

        for (int i = 1; i <= n; i++) {   // แก้จาก < เป็น <=
            System.out.print("Enter studenId" + i + ": ");
            String id = getstudents.nextLine();
            System.out.print("Enter studen name" + i + ": ");
            String name = getstudents.nextLine();

            new Student(id, name);
        }

        System.out.println(Student.Count);

        getstudents.close();
    }
}
