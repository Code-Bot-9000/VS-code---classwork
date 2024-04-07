
public class InsertionSort {
    public static void main(String[] args) {
        int arraySize = 8;
        int[] intArray = new int[arraySize];

        //fill the array with random numbers
        for(int i =0;i < intArray.length; i++){
            intArray[i] = (int) (Math.random() * 100) + 1;
        }

        //Print the original array
        System.out.println("Original Array:");
        printArray(intArray, -1);

        //Perform insertion sort
        insertionSort(intArray);

        //Print the sorted array
        System.out.println("Sorted Array:");
        printArray(intArray, intArray.length);
    }

    private static void printArray(int[] arr, int numToColor) {
        //ANSI color codes for terminal color formating
        String GREEN = "\u001b[32m"; //Green color
        String RED = "\u001b[31m"; //Red color
        String RESET = "\u001b[0m"; //Reset color

        int i = 0;

        //Check if the highlighting is not needed
        if(numToColor == -1){
            //Print all elements except the last one with a comma seperator
            for(; i < arr.length - 1; i++){
                System.out.print(arr[i] + ", ");
            }
            //Print the last element without a comma separator
            System.out.println(arr[i]);
        }
        //Check to see if the last element needs highlighting
        else if(numToColor >= arr.length - 1){
            //Print all the elements except the last one with green color and a comma separator
            for(; i< arr.length - 1; i++){
                System.out.print(GREEN + arr[i] + ", " + RESET);
            }
            //Print the last element with green color and reset the color
            System.out.println(GREEN + arr[i] + RESET);
        }
        //Highlight a specific element and print the reset in a different color
        else{
            //Print element up to the specified index with green color and a comma separator
            for(; i <= numToColor; i++){
                System.out.print(GREEN + arr[i] + ", " + RESET);
            }
            //Print the remaining elements with red color and a comma separator
            for(; i < arr.length - 1; i++){
                System.out.print(RED + arr[i] + ", " + RESET);
            }
            //Print the last element with red color and reset the color
            System.out.println(RED + arr[i] + RESET);
        }
    }

    private static void insertionSort(int[] arr) {
        int currElement, numOfIterations = 0, numberOfSwaps = 0;
        for(int i = 0; i < arr.length; i++){
            //Take the first value from the unsorted part of the array.
            currElement = arr[i];
            int j = i - 1;

            //Move the value into the correct place in the sorted part of the array.
            while(j > -1 && arr[j] > currElement){
                numOfIterations++;
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = currElement;
            System.out.print("pass" +i+ ": ");
            numberOfSwaps++;
            printArray(arr, i);
        }
        System.out.println("There were " +numOfIterations+ " iterations, with " + numberOfSwaps + " passes.");
    }
}
