package io.github.colack.TrueEnds.Debug;

import java.util.Scanner;
import java.io.File;

public class Debug {
    private static final Scanner scanner = new Scanner(System.in);

    public static void help() {
        System.out.println("Commands:");
        System.out.println("help - Displays this help message.");
        System.out.println("dialogue - Load a dialogue file.");
        System.out.println("exit - Exits the debug console.");
        System.out.println("clear - Clears the console.");
        System.out.println("VerifyFile - Verifies if a file exists.");
        System.out.println("pwd - Prints the current working directory.");
    }

    public static void debug() {
        System.out.println("Welcome to the True Ends debug console!");
        System.out.println("This is a debug function that can be used to pretty much do anything with the game.");
        System.out.println("Run the command 'help' to see a list of commands.");

        while (true) {
            System.out.print("TE-Debug> ");
            String command = scanner.nextLine();

            getCommand(command);
        }
    }

    public static void getCommand(String command) {
        switch (command) {
            case "help":
                help();
                break;
            case "dialogue":
                System.out.println("Enter the path to the dialogue file:");
                String path = scanner.nextLine();
                System.out.println("Enter the dialogue name:");
                String dialogue = scanner.nextLine();
                System.out.println("Enter the speaker:");
                String speaker = scanner.nextLine();

                DialogueLoad dialogueLoad = new DialogueLoad(dialogue, path, speaker);
                dialogueLoad.loadDialogue();
                break;
            case "exit":
                System.out.println("Exiting debug console.");
                System.exit(0);
                break;
            case "clear":
                System.out.print("\033[H\033[2J");
                System.out.flush();
                break;
            case "VerifyFile":
                System.out.println("Enter the path to the file:");
                String filePath = scanner.nextLine();

                File file = new File(filePath);
                if (file.exists()) {
                    System.out.println("File exists.");
                } else {
                    System.out.println("File does not exist.");
                }
                break;
            case "pwd":
                System.out.println(System.getProperty("user.dir"));
                break;
            default:
                System.out.println("Unknown command. Run 'help' to see a list of commands.");
                break;
        }
    }
}
