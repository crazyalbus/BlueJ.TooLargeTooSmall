import java.util.Scanner;

/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    // my variables
    int number = (int) (Math.random() * 10);
    int guess;
    
    int count;
    boolean keepGuessing;


    public void main(){
        int count = 0;
        int oldGuess = -1;
        
         do {
             Scanner in = new Scanner(System.in);
            
             System.out.print("I'm thinking of a number between 0 and 10. What is it?");
         
             int guess = in.nextInt();

            if (guess != oldGuess) {
                count = count + 1;
            }
     
        if (guess == number) {
            System.out.println("You are right! You guessed it in " + count + " tries.");
            keepGuessing = false;
        } else if (guess < number) {
            System.out.println("Your guess is too low. Try again.");
            keepGuessing = true;
            oldGuess = guess;
        } else {System.out.println("Your guess is too high. Try again.");
            keepGuessing = true;
            oldGuess = guess;
        } 
       } while(keepGuessing);
}
}
    
    
