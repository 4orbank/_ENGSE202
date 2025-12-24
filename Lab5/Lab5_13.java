package Lab5;
import java.util.Scanner;

class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    public int getClearanceLevel() {
        return 1;
    }
}

class Developer extends User {
    protected int projects;

    public Developer(String name, int projects) {
        super(name);
        this.projects = projects;
    }

    @Override
    public int getClearanceLevel() {
        return 2;
    }
}

class Admin extends Developer {
    protected String adminKey;

    public Admin(String name, int projects, String adminKey) {
        super(name, projects);
        this.adminKey = adminKey;
    }

    @Override
    public int getClearanceLevel() {
        return 3;
    }

    public String getAdminKey() {
        return adminKey;
    }
}

public class Lab5_13 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String developerName = userInput.nextLine();
        int developerProjects = userInput.nextInt();
        userInput.nextLine();

        String adminName = userInput.nextLine();
        int adminProjects = userInput.nextInt();
        userInput.nextLine();
        String adminKeyInput = userInput.nextLine();

        User u1 = new User("Guest");
        Developer d1 = new Developer(developerName, developerProjects);
        Admin a1 = new Admin(adminName, adminProjects, adminKeyInput);

        User[] userList = { u1, d1, a1 };

        int totalClearance = 0;
        for (User user : userList) {
            totalClearance += user.getClearanceLevel();
        }

        for (User user : userList) {
            if (user instanceof Admin) {
                Admin adminUser = (Admin) user;
                System.out.println(adminUser.getAdminKey());
            }
        }

        System.out.println(totalClearance);

        userInput.close();
    }
}

