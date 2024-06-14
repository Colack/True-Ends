package io.github.colack.TrueEnds.TrueRPG.Battle;

public class Attack {
    public static String name = "None"; // The name of the attack.
    public static int damage = 0; // The damage of the attack.
    public static int critChance = 0; // The chance of the attack being a critical hit.
    public static int hitChance = 0; // The chance of the attack hitting the target.
    public static String description = "None"; // The description of the attack.
    public static boolean hitsAll = false; // Whether the attack hits all enemies or not.
    public static String type = "None"; // The type of the attack.

    public Attack(String name, int damage, int critChance, int hitChance, String description, boolean hitsAll, String type) {
        Attack.name = name;
        Attack.damage = damage;
        Attack.critChance = critChance;
        Attack.hitChance = hitChance;
        Attack.description = description;
        Attack.hitsAll = hitsAll;
        Attack.type = type;
    }

    public Attack() {
        Attack.name = "None";
        Attack.damage = 0;
        Attack.critChance = 0;
        Attack.hitChance = 0;
        Attack.description = "None";
        Attack.hitsAll = false;
        Attack.type = "None";
    }

    public String returnAttackText() {
        return "";
    }
}
