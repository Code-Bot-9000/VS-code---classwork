package Chapter_5;

public class NewestMultiply {
    
	public static void main(String args[])
	{		
		String head1 = "Number: ";
		String head2 = "Multiplied by 2: ";
		String head3 = "Multiplied by 10:  ";				
		int numberCounter = 0;  // Numbers 0 through 10.
		int byTen;  // Stores the number multiplied by 10.
		int byTwo; 	// Stores the number multiplied by 2.
		final int NUM_LOOPS = 10;  // Constant used to control loop.

		System.out.println("0 through 10 multiplied by 2 and by 10" + "\n");

		// Write do while loop
        do{
            numberCounter++;
            byTen = numberCounter * 10;
            byTwo = numberCounter * 2;
            System.out.println(head1 + numberCounter);
            System.out.println(head2 + byTwo);
            System.out.println(head3 + byTen);
            System.out.println();
        }while(numberCounter < NUM_LOOPS);
	} 
} // End of NewestMultiply class.