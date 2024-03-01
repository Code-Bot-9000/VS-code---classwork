package Chapter_6;

import java.util.Scanner;
public class ArrayDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students >> ");
        int numOfStudents = input.nextInt();
        input.nextLine();
        String[] students = new String[numOfStudents];

        for(int i = 0; i < students.length; i++){
            System.out.println("Enter student " + (i + 1) + ": ");
            students[i] = input.nextLine();
        }
        for(int i = 0; i < students.length; i++){
            if(i<students.length - 1){
                System.out.print(students[i]+ ", ");
            }
            else{
                System.out.println(students[i]);
            }
        }

        input.close();
    }
}
