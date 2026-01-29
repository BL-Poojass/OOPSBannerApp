package com.bridgelabz;

/**
 * UC7 - Character pattern stored in a class
 */
public class OOPSBannerApp {

    static class CharacterPattern {
        private final char character;
        private final String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPattern createO() {
        return new CharacterPattern('O', new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        });
    }

    public static CharacterPattern createP() {
        return new CharacterPattern('P', new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        });
    }

    public static CharacterPattern createS() {
        return new CharacterPattern('S', new String[]{
                "  *****  ",
                " *     * ",
                " *       ",
                "  *****  ",
                "       * ",
                " *     * ",
                "  *****  "
        });
    }

    public static void main(String[] args) {

        CharacterPattern o = createO();
        CharacterPattern p = createP();
        CharacterPattern s = createS();

        for (int i = 0; i < o.getPattern().length; i++) {
            System.out.println(o.getPattern()[i] + "  " + o.getPattern()[i] + "  " + p.getPattern()[i] + "  " + s.getPattern()[i]);
        }
    }
}
