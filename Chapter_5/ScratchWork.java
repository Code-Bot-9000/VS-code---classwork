package Chapter_5;

import java.util.Scanner;

public class ScratchWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String numInput;
        int numConvert, total = 0;

        System.out.print("Enter a number >> ");
        numInput = input.nextLine();
        while(numInput.compareTo("o") != 0){
            numConvert = Integer.parseInt(numInput);
            total = numConvert + total;
            System.out.print("Enter a number >> ");
            numInput = input.nextLine();
        }
        System.out.println(total);
        input.close();
}
}
