
/**
 * Write a description of class InputReader here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.HashSet;
import java.util.Scanner;

public class InputReader {
    private Scanner reader;
    public InputReader(){
        reader = new Scanner(System.in);
    }
    
    public String getInput(){
        System.out.print("> "); //print prompt
        String inputLine = reader.nextLine();

        return inputLine;
    }
}
