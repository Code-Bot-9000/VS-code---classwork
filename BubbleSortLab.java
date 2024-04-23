public class BubbleSortLab{

    static int numberOfSwaps;
    static int numOfIterations;
    public static void main(String[]args){
        int arraySize = 5;
        int[] intArray = new int[arraySize];

        //fills in the array with numbers
        for(int i = 0; i < intArray.length; i++){
            intArray[i] = (int)(Math.random()*10) + 1;//gives a random value between 1 and 10
        }

        //Print the original array
        System.out.println("Original Array:");
        printArray(intArray, -1);

        //performs bubble sort
        bubbleSort(intArray);

        //Print the sorted array
        System.out.println("\nSorted Array:");
        printArray(intArray, intArray.length);
    }

    private static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length-1; i++){
            int temp;
            //Find the index of the minimum element in the unsorted portion of the array
            for(int j = 1; j < arr.length-i; j++){
                numOfIterations++;
                //Swap the current element with the minimum element found
                if(arr[j-1] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    numberOfSwaps++;
                    System.out.print("Swap " + numberOfSwaps + ": ");
                    printArray(arr, i);
                }
            }
        }
        System.out.println("There were " + numberOfSwaps + " swaps, and " + 
        numOfIterations + " iterations");
    }

    /*
     * Sorts an array using bubble sorting
     * @param arr
     * @param numToColor
     */
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
        else if(numToColor == arr.length){
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
}