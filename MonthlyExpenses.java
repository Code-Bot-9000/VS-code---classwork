//package Chapter_1;
import java.util.Scanner;

public class MonthlyExpenses{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pay, rent, utilities, groceries, discretionary;

        System.out.print("Enter your monthly pay >> ");
        pay = input.nextDouble();
        System.out.println("Enter your expenses for the following:");
        System.out.print("rent >> ");
        rent = input.nextDouble();
        System.out.print("utilities >> ");
        utilities = input.nextDouble();
        System.out.print("groceries >> ");
        groceries = input.nextDouble();

        discretionary = pay - (rent + utilities + groceries); //Tells you how much money you have left over

        System.out.print("Your total discretionary is " + discretionary);

        input.close();
    }
}