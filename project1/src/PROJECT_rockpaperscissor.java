import java.util.Random;
public class PROJECT_rockpaperscissor {
    public static void main(String[] args) {

        // create random object
        Random ran = new Random();

        // generating integer
        int nxt = ran.nextInt();

        // Printing the random Number
        System.out.println
                ("The Randomly generated integer is : " + nxt);
        // Print next int value
        // Returns number between 0-9
        int num = ran.nextInt(10);

        // Printing the random number
        // between 0 and 9
        System.out.println
                ("Random number between 0 and 10 is : " + num);




    }
}
