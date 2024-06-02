package io.github.colack.TrueEnds.Game;

public class Attack {
    public String name;          // Name of the attack.
    public String description;   // Description of the attack.
    public int damage;           // Damage dealt by the attack.
    public String type;          // Physical, Magical, Mental, etc.
    public int cost;             // Cost of the attack.
    public int accuracy;         // Accuracy of the attack.
    public int critChance;       // Chance of a critical hit.
    public int critMultiplier;   // Multiplier for critical hits.
    public int statusChance;     // Chance of inflicting a status effect.
    public String statusEffect;  // Status effect inflicted by the attack.
    public int statusDuration;   // Duration of the status effect.
    public int levelRequirement; // Level required to use the attack.
    public int manaRequirement;  // Mana required to use the attack.
    public int sanityRequirement; // Sanity required to use the attack.
    public int luckRequirement;  // Luck required to use the attack.

    public Attack(String name, String description, int damage, String type, int cost, int accuracy, int critChance, int critMultiplier, int statusChance, String statusEffect, int statusDuration, int levelRequirement, int manaRequirement, int sanityRequirement, int luckRequirement) {
        this.name = name;
        this.description = description;
        this.damage = damage;
        this.type = type;
        this.cost = cost;
        this.accuracy = accuracy;
        this.critChance = critChance;
        this.critMultiplier = critMultiplier;
        this.statusChance = statusChance;
        this.statusEffect = statusEffect;
        this.statusDuration = statusDuration;
        this.levelRequirement = levelRequirement;
        this.manaRequirement = manaRequirement;
        this.sanityRequirement = sanityRequirement;
        this.luckRequirement = luckRequirement;
    }

    public void use() {
        // Not implemented yet.
        // When implemented, it will use the attack in battle.
    }
}
