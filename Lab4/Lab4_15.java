package Lab4;
import java.util.Scanner;

class AuditRecord {

    private final String user;
    private final String[] logMessages;

    private static int maxMessages = 3;

    public AuditRecord(String user) {
        this(user, new String[0]);
    }

    public AuditRecord(String user, String[] logs) {
        this.user = user;

        if (logs.length > maxMessages) {
            this.logMessages = new String[maxMessages];
            int startIndex = logs.length - maxMessages;
            for (int i = 0; i < maxMessages; i++) {
                this.logMessages[i] = logs[startIndex + i];
            }
        } else {
            this.logMessages = new String[logs.length];
            for (int i = 0; i < logs.length; i++) {
                this.logMessages[i] = logs[i];
            }
        }
    }

    public static void setPolicy(int max) {
        if (max > 0) {
            maxMessages = max;
            System.out.println("Policy set to " + max);
        } else {
            System.out.println("Invalid policy.");
        }
    }

    public AuditRecord addMessage(String message) {

        if (logMessages.length >= maxMessages) {
            System.out.println("Log is full.");
            return this;
        }

        String[] newLogs = new String[logMessages.length + 1];
        for (int i = 0; i < logMessages.length; i++) {
            newLogs[i] = logMessages[i];
        }
        newLogs[logMessages.length] = message;

        System.out.println(message + " added.");
        return new AuditRecord(user, newLogs);
    }

    public void displayLog() {
        System.out.print("User: " + user + ", Logs: " + logMessages.length + " [");
        for (int i = 0; i < logMessages.length; i++) {
            System.out.print(logMessages[i]);
            if (i < logMessages.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

public class Lab4_15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int policyValue = Integer.parseInt(input.nextLine());
        AuditRecord.setPolicy(policyValue);

        String userName = input.nextLine();
        AuditRecord record = new AuditRecord(userName);

        int commandCount = Integer.parseInt(input.nextLine());

        for (int i = 0; i < commandCount; i++) {
            String command = input.nextLine();

            if (command.equals("SET_POLICY")) {
                int newPolicy = Integer.parseInt(input.nextLine());
                AuditRecord.setPolicy(newPolicy);
            } else {
                record = record.addMessage(command);
            }
        }

        record.displayLog();
    }
}
