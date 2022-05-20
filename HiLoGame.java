
/****************************************************************************************
 * CS21 - Java Programming
 * Author: Shai Baruch
 * Assignment: Project 3
 * Instructor: Prof. Kyle Muldrow
 * 
 * Name of class: HiLoGame
 * **************************************************************************************
 */
import java.util.*;
public class HiLoGame
{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Welcome to the GuessINT game!");
        System.out.println("The rules are simple: I'll pick a number between 1 and 100");
        System.out.println("and you will try to guess what number I picked.");
        System.out.println("You'll get a hint after each guess to help you guess the number.");
        System.out.println("The goal is to keep the number of guesses as few as possible!"); 
        System.out.println("Alright! Are you ready?? Let's play GuessINT!!");
        System.out.println("Guess a number between 1 - 100: ");
        int guess = 0;
        int num = r.nextInt(101)+1;
        int count = 0;
        do {
          
           guess = kb.nextInt();
          if (guess > num) {
             System.out.println("Guess lower");
             
            }
          if (guess < num) {
             System.out.println("Guess higher"); 
            }
            count++;
        } while (guess != num);
        
        if (count == 1) {
         System.out.println("CONGRATULATIONS!! You guessed it right on your first guess!");
        } else if (count > 1 && count <= 5) {
         System.out.println("NICE JOB! You guessed the right number after only " +count+ " guesses!");
        } else if (count > 5 && count <= 8) {
         System.out.println("Not bad! You guessed the right number after "+count+" guesses."); 
        } else {
          System.out.println("You guessed the right number after "+count+" guesses... NO SOUP FOR YOU!");   
        }
    }
}
