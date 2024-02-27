package Chapter_5;

// MovieGuide.java - This program allows each theater patron to enter a value from 0 to 4 
// indicating the number of stars that the patron awards to the Guide's featured movie of the 
// week. The program executes continuously until the theater manager enters a negative number to 
// quit. At the end of the program, the average star rating for the movie is displayed.  

import javax.swing.JOptionPane;

public class MovieGuide 
{
	public static void main(String args[])
	{                
		// Declare and initialize variables.
		double numStars;  // star rating.
		String numStarsString;  // string version of star rating
		double averageStars;  // average star rating.
		double totalStars = 0;  // total of star ratings.
		int numPatrons = 0;  // keep track of number of patrons			
	
		// Get input.	
		numStarsString = JOptionPane.showInputDialog("Enter a star rating from 0 to 4");
		// Convert to double.
		numStars = Double.parseDouble(numStarsString);
		if(numStars >= 0 && numStars <= 4){
		totalStars += numStars;
		numPatrons++;
	}
		// Write while loop here	
		while(numStars >= 0){
			numStars = Double.parseDouble(JOptionPane.showInputDialog("Enter a star rating from 0 to 4"));
			if(numStars >= 0 && numStars <= 4){
				totalStars += numStars;
				numPatrons++;
			}
			else
			while(numStars > 4){
				numStars = Double.parseDouble(JOptionPane.showInputDialog("Enter a star rating from 0 to 4"));
			}
		}	
		// Calculate average star rating
		averageStars = totalStars / numPatrons;
		System.out.println("Average Star Value: " + averageStars); 
	} 
}  // End of MovieGuide class.