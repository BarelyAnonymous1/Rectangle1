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
    private String                      inputFile;

    /**
     * SkipList used to hold the KeyValue Pairs for Rectangles
     */
    private SkipList<String, Rectangle> list;

    /**
     * constructor for parser, stores filename
     * 
     * @param file
     *            name for the file that is being parsed
     */
    public CommandParser(String file)
    {
        inputFile = file;
        list = new SkipList<String, Rectangle>();
    }

    /**
     * function used to scan through the file input into the main program
     * 
     * @return boolean did the parsing succeed?
     */
    public boolean parseFile()
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
                        parseIntersections();
                        break;
                    }
                    case ("search"):
                    {
                        parseSearch(scanner);
                        break;
                    }
                    case ("dump"):
                    {
                        list.dump();
                        break;
                    }
                    default:
                    {
                        break;
                    }
                }
                //System.out.println(cmd);
            }
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * private method that allows the parser to scan a line and insert the new
     * rectangle into a SkipList
     * 
     * @param scanner
     *            the scanner that is used to search the file
     * @precondition the scanner input is already initialized
     * @postcondition if coordinates are correct, a node is added to the list
     */
    private void parseInsert(Scanner scanner)
    {
        String name = scanner.next();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        if (width > 0 && height > 0 && 
        		x + width < 1024 && y + height < 1024 && 
        		x + width > 0 && y + height > 0)
        {
            Rectangle rect = new Rectangle(x, y, width, height);
            KVPair<String, Rectangle> pair = new KVPair<String, Rectangle>(name,
                    rect);
            list.insert(pair);
            System.out.println("Rectangle inserted: (" + name + ", " + x + ", "
            		+ y + ", " + width + ", " + height + ")");
        }
        else
        {
            System.out.println("Rectangle rejected: (" + name + ", " + x + ", "
                    + y + ", " + width + ", " + height + ")");
        }
    }

    /**
     * private method that allows the parser to scan a line and remove a
     * rectangle based on either name or coordinates
     * 
     * @param scanner
     *            the scanner that is used to search the file
     * @precondition the scanner input is already intiialized
     * @postcondition if the rectangle exists, it is removed from the list
     */
    private void parseRemove(Scanner scanner)
    {
        String name = scanner.next();
        if (!isNumeric(name))
        {
        	//KVPair<String, Rectangle> pair = list.search(name);
        	if (null == list.search(name))
        	{
        		System.out.println("Rectangle not removed: (" + name + ")");
        	}
        	else
        	{
        		
        	}
        }
        else 
        {
        	int x = Integer.parseInt(name);
        	int y = scanner.nextInt();
        	int width = scanner.nextInt();
        	int height = scanner.nextInt();
        	if (width > 0 && height > 0 && 
            		x + width < 1024 && y + height < 1024 &&
            		x + width > 0 && y + height > 0)
        	{
        		Rectangle rect = new Rectangle(x, y, width, height);
        	}
        	else
        	{
        		System.out.println("Rectangle not removed: (" + x + ", " +
        				y + ", " + width + ", " + height + ")");
        	}
        }
    }

    /**
     * private method that allows the parser to scan a line and search the
     * SkipList for Rectangles within a certain region
     * 
     * @param scanner
     *            the scanner that is used to search the file
     * @precondition the scanner input is already intiialized
     * @postcondition if the height and width are appropriate, a list of
     *                rectangles are output to the console
     */
    private void parseRegionSearch(Scanner scanner)
    {
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        System.out.println("Rectangles intersecting region (" + x + ", " + y +
        		", " + width + ", " + height + "):");
        if (width > 0 && height > 0)
        {
            if (x + width < 1024 && y + height < 1024 &&
            		x + width > 0 && y + height > 0)
            {
            	//list.regionSearch();
            }
        }
        else
        {
        	
        }
        // TODO: IMPLEMENT REGIONSEARCH
        // look in the SkipList for all Rectangles in the region
    }

    /**
     * private method that allows the parser to scan a line and search a list
     * for the specific rectangle; if it exists, output it to the console
     * 
     * @param scanner
     *            the scanner that is used to search the file
     * @precondition the scanner input is already initialized
     * @postcondition if coordinates are correct, a node is added to the list
     */
    private void parseSearch(Scanner scanner)
    {
        String name = scanner.next();
        if (null == list.search(name))
        {
       		System.out.println("Rectangle not found: " + name);
        }
        else
        {
        	SkipNode<String, Rectangle> node = list.nodeSearch(name);
        	System.out.println("(" + name + ", " + 
        			node.getValue().toString() + ")");
        	while (node.next[0] != null &&
        			node.next[0].getKey().compareTo(node.getKey()) == 0)
        	{
        		node = node.next[0];
        		System.out.println("(" + name + ", " + 
        				node.getValue().toString() + ")");
        	}
        }
    }
    
    private void parseIntersections()
    {
    	System.out.println("Intersection pairs:");
    }
    
    /**
     * checks for numeric nature of the string
     * @param str string taken to be checked
     * @return a boolean false or true. 
     */
    private static boolean isNumeric(String str)
    {
    	return str.matches("-?\\d+(\\.\\d+)?");
    }
}