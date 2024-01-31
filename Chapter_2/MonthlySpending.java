package Chapter_2;

import java.util.Scanner;

public class MonthlySpending {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pay, rent, utilities, groceries, totalBills, discretionary;

        System.out.print("Enter your monthly pay >> ");
        pay = input.nextDouble();
        System.out.print("Enter your expenses for the following:\nrent >>");
        rent = input.nextDouble();
        System.out.print("utilities >> ");
        utilities = input.nextDouble();
        System.out.print("groceries >> ");
        groceries = input.nextDouble();

        totalBills = rent + utilities + groceries;
        discretionary = pay - totalBills;

        System.out.println("Your total income is $" + pay + "\nYour total in bills this month is $" + totalBills 
                            + "\nYour discretionary this month is >> $" + discretionary);

        input.close();
    }
}