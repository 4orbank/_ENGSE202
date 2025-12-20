package Lab4;
import java.util.Scanner;

class Book {

    private String title;
    private String author;

    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

public class Lab4_1 {
    public static void main(String[] args) {

        Scanner Getcommand = new Scanner(System.in);

        int mode = Getcommand.nextInt();
        Getcommand.nextLine(); // ล้างบรรทัด

        Book book;

        if (mode == 1) {
            String title = Getcommand.nextLine();
            book = new Book(title);
        } else {
            String title = Getcommand.nextLine();
            String author = Getcommand.nextLine();
            book = new Book(title, author);
        }

        book.displayInfo();
    }
}
