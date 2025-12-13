package Lab3;

import java.util.Scanner;

// Singleton class
class SystemConfig {

    private static SystemConfig instance; // ออบเจ็กต์เดียวของคลาส

    private String serverUrl;
    private int maxConnections;

    // Private constructor
    private SystemConfig() {
        this.serverUrl = "default.server.com";
        this.maxConnections = 10;
    }

    // Public static method เพื่อขอ instance
    public static SystemConfig getInstance() {
        if (instance == null) {
            instance = new SystemConfig();
        }
        return instance;
    }

    // Getter / Setter
    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String url) {
        this.serverUrl = url;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(int count) {
        if (count > 0) {
            this.maxConnections = count;
            System.out.println("Max connections set.");
        } else {
            System.out.println("Invalid count.");
        }
    }
}

// Main class
public class Lab3_11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        for (int i = 0; i < N; i++) {
            String command = sc.nextLine();

            SystemConfig config = SystemConfig.getInstance();

            switch (command) {
                case "SET_URL":
                    String newUrl = sc.nextLine();
                    config.setServerUrl(newUrl);
                    break;

                case "SET_MAX":
                    int newMax = Integer.parseInt(sc.nextLine());
                    config.setMaxConnections(newMax);
                    break;

                case "SHOW":
                    System.out.println("URL: " + config.getServerUrl());
                    System.out.println("MAX: " + config.getMaxConnections());
                    break;
            }
        }

        sc.close();
    }
}
