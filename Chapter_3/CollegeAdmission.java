package Chapter_3;

import java.util.Scanner;

public class CollegeAdmission {
    public static void main(String[] args) {
        // Declare variables   
      Scanner scanner = new Scanner(System.in);
      String testScoreString; //= "Enter student's test score:" ; 
	   String classRankString; // = "Enter student's class rank: ";
	   int testScore;
	   int classRank; 
     
     	// Get input and convert to correct data type    
		 System.out.print("Enter student's test score: ");
		 testScore = scanner.nextInt();
   
		 System.out.print("Enter student's class rank: ");
		  classRank = scanner.nextInt();

		  //testScore  = Integer.parseInt(testScoreString); 
		  //classRank = Integer.parseInt(classRankString);
		  
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
        scanner.close();
   } // End of main() method
} // End of CollegeAdmission class
