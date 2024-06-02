package io.github.colack.TrueEnds.Config;

/**
 * Config class for True Ends.
 * This class is NOT used for configuration, it instead holds character stats and other game data.
 * @since 0.0.1
 */
public class Config {
    public static class DefaultPlayerStats {
        public static int health = 100;
        public static int maxHealth = 100;
        public static int attack = 10;
        public static int defense = 10;
        public static int speed = 10;
        public static int luck = 10;
        public static int level = 1;
        public static int experience = 0;
        public static int experienceToNextLevel = 100;
        public static int gold = 0;

        public static void levelUp() {
            level++;
            experience = 0;
            updateExperienceToNextLevel();
            health = maxHealth;
            maxHealth += 10;
            attack += 2;
            defense += 2;
            speed += 2;
            luck += 2;
        }

        private static int updateExperienceToNextLevel() {
            // This formula is subject to change.
            if (level <= 10) {
                return (int) Math.pow(level, 2) * 100;
            } else if (level <= 20) {
                return (int) Math.pow(level, 2) * 125;
            } else if (level <= 30) {
                return (int) Math.pow(level, 2) * 150;
            } else if (level <= 40) {
                return (int) Math.pow(level, 2) * 175;
            } else if (level <= 50) {
                return (int) Math.pow(level, 2) * 200;
            }

            /*
                Level 1: 1^2 * 100 = 100
                Level 11: 11^2 * 125 = 15125
                Level 21: 21^2 * 150 = 66150
                Level 31: 31^2 * 175 = 96125
                Level 41: 41^2 * 200 = 168100
                Level 50: 50^2 * 200 = 250000
             */

            return 0;
        }
    }

    public static class DefaultEnemyStats {
        public static int health = 100;
        public static int maxHealth = 100;
        public static int attack = 10;
        public static int defense = 10;
        public static int speed = 10;
        public static int luck = 10;
        public static int level = 1;
        public static int experience = 0;
        public static int gold = 0;
    }

    public static class DefaultItem {
        public static String name = "Item";
        public static String description = "This is an item.";
        public static int id = 0;
        public static int value = 0;
        public static int rarity = 0;
        public static int quantity = 1;
    }
}
