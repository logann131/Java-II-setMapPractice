import java.io.File;
import java.io.IOException;
import java.util.*;


public class RelativesClient
{
    public static void main( String[] args ) throws IOException
    {
        //Create a Scanner object to read in file
        Scanner fileInput = new Scanner(new File("C:\\Users\\lgad3\\OneDrive - Green River College\\Green River College Files\\IT\\IT 220 - Java II\\In-Class_Projects\\W5.1-RelativeUsingSetsAndMaps\\tutorial\\relatives.txt"));

        //Construct a Relatives object
        Relatives relatives = new Relatives();

        //while there are lines in the relatives.txt file
        while(fileInput.hasNext())
        {
            // read in one line of the file call the setPersonRelative
            String line = fileInput.nextLine();
            // call the setPersonRelative method which will add this pair to the Relative map
            relatives.setPersonRelative(line);
        }

        //call the Relative toString( ) method which creates a string representation
        // of the Relative map. Print this string to the console
        System.out.println(relatives);

    }
}