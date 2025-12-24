package Lab5;
import java.util.Scanner;

class Document {
    protected String title;

    public Document(String title) {
        this.title = title;
    }

    public void displayDetails() {
        System.out.println("Document: " + title);
    }
}

class TextDocument extends Document {
    protected int wordCount;

    public TextDocument(String title, int wordCount) {
        super(title);
        this.wordCount = wordCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("Text: " + title + ", Words: " + wordCount);
    }
}

class PDFDocument extends Document {
    protected int pageCount;

    public PDFDocument(String title, int pageCount) {
        super(title);
        this.pageCount = pageCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("PDF: " + title + ", Pages: " + pageCount);
    }
}

public class Lab5_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String textTitle1 = input.nextLine();
        int wordCount1 = input.nextInt();
        input.nextLine();

        String pdfTitle1 = input.nextLine();
        int pageCount1 = input.nextInt();
        input.nextLine();

        String textTitle2 = input.nextLine();
        int wordCount2 = input.nextInt();
        input.nextLine();

        String pdfTitle2 = input.nextLine();
        int pageCount2 = input.nextInt();

        Document[] documents = new Document[4];
        documents[0] = new TextDocument(textTitle1, wordCount1);
        documents[1] = new PDFDocument(pdfTitle1, pageCount1);
        documents[2] = new TextDocument(textTitle2, wordCount2);
        documents[3] = new PDFDocument(pdfTitle2, pageCount2);

        int totalPages = 0;

        for (Document doc : documents) {
            if (doc instanceof PDFDocument) {
                PDFDocument pdf = (PDFDocument) doc;
                totalPages += pdf.pageCount;
            }
        }

        for (Document doc : documents) {
            doc.displayDetails();
        }

        System.out.println("Total Pages: " + totalPages);
    }
}
