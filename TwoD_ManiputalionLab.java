import java.util.*;

public class TwoD_ManiputalionLab{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();
        int arr[][] = new int [rows] [columns];

        populateArray(arr);
        System.out.println("Generated 2D Array:");
        print2dArray(arr);
        add(arr);
        System.out.println("Transposed 2D Array:");
        transpose(arr);
    }

    /*
     *populated the array with random numbers between 1 and 10 
     * @param arr
     */
    private static void populateArray(int[][] arr) {
        for(int row = 0;row < arr.length; row++){  //controls the row
            for(int column = 0; column< arr[row].length;column++){  //controls the column
                arr[row][column] = (int)(Math.random() * 10 + 1);   //populates the columns by rows with random numbers
            }
            System.out.println();
        }
    }

    /*
     *prints the 2d array 
     * @param arr
     */
    private static void print2dArray(int[][] arr) {
        for(int row = 0;row < arr.length; row++){   //controls the row
            for(int column = 0; column< arr[row].length;column++){   //controls the column
                System.out.print(arr[row][column] + "\t");   //prints by row
            }
            System.out.println();
        }
    }

    /*
     * Sums all of the elements in the array
     * finds the maximum and minimum
     * @param arr
     */
    private static void add(int[][] arr){
        int sum = 0;
        int max = arr[0][0];
        int min = arr[0][0];
        for(int row = 0;row < arr.length; row++){   //controls the row
            for(int column = 0; column< arr[row].length;column++){   //controls the column
                //adds the sum as it runs through the array
                sum = sum + arr[row][column];
                //sets the minimum value if less than the current minimum value
                if(arr[row][column] < min){
                    min = arr[row][column];
                }
                //sets the maximum value if greater than the current maximum value
                if(arr[row][column] > max){
                    max = arr[row][column];
                }
            }
        }
        System.out.println("Sum of all elements: " +sum);
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    } 

    /*
     * transposes the array
     * @param arr
     */
    private static void transpose(int[][]arr){
        int row = 0;
        int column = 0;
        int rowLength = arr[row].length;
        int colLength = arr.length;
        //in order to transpose the array, we have to make the rows run the column length and the columns run the row length
        for(row = 0;row < rowLength; row++){   //controls the row
            for(column = 0; column< colLength;column++){   //controls the column
                //switch the rows and columns so that the size of the array matches what we assigned
                System.out.print(arr[column][row]+"\t");
            }
            System.out.println();
        }
    }
}