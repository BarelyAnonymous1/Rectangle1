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
     * SkipList used to hold the KeyValue Pairs for Rectangles
     */
    // TODO: IMPLEMENT SKIPLIST
    // TODO: IMPLEMENT RECTANGLE
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
        Exception d = null;
        try
        {
            scanner = new Scanner(new File(inputFile));
        }
        catch (FileNotFoundException e)
        {
            d = e;
            e.printStackTrace();
            System.out.println(e.getMessage());
        } // Create new scanner
        if (d == null)
        {
            while (scanner.hasNext())
            { // While the scanner has information to read
                String cmd = scanner.next(); // Read the next command
                switch (cmd) {
                    case ("insert"):
                    {
                        parseInsert(scanner);
                        break;
                    }
                    case ("remove"):
                    {
                        parseRemove(scanner);
                        break;
                    }
                    case ("regionsearch"):
                    {
                        parseRegionSearch(scanner);
                        break;
                    }
                    case ("intersections"):
                    {
                        // TODO: IMPLEMENT INTERSECTIONS METHOD IN SKIPLIST
                        // SkipList does things with intersections
                        break;
                    }
                    case ("search"):
                    {
                        break;
                    }
                    case ("dump"):
                    {
                        break;
                    }
                    default:
                    {
                        System.out.println("Command not recognized: " + cmd);
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
        // store these values as a KVPair
        // store KVPair into SkipList
    }

    private void parseRemove(Scanner scanner)
    {
        // figure out if it is removing by key or removing by value
        scanner.nextLine();
        return;
    }

    private void parseRegionSearch(Scanner scanner)
    {
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        //TODO: IMPLEMENT REGIONSEARCH
        // look in the SkipList for all Rectangles in the region
    }
    
    private void parseSearch(Scanner scanner)
    {
        String name = scanner.next();
        //TODO: IMPLEMENT SEARCH ON SKIPLIST
    }
}