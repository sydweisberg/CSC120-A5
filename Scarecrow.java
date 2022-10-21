/*
 * Scarecrow class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */

/**
 * Represents an ASCII Scarecrow.
 */
class Scarecrow {

    private Pumpkin head;
    private Shirt body;
    private Pants legs;
    private Boot shoes;
    private Banner sign;

    /**
     * Creates a new Scarecrow with a head, body, legs, shoes, and sign.
     */
    public Scarecrow(Pumpkin h, Shirt s, Pants p, Boot b, Banner ba) {
        head = h;
        body = s; 
        legs = p;
        shoes = b;
        sign = ba;

    }
    /**
     * Displays the different Scarecrow objects in the correct order.
     */
    public void display() {
        sign.display();
        head.display();
        body.display();
        legs.display();
        shoes.display();
    }

    /**
     * Takes an input from the command line and creates a Scarecrow that utilizes the message.
     * @param args An empty array of strings.
     */
    public static void main(String[] args) {
        String message = "HAPPY FALL!";
        if(args.length > 0) {
            message = args[0]; // Message is set equal to the input in the console following java Scarecrow
        }
        Scarecrow myScarecrow = new Scarecrow(new Pumpkin(), new Shirt(), new Pants(), new Boot("both"), new Banner(message));

        myScarecrow.display();
    }

}
