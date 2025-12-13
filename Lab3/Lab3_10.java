package Lab3;

import java.util.Scanner;

class SystemLogger {

    private static int currentLogLevel = 1; // 1 = INFO

    // แปลงระดับเป็นชื่อ
    private static String getLevelName(int level) {
        if (level == 1) {
            return "INFO";
        } else if (level == 2) {
            return "DEBUG";
        } else if (level == 3) {
            return "ERROR";
        } else {
            return "UNKNOWN";
        }
    }

    // ตั้งค่าระดับ Log
    public static void setLogLevel(int newLevel) {
        if (newLevel >= 1 && newLevel <= 3) {
            currentLogLevel = newLevel;
            System.out.println("Log level set to " + getLevelName(newLevel));
        } else {
            System.out.println("Invalid log level.");
        }
    }

    // แสดง Log
    public static void log(int messageLevel, String message) {
        if (messageLevel >= currentLogLevel) {
            System.out.println("[" + getLevelName(messageLevel) + "]: " + message);
        }
    }
}

public class Lab3_10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // เคลียร์บรรทัด

        for (int i = 0; i < n; i++) {

            String command = sc.nextLine();

            if (command.equals("SET")) {
                int level = sc.nextInt();
                sc.nextLine(); // เคลียร์บรรทัด
                SystemLogger.setLogLevel(level);

            } else if (command.equals("LOG")) {
                int msgLevel = sc.nextInt();
                sc.nextLine(); // เคลียร์บรรทัด
                String message = sc.nextLine();
                SystemLogger.log(msgLevel, message);
            }
        }

        sc.close();
    }
}
