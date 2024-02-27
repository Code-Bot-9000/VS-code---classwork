package Chapter_5;

// LeftOrRight.java - This program calculates the total number of left-handed and right-handed
//                    students in a class.   
// Input:  L for left-handed; R for right handed; X to quit.
// Output: Prints the number of left-handed students and the number of right-handed students. 


import javax.swing.JOptionPane;

public class LeftOrRight
{
	public static void main(String args[])
	{		
		String leftOrRight = "";  // L or R for one student.
		int rightTotal = 0;  // Number of right-handed students.
		int leftTotal = 0;  // Number of left-handed students.
		//leftOrRight = JOptionPane.showInputDialog("Enter L if you are left-handed, R if you are right-handed or X to quit.");
		// Write your loop here.
		do{
			leftOrRight = JOptionPane.showInputDialog("Enter L if you are left-handed, R if you are right-handed or X to quit.");
			if(leftOrRight.equalsIgnoreCase("R")){ // can also use "".compareTo    //can also use "".equals
			rightTotal++;
			}
			else{
			if(leftOrRight.equalsIgnoreCase("L"))
			leftTotal++;
			}
			if(leftOrRight.equalsIgnoreCase("X")){
			break;
		}
		}while(true);

		// Output number of left or right-handed students.	
		System.out.println("Number of left-handed students: " + leftTotal);
		System.out.println("Number of right-handed students: " + rightTotal); 
	} 
} // End of LeftOrRight class. 