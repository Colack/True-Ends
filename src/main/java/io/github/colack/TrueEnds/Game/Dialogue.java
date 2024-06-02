package io.github.colack.TrueEnds.Game;

import java.lang.Thread;
import java.lang.Throwable;

/**
 * Dialogue class for True Ends.
 * @since 0.0.1
 */
public class Dialogue {
    public String text;
    public String name;
    public String[] options;
    public int textSpeed;

    public Dialogue(String text, String name, String[] options, int textSpeed) {
        this.text = text;
        this.name = name;
        this.options = options;
        this.textSpeed = textSpeed;
    }

    public Dialogue(String text, String name, String[] options) {
        this.text = text;
        this.name = name;
        this.options = options;
        this.textSpeed = 1;
    }

    public Dialogue(String text, String name) {
        this.text = text;
        this.name = name;
        this.options = new String[0];
        this.textSpeed = 1;
    }

    public Dialogue(String text) {
        this.text = text;
        this.name = "";
        this.options = new String[0];
        this.textSpeed = 1;
    }

    public Dialogue() {
        this.text = "";
        this.name = "";
        this.options = new String[0];
        this.textSpeed = 1;
    }

    /**
     * Print dialogue in the in-game console.
     * @since 0.0.1
     * @usage dialogue.print();
     */
    public void print() {
        // Not implemented yet.
        // When implemented, it will use the textSpeed variable to determine how fast the text is printed.
    }
}
