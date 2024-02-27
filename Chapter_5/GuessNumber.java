package Chapter_5;

// GuessNumber.java - This program allows a user to guess a number between 1 and 10. 
// Input:  User guesses numbers until they get it right. 
// Output: Tells users if they are right or wrong. 

import javax.swing.JOptionPane;

public class GuessNumber {
    
    public static void main(String args[])
	{		
		int number;  // Number to be guessed.
		int userNumber;  // User's guess.
		String stringNumber;  // String version of user's guess.
		String keepGoing;  // Contains a "Y" or "N" determining if the user wants to continue.
		
		number = 1 + (int) (Math.random() * 10); // Generate random number.
		
		// Prime the loop.
		keepGoing = JOptionPane.showInputDialog("Do you want to guess a number? Enter Y or N");
      // Validate input.	
		
		// Enter loop if they want to play.
		while(keepGoing.compareTo("Y") == 0) //0 = yes  // 1 = no
		{
			// Get user's guess.
			stringNumber = JOptionPane.showInputDialog("I'm thinking of a number. .\n Try to guess by entering a number between 1 and 10");
			userNumber = Integer.parseInt(stringNumber); 
			// Validate input.		
            while(userNumber < 1 || userNumber > 10){
                stringNumber = JOptionPane.showInputDialog("I'm thinking of a number. .\n Try to guess by entering a number between 1 and 10");
			    userNumber = Integer.parseInt(stringNumber);
            }
			// Test to see if the user guessed correctly.
			if(userNumber == number)
			{
				keepGoing = "N"; 
				System.out.println("You are a genius. That's correct!");
			}
			else
			{
				keepGoing = JOptionPane.showInputDialog("That's not correct. Do you want to guess again? Enter Y or N");
				// Validate input.	
                while(keepGoing.compareTo("Y") == 1 && keepGoing.compareTo("N") == 1){
                    keepGoing = JOptionPane.showInputDialog("That's not correct. Do you want to guess again? Enter Y or N");
                }
			}
	
		} // End of while loop.
	}	
} // End of GuessNumber class.