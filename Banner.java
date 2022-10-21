/*
 * Banner class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */

/**
 * Represents a Scarecrow's banner.
 */
public class Banner {
    
    private String message;

    /**
     * Creates a new Banner with message m.
     * @param m String message.
     */
    public Banner(String m) {
        this.message = m;
    }

    /**
     * Displays the Scarecrow's Banner and alters the ASCII to fit the length of the message.
     */
    public void display() {
        System.out.print("   ****");
        for(int i = 0; i < this.message.length(); i++)
        {
            System.out.print("*");
        }
        System.out.println("****");
        System.out.print(" *** ~~");
        for(int i = 0; i < this.message.length(); i++)
        {
            System.out.print("~");
        }
        System.out.println("~~ ***");
        System.out.print("*** ~  ");
        System.out.print(this.message);
        System.out.println("  ~ ***");
        System.out.print(" *** ~~");
        for(int i = 0; i < this.message.length(); i++)
        {
            System.out.print("~");
        }
        System.out.println("~~ ***");
        System.out.print("   ****");
        for(int i = 0; i < this.message.length(); i++)
        {
            System.out.print("*");
        }
        System.out.println("****");
    }

    /**
     * Creates a new banner with a message.
     * @param args An empty array of strings.
     */
    public static void main(String[] args) {
        String message = "test";
        if(args.length > 0) {
            message = args[0];
        }
        //String message = args[0];
        Banner myBanner = new Banner(message);
        myBanner.display();
    }
}
