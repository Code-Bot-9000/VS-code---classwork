package Chapter_6;

public class ArrayDemo{
    public static void main(String[] args) {
        String[] students = new String [5]; //Declaring a new string array of 5 elements
        students[0] = "Ronnie";
        students[1] = "Chris";
        students[2] = "Robin";
        students[3] = "Lorrie";
        students[4] = "Kevin";

        int i;
        for(i = 0; i<students.length -1; i++){

            System.out.print(students[i]+ ", ");
        }
        System.out.println(students[i]);

        
        //does the same as the other for loop
        /*
         for(i = 0; i<students.length -1; i++){      
            if(i<students.length - 1){
                Ststem.out.print(students[i]+ ", ");
            }
            else{
                System.out.println(students[i]);
            }
            System.out.print(students[i]+ ", ");
        }
         */
        }
}

/*
    String[] students = new String [5]; //Declaring a new string array of 5 elements
    String[] students = {"Ronnie", "Chris", "Robin", "Lorrie", "Kevin"}
        students[0] = "Ronnie";
        students[1] = "Chris";
        students[2] = "Robin";
        students[3] = "Lorrie";
        students[4] = "Kevin";

        System.out.println(students);
 */