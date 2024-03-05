package Chapter_6;

import javax.swing.JOptionPane;
public class MichiganCities {
    public static void main(String[] args) {

		// Declare variables.
		String inCity;  // name of city to look up in array.
		// Initialized array of cities in Michigan.
		String citiesInMichigan[] = {"Acme", "Albion", "Detroit", "Watervliet", "Coloma", "Saginaw", "Richland", "Glenn", "Midland", "Brooklyn"}; 
		boolean foundIt = false;  // Flag variable.
        
		// Get user input.
		inCity = JOptionPane.showInputDialog("Enter name of city: ");
        
		// Write your loop here. 
        for(int i = 0; i < citiesInMichigan.length;i++){ //runs through the loop
            if(inCity.equals(citiesInMichigan[i])){
                System.out.println("City found.");
                foundIt = true;
                if(foundIt = true)
                break;
            }
            else
            if(i == citiesInMichigan.length -1){
                System.out.println("Not a city in Michigan.");
                inCity = JOptionPane.showInputDialog("Enter name of city: ");
                i = 0;
            }
        }
	} 
} 