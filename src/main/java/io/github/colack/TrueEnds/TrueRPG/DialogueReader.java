package io.github.colack.TrueEnds.TrueRPG;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DialogueReader {
    static public String read(File text) {
        try {
            StringBuilder out = new StringBuilder();
            BufferedReader reader = new BufferedReader(new FileReader(text));
            String line = reader.readLine();
            while (line != null) {
                out.append(line).append("\n");
                line = reader.readLine();
            }
            return out.toString();
        } catch (IOException e) {
            ErrorHandler.ioError(e);
        }
        return null;
    }
}
