import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileManagement {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //gives us an array List using every line we added in the useFile() method
        ArrayList<String> wordArrayList = useFile();
        System.out.print(wordArrayList);
        
    }


    private static ArrayList<String> useFile() throws FileNotFoundException, IOException{
        //declaring ArrayList and instantiating it toa blank ArrayList
        ArrayList<String> result = new ArrayList<>();

        //creating and accessing the file
        File f = new File("words_alpha.txt");

        //creating and accessing the file reader
        FileReader fr = new FileReader(f);

        //creating and accessing the buffered reader
        BufferedReader br = new BufferedReader(fr);

        //creating a string variable to hold the data from the file
        String line;

        //using a while loop to filter the word
        while((line = br.readLine()) != null){
            //prints out whatever word that contains whatever you're looking for
            if(line.contains("plead")){
                System.out.println(line);
                result.add(line);
            }
        }
        br.close();
        return result;
    }
}
