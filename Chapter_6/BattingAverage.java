package Chapter_6;

import javax.swing.JOptionPane;
public class BattingAverage {
    public static void main(String[] args) {
    
		// Declare a named constant for array size here.
        int SIZE = 8;
		// Declare array here.
		double[] averages = new double[SIZE];
		// Use this variable to store the batting average input by user.
		double battingAverage;

		// String version of batting average input by user.
		String averageString; 

		// Use these variables to store the minimim and maximum batting averages.
		double min, max;

		// Use these variables to store the total and the average.
		double total, average;

		// Write a loop to get batting averages from user and assign to array.
		int i;
        for(i = 0; i < averages.length;i++){
            // Assign value to array.
            averageString = JOptionPane.showInputDialog("Enter a batting average: ");
		    battingAverage = Double.parseDouble(averageString);
            averages[i] = battingAverage;
        }  
		   
		// Assign the first element in the array to be the minimum and the maximum.
		min = averages[0];
		max = averages[0];
		// Start out your total with the value of the first element in the array.
		total = averages[0]; 
		
		// Write a loop here to access array values starting with averages[1]
        System.out.println("averages["+ 1 + "] is: " + averages[0]);
		for(i = 1;i < averages.length;i++){
            System.out.println("averages["+ (i + 1) + "] is: " + averages[i]);

            // Within the loop test for minimum and maximum batting averages.
            if(min > averages[i])
                min = averages[i];
            if (max < averages[i]) 
                max = averages[i];
            // Also accumulate a total of all batting averages.
            total = total + averages[i];
        }
		
		   
		// Calculate the average of the 8 averages.
		average = total/SIZE;

		// Print the averages stored in the averages array. 
		System.out.println("Average batting average is " + average);
		// Print the maximum batting average, minimum batting average, and average batting average. 
        System.out.println("Minimum batting average is " + min);
        System.out.println("Maximum batting average is " + max);
	}
}