package com.bridgelabz;

/**
 * UC4 - Banner using String array and loop
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] lines = {
                String.join(" ", "  *****  ", "  *****  ", " ******  ", "  ***** "),
                String.join(" ", " *     * ", " *     * ", " *     * ", " *     *"),
                String.join(" ", "*       *", "*       *", " *     * ", " *      "),
                String.join(" ", "*       *", "*       *", " ******  ", "  ***** "),
                String.join(" ", "*       *", "*       *", " *       ", "      * "),
                String.join(" ", " *     * ", " *     * ", " *       ", " *    * "),
                String.join(" ", "  *****  ", "  *****  ", " *       ", "  ***** ")
        };

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
