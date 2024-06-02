package io.github.colack.TrueEnds.Game;

public class Player {
    public String name;
    public int health, maxHealth, attack, defense, level, exp, maxExp, gold, mana, maxMana, speed, sanity, maxSanity, luck;
    public boolean isDead, isDebug;
    public String[] inventory;
    public String[] equipment;
    public String[] skills;

    private int[] stats = {health, maxHealth, attack, defense, level, exp, maxExp, gold, mana, maxMana, speed, sanity, maxSanity, luck};

    public Player(String name, int health, int maxHealth, int attack, int defense, int level, int exp, int maxExp, int gold, int mana, int maxMana, int speed, int sanity, int maxSanity, int luck, boolean isDead, boolean isDebug, String[] inventory, String[] equipment, String[] skills) {
        this.name = name;
        this.health = health;
        this.maxHealth = maxHealth;
        this.attack = attack;
        this.defense = defense;
        this.level = level;
        this.exp = exp;
        this.maxExp = maxExp;
        this.gold = gold;
        this.mana = mana;
        this.maxMana = maxMana;
        this.speed = speed;
        this.sanity = sanity;
        this.maxSanity = maxSanity;
        this.luck = luck;
        this.isDead = isDead;
        this.isDebug = isDebug;
        this.inventory = inventory;
        this.equipment = equipment;
        this.skills = skills;
    }

    public Player() {
        this.name = "Player";
        this.health = 100;
        this.maxHealth = 100;
        this.attack = 10;
        this.defense = 10;
        this.level = 1;
        this.exp = 0;
        this.maxExp = 100;
        this.gold = 0;
        this.mana = 100;
        this.maxMana = 100;
        this.speed = 10;
        this.sanity = 100;
        this.maxSanity = 100;
        this.luck = 10;
        this.isDead = false;
        this.isDebug = false;
        this.inventory = new String[10];
        this.equipment = new String[10];
        this.skills = new String[10];
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean isDead) {
        this.isDead = isDead;
    }

    public boolean isDebug() {
        return isDebug;
    }

    public void setDebug(boolean isDebug) {
        this.isDebug = isDebug;
    }

    public int[] getStats() {
        return stats;
    }

    public void setStats(int[] stats) {
        this.stats = stats;
    }

    public String[] getInventory() {
        return inventory;
    }

    public void setInventory(String[] inventory) {
        this.inventory = inventory;
    }

    public String[] getEquipment() {
        return equipment;
    }

    public void setEquipment(String[] equipment) {
        this.equipment = equipment;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
