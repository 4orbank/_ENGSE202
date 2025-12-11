package Lab2;

import java.util.Scanner;

public class Lab2_4 {

    static class Student {
        String name;
        int midtermScore;
        int finalScore;

        Student(String name, int midtermScore, int finalScore) {
            this.name = name;
            this.midtermScore = midtermScore;
            this.finalScore = finalScore;
        }

        double calculateAverage() {
            return (midtermScore + finalScore) / 2.0;
        }

        void displaySummary() {
            double avg = calculateAverage();

            System.out.println("Name: " + name);
            System.out.println("Average Score: " + avg);

            if (avg >= 50.0) {
                System.out.println("Status: Pass");
            } else {
                System.out.println("Status: Fail");
            }
        }
    }

    public static void main(String[] args) {

        Scanner getdata = new Scanner(System.in);
        System.out.print("Enter studen name : ");
        String name = getdata.nextLine();
        System.out.print("Enter studen final score : ");
        int mid = getdata.nextInt();
        System.out.print("Enter studen mid score : ");
        int fin = getdata.nextInt();

        Student stu = new Student(name, mid, fin);

        stu.displaySummary();

        getdata.close();
    }
}
