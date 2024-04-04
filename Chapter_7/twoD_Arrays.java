package Chapter_7;

import java.util.Scanner;
public class twoD_Arrays {
    static Scanner kb = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("What number bewteen 1 and 20 are you looking for?");
        int arr[][] = new int [3] [5];
        populateArray(arr);
        int numberSearch = kb.nextInt();
        print2dArray(arr);
        lookForValue(arr, numberSearch);
    }

    private static void lookForValue(int[][] arr, int num) {
        for(int row = 0;row < arr.length; row++){
            for(int column = 0; column< arr[row].length;column++){
                if(arr[row][column] == num){
                    System.out.println("Your number was located at: \nrow: "+ 
                    row + " and column: " +
                    column + ".");
                    
                }
            }
        }
    }

    private static void populateArray(int[][] arr) {
        for(int row = 0;row < arr.length; row++){
            for(int column = 0; column< arr[row].length;column++){
                arr[row][column] = (int)(Math.random() * 20 + 1);
            }
            System.out.println();
        }
    }

    private static void print2dArray(int[][] arr) {
        for(int row = 0;row < arr.length; row++){
            for(int column = 0; column< arr[row].length;column++){
                System.out.print(arr[row][column] + "\t");
            }
            System.out.println();
        }
    }
}
