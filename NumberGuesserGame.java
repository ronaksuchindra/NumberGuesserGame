import java.util.Random;
import java.util.Scanner;

class NumberGuesserGame {
  public static void main(String[] args) {

    //generate a random number from 1,100
    Random rand = new Random();
    int targetNumber = rand.nextInt(101);

    int guess = 0;
    int tries = 0;

    while (guess != targetNumber) {
      // ask the user to enter a number in the range
      System.out.println("Enter your guess from 1-100 here");
      
      Scanner sc = new Scanner(System.in);
      guess = sc.nextInt();

      
      //the code should check if the guess is greater than or less than the target number
      
      if (guess > targetNumber) {
        System.out.println("Your guess is too high. Try again");
        tries++;
      }//end of if
      
      if (guess < targetNumber) {
        System.out.println("Your guess is too low. Try again");
        tries++;
      }//end of if

      //Once the user guesses correctly, the program should stop and tell the user how many guesses they took
      if (guess == targetNumber){
        System.out.println("You guessed correctly");
        tries++;
        System.out.println("The number was " + targetNumber + " and you took " + tries + " guesses.");
      }

      
    }//end of while
    
    
  }// end of main method
}// end of class