package io.github.colack.TrueEnds.TrueRPG.Battle.Effects;

import io.github.colack.TrueEnds.TrueRPG.Battle.Status;

public class Brainwash extends Status {
    public Brainwash() {
        super("Brainwashed", "Brainwash", 3, 0, 0);
    }

    public String returnStatusText() {
        int random = (int) (Math.random() * 5);

        return switch (random) {
            case 0 -> "is brainwashed!";
            case 1 -> "is confused!";
            case 2 -> "can't think straight!";
            case 3 -> "is seeing things!";
            case 4 -> "is acting strange!";
            default -> "acts like a zombie!";
        };
    }
}
