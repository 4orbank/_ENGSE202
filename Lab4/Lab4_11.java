package Lab4;
import java.util.Scanner;

class Configuration {

    private final String theme;
    private final int fontSize;
    private final boolean darkMode;

    public Configuration(String theme, int fontSize, boolean darkMode) {
        this.theme = theme;

        if (fontSize < 10) {
            this.fontSize = 10;
        } else if (fontSize > 20) {
            this.fontSize = 20;
        } else {
            this.fontSize = fontSize;
        }

        this.darkMode = darkMode;
    }

    public Configuration(Configuration base, Configuration user) {
        this.theme = user.theme;
        this.darkMode = user.darkMode;
        this.fontSize = base.fontSize;
    }

    public void displaySettings() {
        System.out.println(
                "Theme: " + theme +
                ", Size: " + fontSize +
                ", Dark: " + darkMode
        );
    }
}

public class Lab4_11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String baseTheme = input.nextLine();
        int baseFontSize = Integer.parseInt(input.nextLine());
        boolean baseDarkMode = Boolean.parseBoolean(input.nextLine());

        String userTheme = input.nextLine();
        int userFontSize = Integer.parseInt(input.nextLine());
        boolean userDarkMode = Boolean.parseBoolean(input.nextLine());

        Configuration baseConfig =
                new Configuration(baseTheme, baseFontSize, baseDarkMode);

        Configuration userConfig =
                new Configuration(userTheme, userFontSize, userDarkMode);

        Configuration finalConfig =
                new Configuration(baseConfig, userConfig);

        finalConfig.displaySettings();
    }
}
