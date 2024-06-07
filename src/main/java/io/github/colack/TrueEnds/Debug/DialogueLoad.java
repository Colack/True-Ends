package io.github.colack.TrueEnds.Debug;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.ArrayList;
import java.lang.Throwable;

/**
 * DialogueLoad class for True Ends.
 * This is a debug function that will load the specified dialogue and display it to the user.
 * @since 0.0.13
 */
public class DialogueLoad {
    public String dialogue, path, speaker;

    public DialogueLoad(String dialogue, String path, String speaker) {
        this.dialogue = dialogue;
        this.path = path;
        this.speaker = speaker;
    }

    public boolean verifyDialogueExists() {
        File file = new File(path);
        return file.exists();
    }

    public void loadDialogue() {
        if (verifyDialogueExists()) {
            List<String> lines = new ArrayList<>();
            BufferedReader br = null;

            try {
                br = new BufferedReader(new FileReader(path));

                String line;
                while ((line = br.readLine()) != null) {
                    lines.add(line);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    assert br != null;
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Looking for dialogue: " + dialogue);

            boolean startPrinting = false;
            for (String line : lines) {
                if (startPrinting) {
                    if (line.startsWith("# ") || line.isEmpty()) {
                        break;
                    } else {
                        System.out.println(speaker + ": " + line);
                    }
                } else {
                    if (line.startsWith("# " + dialogue)) {
                        startPrinting = true;
                    }
                }
            }
        }
    }

}
