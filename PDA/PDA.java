import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Permissible Dating Age program
 *
 * @author Mr. Jaffe
 * @version 2021-06-22 Version 1.0.0
 */
public class PDA
{
    int age;
    
    /**
     * Constructor for objects of class PDA
     */
    public PDA()
    {
        // We don't need to do anything in the constructor for
        // our program.
    }
    
    public int getYoungerAge(int age){
        return (age / 2) + 7;
    }
    
    public int getOlderAge(int age) {
        return (age - 7) * 2;
    }
    
    int LOWER_BOUND = 14;
    /**
     * This is the main event loop for our PDA program
     */
    public void runEventLoop() {
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue= true;
        
        while (true) {
            System.out.println("How old are you?");
            try {
                age = scanner.nextInt();
                System.out.println(age);
            } catch (InputMismatchException error) {
                scanner.next();
                System.out.println("please enter an integer");
            }
            if (age < LOWER_BOUND) {
                System.out.println(age+" is too young!!");
            } else {
                System.out.println("Computations go here");
            }
        }
    }

    /**
     * The main method instantiates and runs the program
     */
    public static void main (String[] args) {
        PDA pda = new PDA();
        pda.runEventLoop();
    }
}
