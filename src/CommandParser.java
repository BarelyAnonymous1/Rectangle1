import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * CommandParser class used to scan through a file with a Scanner and 
 * retrieve specific values to create a SkipList of Rectangles
 * 
 * @author Jonathan DeFreeuw (jondef95), Preston Lattimer (platt)
 *
 */
public class CommandParser
{
    /**
     * String field to hold the file that has been input
     */
    private String inputFile;

    /**
     * constructor for parser, stores filename
     * @param file  name for the file that is being parsed
     */
    public CommandParser(String file)
    {
        inputFile = file;
    }

    public void parse()
    {
        Scanner scanner = null;
        try
        {
            scanner = new Scanner(new File(inputFile));
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } // Create new scanner
        if (scanner != null)
        {
            while (scanner.hasNext())
            { // While the scanner has information to read
                String cmd = scanner.next(); // Read the next term
                System.out.println(cmd);
            }
        }
    }
}
