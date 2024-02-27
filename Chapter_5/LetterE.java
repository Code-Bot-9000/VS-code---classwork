package Chapter_5;

public class LetterE {
	public static void main(String args[])
	{	
		final int NUM_ACROSS = 3;  // Number of asterisks to print across.
		final int NUM_DOWN = 5;  // Number of asterisks to print down.
		int row;  // Loop control for row number.
		int column;  // Loop control for column number.

  		// Write a loop to control the number of rows.
		  for(row = 1;row <= NUM_DOWN;row++){
			  for(column = 1; column <= NUM_ACROSS;column++){
				if(row % 2 != 0 || column == 1){ //if the row# is odd OR the column(up and down) = 1 print("*")
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
				}
				// Figure out where to place this statement that prints a newline.
				System.out.println();
			}
			}
		} // End of LetterE class.