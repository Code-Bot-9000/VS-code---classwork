package Chapter_4;

// HouseSign.java - This program calculates prices for custom house signs.


public class HouseSign 
{
	public static void main(String args[])
	{
		// Declare and initialize variables here.
        // Charge for this sign.
        double charge = 0.00;
		// Number of characters.
        int numChars = 8;
		// Color of characters.
        String color = "gold";
		// Type of wood.
        String woodType = "oak";
        
		// Write assignment and if statements here as appropriate.	
        for(int i = 6; i <= numChars; i++){
            charge += 4;
        }

        if(color == "white" || color == "black"){
            charge += 0;
        }
        else{
            charge += 15;
        }

        if(woodType == "oak"){
            charge += 20;
        }


        charge += 35;

		// Output Charge for this sign.
		System.out.println("The charge for this sign is $" + charge);
	}
}