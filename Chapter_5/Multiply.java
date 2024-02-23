package Chapter_5;

// Multiply.java - This program prints the numbers 0 through 10 along
// with these values multiplied by 2 and by 10.
// Input:  None.
// Output: Prints the numbers 0 through 10 along with their values multiplied by 2 and by 10. 

public class Multiply
{
	public static void main(String args[])
	{		
		String head1 = "Number: ";
		String head2 = "Multiplied by 2: ";
		String head3 = "Multiplied by 10:  ";				
		int numberCounter;  // Numbers 0 through 10.
		int byTen;  // Stores the number multiplied by 10.
		int byTwo;  // Stores the number multiplied by 2.
		final int NUM_LOOPS = 10;  // Constant used to control loop.

		System.out.println("0 through 10 multiplied by 2 and by 10" + "\n");

		// Initialize loop control variable.
        numberCounter = 0;
		// Write your counter controlled while loop here
        while(numberCounter <= NUM_LOOPS){
		System.out.println(head1 + numberCounter);
        byTwo = numberCounter * 2;
        byTen = numberCounter * 10;
        // Multiply by 2
		System.out.println(head2 + byTwo);
        // Multiply by 10
		System.out.println(head3 + byTen);
		// Next number.
        numberCounter++;
        }
	} 
}  // End of Multiply class.