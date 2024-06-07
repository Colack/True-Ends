package io.github.colack.TrueEnds;

import io.github.colack.TrueEnds.Graphics.Window;

/**
 * Main class for True Ends.
 * @since 0.0.1
 */
class Main {
    public static void main(String[] args) {
        Window window = new Window();
        window.create();
        window.startGameThread();
    }
}
