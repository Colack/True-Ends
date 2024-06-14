package io.github.colack.TrueEnds.TrueRPG;

import java.time.LocalDateTime;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

/**
 * Handles errors that occur within TrueRPG.
 * @since 0.0.13
 */
public class ErrorHandler {
    public static void ioError(IOException e) {
        LocalDateTime now = LocalDateTime.now();
        String dateTime = now.toString();
        File file = new File(dateTime + "TrueRPGErrorLog.txt");

        try {
            FileWriter writer = new FileWriter(file);
            writer.write(e.getMessage());
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void customError(String message) {
        LocalDateTime now = LocalDateTime.now();
        String dateTime = now.toString();
        File file = new File(dateTime + "TrueRPGErrorLog.txt");

        try {
            FileWriter writer = new FileWriter(file);
            writer.write(message);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
