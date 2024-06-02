package io.github.colack.TrueEnds;

import io.github.colack.TrueEnds.Game.Game;

/**
 * Main class for True Ends.
 * @since 0.0.1
 */
class Main {
    public static void main(String[] args) {
        // Create a new game object and start the game.
        Game trueends = new Game(true);
        trueends.start();
    }
}

// Path: src/main/java/io/github/colack/TrueEnds/Main.java