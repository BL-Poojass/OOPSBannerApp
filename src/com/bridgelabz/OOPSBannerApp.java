package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp – Final Version (UC8)
 * Renders the word "OOPS" as a banner using OOP principles and Map.
 * 
 * @author YourName
 * @version 1.0
 */
public class OOPSBannerApp {

    private static final int ROWS = 7;

    /**
     * Inner class to encapsulate character pattern
     */
    static class BannerCharacter {
        private final char character;
        private final String[] pattern;

        public BannerCharacter(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Builds map of character patterns
     */
    public static Map<Character, BannerCharacter> buildCharacterMap() {
        Map<Character, BannerCharacter> map = new HashMap<>();

        map.put('O', new BannerCharacter('O', new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        }));

        map.put('P', new BannerCharacter('P', new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        }));

        map.put('S', new BannerCharacter('S', new String[]{
                "  *****  ",
                " *     * ",
                " *       ",
                "  *****  ",
                "        *",
                " *     * ",
                "  *****  "
        }));

        map.put(' ', new BannerCharacter(' ', new String[]{
                "   ", "   ", "   ", "   ", "   ", "   ", "   "
        }));

        return map;
    }

    /**
     * Renders banner message
     */
    public static void renderBanner(String message, Map<Character, BannerCharacter> map) {
        for (int row = 0; row < ROWS; row++) {
            StringBuilder line = new StringBuilder();
            for (char ch : message.toCharArray()) {
                BannerCharacter bannerChar = map.get(ch);
                if (bannerChar != null) {
                    line.append(bannerChar.getPattern()[row]).append("  ");
                }
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        Map<Character, BannerCharacter> map = buildCharacterMap();
        renderBanner("OOPS", map);
    }
}
