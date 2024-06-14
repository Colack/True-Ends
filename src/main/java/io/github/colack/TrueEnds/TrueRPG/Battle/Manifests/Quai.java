package io.github.colack.TrueEnds.TrueRPG.Battle.Manifests;

import io.github.colack.TrueEnds.TrueRPG.Battle.Manifest;

/**
 * This is a class that represents the Quai Manifest. The Manifests are going to be hard to code, so I'm going to hard code them.
 * @since 0.0.13
 */
public class Quai extends Manifest {
    public Quai() {
        super("Quai", "None", "From J.Z.'s soul, a manifestation of the Truth he so desires to show to the world manifests into his ability, Quai.", 100, 100, 10, 10, 10, 10, 10, new ArrayList<String>(), new ArrayList<String>(), new ArrayList<String>(), new ArrayList<String>(), new ArrayList<Attack>(), new ArrayList<Status>());
    }

    public String manifestSummonText() {
        int random = (int) (Math.random() * 5);

        return switch (random) {
            case 0 -> "I summon forth, Quai!";
            case 1 -> "Quai, show them the truth!";
            case 2 -> "From this false world, I summon Quai!";
            case 3 -> "Truth be told, Quai!";
            case 4 -> "Quai, from the depths of my soul, show them the truth!";
            default -> "Quai!";
        };
    }

    public String manifestDismissText() {
        int random = (int) (Math.random() * 5);

        return switch (random) {
            case 0 -> "Quai, return to my soul!";
            case 1 -> "Quai, return!";
            case 2 -> "Quai, return to the depths of my soul!";
            case 3 -> "Quai, return to the truth!";
            case 4 -> "Quai, return to the world of truth!";
            default -> "Quai!";
        };
    }
}
