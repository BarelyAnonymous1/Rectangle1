import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * CommandParser class used to scan through a file with a Scanner and retrieve
 * specific values to create a SkipList of Rectangles
 * 
 * @author Jonathan DeFreeuw (jondef95), Preston Lattimer (platt)
 * @version 1
 */
public class CommandParser
{
    /**
     * String field to hold the file that has been input
     */
    private String inputFile;

    /**
     * constructor for parser, stores filename
     * 
     * @param file
     *            name for the file that is being parsed
     */
    public CommandParser(String file)
    {
        inputFile = file;
    }

    /**
     * function used to scan through the file input into the main program
     * 
     * @return boolean did the parsing succeed?
     */
    public boolean parse()
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
                switch(cmd)
                {
                    case("insert"):
                    {
                        parseInsert(scanner);
                    }
                    case("remove"):
                    {
                        int x = scanner.nextInt();
                        int y = scanner.nextInt();
                        int width = scanner.nextInt();
                        int height = scanner.nextInt();
                    }
                    case("regionsearch"):
                    {
                        
                    }
                    case("intersections"):
                    {
                        
                    }
                    case("search"):
                    {
                        
                    }
                    case("dump"):
                    {
                        
                    }
                    default:
                    {
                        scanner.nextLine();
                        break;
                    }
                }
                System.out.println(cmd);
            }
            return true;
        }
        else
        {
            return false;
        }
    }

    private void parseInsert(Scanner scanner)
    {
        String name = scanner.next();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        //store these values as a KVPair
        //store KVPair into SkipList
    }
    
    private void parseRemove(Scanner scanner)
    {
        // figure out if it is removing by key or removing by value
        return;
    }
}