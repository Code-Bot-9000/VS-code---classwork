import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

public class WordFilter{
    public static void main(String [] args) throws IOException{
        ArrayList<String> wordArrayList = useFile();
        //prints out the array list
        System.out.println(wordArrayList);
    }

    /*
     * returns an arrayList with the specified conditions from the "words_alpha" file
     * @return
     * @throws IOException
     */
    private static ArrayList<String> useFile() throws IOException, FileNotFoundException{
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> result = new ArrayList<>();
 
        
        System.out.print("Enter the length of words to filter by: ");
        int input = scanner.nextInt();

        File file = new File("words_alpha.txt");
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);

        String line;

        while((line = reader.readLine()) != null){
            //prints out whatever word that contains whatever you're looking for
            if(line.length() == input){
                System.out.println(line);
                result.add(line);
                //keeps count of all the words with the input length from the user
                count++;
            }
        }
        reader.close();
        scanner.close();
        System.out.println();
        System.out.println("There are " +count+ " words in this list.");
        return result;
    }
}