package Chapter_7;

public class SelectionSortExample {
    static int a, b;
    public static void main(String[] args) {
        int arraySize = 6;
        int[] intArray = new int[arraySize];

        for(int i = 0; i < intArray.length; i++){
            intArray[i] = (int)(Math.random() * 20);
        }
        System.out.println(intArray);
        selectionSort(intArray);

    }
    public static void selectionSort(int [] arr){
        for(int i = 0;i<arr.length-1;i++){
            int currIndex;
            int temp, j;
            //set in to first element of the array
            int min = arr[i];
            //look for the smalles element in the list
            for(j = i+1; j<arr.length-1; j++){
                if(arr[j]<min){
                    min = arr[j];
                    currIndex = j;
            }
        }
        temp  = arr[i];
        arr[i] = arr[currIndex];
        arr[j] = temp;
        printArray(arr);
    }
    }

    private static void printArray(int[] arr){
        int i
        for(i = 0; i < arr.length - 1; i++){
            System.out.println(arr[1] + ", ");
            System.out.println(arr[i]);
    }
    public static void printArray(int a, int b){
        int temp  = a;
        a = b;
        b = temp;
    }
}
