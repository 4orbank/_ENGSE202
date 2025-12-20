package Lab4;
import java.util.Scanner;

class Resource {

    private String id;

    public Resource(String id) {
        this.id = id;
        System.out.println("Resource " + id + " created.");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Resource " + id + " finalized (destroyed).");
        super.finalize();
    }
}

public class Lab4_7 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        String firstId = input.nextLine();
        String secondId = input.nextLine();
        String thirdId = input.nextLine();

        Resource firstResource = new Resource(firstId);
        Resource secondResource = new Resource(secondId);
        Resource thirdResource = new Resource(thirdId);

        firstResource = null;
        secondResource = null;

        System.gc();
        System.runFinalization();
        Thread.sleep(100);

        thirdResource = null;

        System.gc();
        System.runFinalization();
        Thread.sleep(100);
    }
}
