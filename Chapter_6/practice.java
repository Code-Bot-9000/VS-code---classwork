package Chapter_6;

import javax.swing.JOptionPane;
public class practice {
    public static void main(String[] args) {
        String fOrC;

        fOrC = JOptionPane.showInputDialog("F or C?");

        if(fOrC.equalsIgnoreCase("C")){
            System.out.println("Celcius");
        }

        if(fOrC.equalsIgnoreCase("F")){
            System.out.println("Fahrenheit");
        }

    }
}
