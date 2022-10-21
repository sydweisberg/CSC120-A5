/*
 * Boot class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */

/**
 * Represents a Scarecrow's shoes.
 */
public class Boot {
  
    private String direction;

    /**
     * Creates a new Boot with a direction.
     * @param direction String foot the boot will be. Has three options.
     */
    public Boot(String direction) {
        this.direction = direction.toLowerCase();
    }

    /**
     * Displays the Scarecrow's shoe based on the direction input.
     */
    public void display() {
        if(this.direction.equals("left")) {
          System.out.println("       |______|");
        }
        if(this.direction.equals("right")) {
          System.out.println("              |______|");
        }
        if(this.direction.equals("both")) {
          System.out.println("       |______||______|");
        }
    }

    /**
     * Creates a new boot.
     * @param args An empty array of strings.
     */
    public static void main(String[] args) {
        Boot myLeftBoot = new Boot("left");
        Boot myRightBoot = new Boot("right");
        myLeftBoot.display();
        myRightBoot.display();
    }
}
