package Chapter_4;

import javax.swing.JOptionPane;
public class EmployeeBonus {
    public static void main(String[] args) {
        
		// Declare and initialize variables here.
		String employeeName; 
		double numTransactions; 
		String transactString;
		double numShifts; 
		String shiftString;
		double dollarValue;
		String dollarString;
		double score;
		double bonus;
		final double BONUS_1 = 50.00;
		final double BONUS_2 = 75.00;
		final double BONUS_3 = 100.00; 
		final double BONUS_4 = 200.00;
				
      	employeeName = JOptionPane.showInputDialog("Enter employee's name: ");
		shiftString = JOptionPane.showInputDialog("Enter number of shifts: ");
		transactString = JOptionPane.showInputDialog("Enter number of transactions: ");
		dollarString = JOptionPane.showInputDialog("Enter transactions dollar value: ");

		numShifts = Double.parseDouble(shiftString);
		numTransactions = Double.parseDouble(transactString);
		dollarValue = Double.parseDouble(dollarString);
		
		// Write your code here
		score = (dollarValue / numTransactions) / numShifts;

        if(score <= 30){
            bonus = BONUS_1;
        }else if(score > 30 && score < 70){
            bonus = BONUS_2;
        }else if(score > 69 && score < 200){
            bonus = BONUS_3;
        }else{
            bonus = BONUS_4;
		// Output.  
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Employee Bonus: $" + bonus);
	}
}
}

/*
Productivity Score	Bonus
<=30	$50
31–69	$75
70–199	$100
>= 200	$200
 */