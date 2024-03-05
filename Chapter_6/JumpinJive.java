package Chapter_6;

import javax.swing.JOptionPane;

public class JumpinJive {
    public static void main(String[] args) {
        
		// Declare variables.
		final int NUM_ITEMS = 5; // Named constant
		String addIn;  // Add-in ordered by customer.
		boolean foundIt = false;
		// Initialized array of add-ins.
		String addIns[] = {"Cream", "Cinnamon", "Chocolate", "Amaretto", "Whiskey"}; 
		// Initialized array of add-in prices.
		double addInPrices[] = {.89, .25, .59, 1.50, 1.75};
		double orderTotal = 2.00;  // All orders start with a 2.00 charge

		// Get user input.
		addIn = JOptionPane.showInputDialog("Enter coffee add-in or XXX to quit: ");
		// Write the rest of the program here.
        while (addIn.compareTo("XXX") != 0) {
            for(int i = 0;i <= NUM_ITEMS;i++){
            //does not print "Sorry we do not carry that." if it's true
            if(foundIt == true && i == NUM_ITEMS){
                i = 0;
                addIn = JOptionPane.showInputDialog("Enter coffee add-in or XXX to quit: ");
                foundIt = false; //reset back to false unless input is true
            }
            //we only want this message to print out if foundIt is not true && we'ew gone through the whole loop
            if(foundIt != true && i == NUM_ITEMS){
                foundIt = false;
                System.out.println("Sorry we do not carry that.");
                i = 0;
                addIn = JOptionPane.showInputDialog("Enter coffee add-in or XXX to quit: ");
            }
            if(addIn.equals(addIns[i])){
                System.out.println(addIns[i] + " price is $" + addInPrices[i]);
                orderTotal = orderTotal + addInPrices[i];
                foundIt = true;
            }
            if(addIn.compareTo("XXX") == 0){
                break;
            }
            }
        }
        System.out.println("Order Total is $" + orderTotal);
	} 
} 