package Lab2;

import java.util.Scanner;

public class Lab2_12 {

    static class Course {
        String courseId;
        String courseName;

        Course(String courseId, String courseName) {
            this.courseId = courseId;
            this.courseName = courseName;
        }

        public String getCourseInfo() {
            return courseId + ": " + courseName;
        }
    }

    static class Student {
        String studentName;
        Course enrolledCourse;

        Student(String studentName, Course enrolledCourse) {
            this.studentName = studentName;
            this.enrolledCourse = enrolledCourse;
        }

        public void displayEnrollment() {
            System.out.println("Student: " + studentName);
            System.out.println("Enrolled in: " + enrolledCourse.getCourseInfo());
        }
    }

    public static void main(String[] args) {

        Scanner course = new Scanner(System.in);
        
        System.out.print("Enter course Id : ");
        String id = course.nextLine();
        System.out.print("Enter course name : ");
        String name = course.nextLine();
        System.out.print("Enter Student name : ");
        String student = course.nextLine();

        Course c = new Course(id, name);
        Student s = new Student(student, c);

        s.displayEnrollment();

        course.close();
    }
}
