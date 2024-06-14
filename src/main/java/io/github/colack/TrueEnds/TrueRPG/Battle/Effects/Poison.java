package io.github.colack.TrueEnds.TrueRPG.Battle.Effects;

import io.github.colack.TrueEnds.TrueRPG.Battle.Status;

public class Poison extends Status {
    public Poison() {
        super("Poisoned", "Poison", 3, 0, 0);
    }

    public String returnStatusText() {
        int random = (int) (Math.random() * 5);

        return switch (random) {
            case 0 -> "is poisoned!";
            case 1 -> "is feeling sick!";
            case 2 -> "is feeling weak!";
            case 3 -> "is feeling nauseous!";
            case 4 -> "is feeling ill!";
            default -> "is feeling poisoned!";
        };
    }
}
