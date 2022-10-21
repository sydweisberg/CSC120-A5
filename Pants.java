/*
 * Pants class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */

/**
 * Represents a Scarecrow's pants.
 */
public class Pants {
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";
    
    /**
     * Displays the Scarecrow's pants.
     */
    public void display() {
        System.out.println(ANSI_CYAN + "        |   | \\/  |  |");
        System.out.println("        |__/  ||  \\__|");
        System.out.println("        |     ||     |");
        System.out.println("        |     ||     |");
        System.out.println("        |     ||     |");
        System.out.println("        |     ||     |");
        System.out.println("        |     ||     |");
        System.out.println("        |_____||_____|"+ ANSI_RESET);
    }

    /**
     * Creates a new pair of pants.
     * @param args An empty array of strings.
     */
    public static void main(String[] args) {
        Pants myPants = new Pants();
        myPants.display();
    }
}
