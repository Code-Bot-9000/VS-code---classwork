package Chapter_4;

import java.util.Scanner;
public class LargeSmall 
{
	public static void main(String args[])
	{
		// Declare and initialize variables here.
		int largest;		// Largest of the three values.
		int smallest;		// Smallest of the three values.
		Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer >> ");
        int firstNumber = input.nextInt();
        System.out.print("Enter the second integer >> ");
        int secondNumber = input.nextInt();
        System.out.print("Enter the third integer >> ");
        int thirdNumber = input.nextInt();

        input.close();
		//Write assignment, if, or if else statements here as appropriate.	
        largest = smallest = firstNumber;
        System.out.println(largest);
        System.out.println(smallest);
        if(largest < secondNumber){
            largest = secondNumber;
        }
        else if(secondNumber < smallest){
            smallest = secondNumber;
        }
        if(largest < thirdNumber){
            largest = thirdNumber;
        }
        else if(thirdNumber < smallest){
            smallest = thirdNumber;
        }
		
		// Output largest and smallest number. 
		System.out.println("The largest value is " + largest);
		System.out.println("The smallest value is " + smallest);
	}
} 

/*
start
    Declarations
        int largest, smallest
        int firstNumber
        int secondNumber
        int thirdNumber 
    largest = smallest = firstNumber
    if(largest < secondNumber) then
        largest = secondNumber
    else
        if(secondNumber < smallest) then
            smallest = secondNumber
    endif
    if(largest < thirdNumber)
        largest = thirdNumber
    else
        if(thirdNumber < smallest) then
            smallest = thirdNumber
stop
 */


 /* 
1 < 2 < 3
2 < 3 < 1
3 < 1 < 2
1 > 2 > 3
2 > 3 > 1
3 > 1 > 2
 */