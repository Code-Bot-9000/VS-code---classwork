package Chapter_4;

import javax.swing.*;

public class Airline 
{
	public static void main(String args[]) 
	{
		String passengerName = ""; 	// Passenger's name.
		String ageString = "";  // String version of passenger's age.
		int passengerAge = 0; 	// Passenger's age.

		passengerName = JOptionPane.showInputDialog("Enter passenger's name: ");
		ageString = JOptionPane.showInputDialog("Enter passenger's age: ");
		
		passengerAge = Integer.parseInt(ageString);
		
		// Test to see if this customer is eligible for a 25% discount. 
		if((passengerAge <= 6) || passengerAge >= 65){
			System.out.print("Customer Name: " + passengerName +
			"\nCustomer Age : " + passengerAge + "\nPassenger is eligible for a discount.");
		}
		else{
			System.out.print("Customer Name: " + passengerName +
			"\nCustomer Age : " + passengerAge + "\nPassenger is not eligible for a discount.");
		}
	}
}