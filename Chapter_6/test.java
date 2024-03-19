package Chapter_6;

import javax.swing.JOptionPane;
public class test {
    public static void main(String[] args) {
        int count = 1;
		String names[] = new String[count];
        boolean stop = false;
        String prompt = "Enter a name. Type Exit to exit >> ";
        String inputName;
		
        inputName = JOptionPane.showInputDialog(prompt);
		names[count - 1] = inputName;
		count++;
        while(stop == false){
			if(inputName.compareTo("Exit") == 0){
				stop = true;
			}
			inputName = JOptionPane.showInputDialog(prompt);
			count++;
			names[count - 1] = inputName;
    }
	for(int i = 0; i <= count; i++){
		System.out.println(names[count] + ", ");
	}
    }
}