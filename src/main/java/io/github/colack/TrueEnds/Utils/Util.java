package io.github.colack.TrueEnds.Utils;

/**
 * Util class for True Ends.
 * @since 0.0.1
 */
public class Util {
    public String config = "config.file";
    public String save = "save.file";

    public static void TrueEndsError(String message, boolean isFatal, boolean isDebug) {
        if (isDebug) {
            System.out.println("True-Ends Debug Error: " + message);
        } else {
            System.out.println("True-Ends Error: " + message);
        }

        if (isFatal) {
            System.exit(1);
        }
    }

    public static void loadConfig() {

    }

    public static void saveConfig() {

    }

    public static void loadSave() {

    }

    public static void saveSave() {

    }

    public static void log(String message) {
        System.out.println("True-Ends Log: " + message);
    }
}
