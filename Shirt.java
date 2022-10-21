/*
 * Shirt class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */

/**
 * Represents a Scarecrow's shirt.
 */
public class Shirt {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
   
    /**
     * Displays the Scarecrow's shirt.
     */
    public void display() {
        System.out.println(ANSI_RED + "        __,--./|.--,__");
        System.out.println("      .`   \\ \\ / /    `.");
        System.out.println("    .`      \\ | /       `.");
        System.out.println("   /   /     ^|^      \\   \\");
        System.out.println("  /   / |     |o     | \\   \\");
        System.out.println(" /===/  |     |      |  \\===\\");
        System.out.println("/___/   |     |o     |   \\___\\");
        System.out.println("        |     |      |");
        System.out.println("        |     |o     |");
        System.out.println("        |_____/\\_____|"+ ANSI_RESET);
    }

    /**
     * Creates a new shirt.
     * @param args An empty array of strings.
     */
    public static void main(String[] args) {
        Shirt myShirt = new Shirt();
        myShirt.display();
    }
}
