package Chapter_3;

import javax.swing.JOptionPane;

public class CollegeAdmission {
    public static void main(String[] args) {
      // Declare variables   
      String testScoreString; //= "Enter student's test score:" ; 
	   String classRankString; // = "Enter student's class rank: ";
	   int testScore;
	   int classRank; 
     
     	// Get input and convert to correct data type    
      testScoreString = JOptionPane.showInputDialog("Enter student's test score:");
      JOptionPane.showMessageDialog(null, testScoreString);

      classRankString = JOptionPane.showInputDialog("Enter student's class rank:");
      JOptionPane.showMessageDialog(null, classRankString);
   
		testScore  = Integer.parseInt(testScoreString); 
		classRank = Integer.parseInt(classRankString);
		  
     	// Test using admission requirements and print Accept or Reject 
		if( testScore >= 90 )
		{
			if( classRank >= 25)
			{
			   System.out.println("Accept");
			}
			else
	   		System.out.println("Reject"); 
		}
     	else 
        {
           if (testScore >= 80) {
              if (classRank >= 50)
                 System.out.println("Accept");
              else
                 System.out.println("Reject");
           } else {
              if (testScore >= 70) {
                 if (classRank >= 75)
                    System.out.println("Accept");
                 else
                    System.out.println("Reject");
              } else
                 System.out.println("Reject");
           }
        }
   } // End of main() method
} // End of CollegeAdmission class
