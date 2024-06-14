package io.github.colack.TrueEnds.TrueRPG.Battle.Effects;

import io.github.colack.TrueEnds.TrueRPG.Battle.Status;

public class Suicidal extends Status {
    public Suicidal() {
        super("Suicidal", "Suicidal", 3, 0, 0);
    }

    public String returnStatusText() {
        int random = (int) (Math.random() * 5);

        return switch (random) {
            case 0 -> "is suicidal!";
            case 1 -> "is thinking about ending it all!";
            case 2 -> "is contemplating life!";
            case 3 -> "is thinking about death!";
            case 4 -> "is thinking about a way to die!";
            default -> "is completely suicidal!";
        };
    }
}
