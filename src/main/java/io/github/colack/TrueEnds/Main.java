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

        // Print the current directory
        System.out.println("Current Directory: " + System.getProperty("user.dir"));

        // Create a new sprite for the window.
        trueends.createSprite("player", 32, 32, true, new String[] {"src/main/resources/sprites/PLACEHOLDER_ANY.png"});
        trueends.drawSprite("player");

        // Make a loop for player input
        while (true) {
            trueends.getInput();
        }
    }
}

// Path: src/main/java/io/github/colack/TrueEnds/Main.java