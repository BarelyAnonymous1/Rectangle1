import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * CommandParser class used to scan through a file with a Scanner and retrieve
 * specific values to create a list of Rectangles. The parser only checks to see
 * if the file that is input for the Scanner actually exists in the current
 * directory. The scanner will only attempt to take any action its list if the
 * correct command is input. an invalid commands will nullify the line. The
 * parser makes no effort to error check the other inputs beyond the commands.
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
     * constructor for parser, stores filename and creates a new SkipList
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
     * function used to scan through the file input into the main program. if a
     * command is not found as the first string in the line, the line is skipped
     * 
     * @return boolean did the parsing succeed?
     * @precondition the file being input either doesn't exist or exists and
     *               contains the properly formatted commands and inputs
     */
    public boolean parseFile()
    {
        Scanner scanner = null;
        Exception d = null;
        // check to make sure that the file exists in the pwd
        try
        {
            scanner = new Scanner(new File(inputFile));
        }
        catch (FileNotFoundException e)
        { // Create new scanner
            d = e;
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        if (d == null) // if no error was found, let scanner go through file
        {
            while (scanner.hasNext())
            { // While the scanner has information to read
                String cmd = scanner.next(); // Read the next command
                switch (cmd)
                {
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
                        System.out.println("Intersection pairs:");
                        list.intersections();
                        break;
                    }
                    case ("search"):
                    {
                        parseSearch(scanner);
                        break;
                    }
                    case ("dump"):
                    {
                        System.out.println("SkipList dump:");
                        list.dump();
                        break;
                    }
                    default:
                    {
                        scanner.nextLine();
                        break;
                    }
                }
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
     * rectangle into a list
     * 
     * @param scanner
     *            the scanner that is used to search the file
     * @precondition the scanner input is already initialized
     * @precondition the command "insert" is followed by one string and four
     *               integers
     * @postcondition if coordinates are correct, a node is added to the list
     */
    private void parseInsert(Scanner scanner)
    {
        String name = scanner.next();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        char c = name.charAt(0);
        if (Character.isAlphabetic(c) && checkDim(x, y, width, height))
        {
            Rectangle rect = new Rectangle(name, x, y, width, height);
            KVPair<String, Rectangle> pair = new KVPair<String, Rectangle>(
                    name, rect);
            list.insert(pair);
            System.out.println("Rectangle inserted: (" + name + ", " + x
                    + ", " + y + ", " + width + ", " + height + ")");
        }
        else
        {
            System.out.println("Rectangle rejected: (" + name + ", " + x
                    + ", " + y + ", " + width + ", " + height + ")");
        }
    }

    /**
     * private method that allows the parser to scan a line and remove a
     * rectangle based on either name or coordinates
     * 
     * @param scanner
     *            the scanner that is used to search the file
     * @precondition the scanner input is already initialized
     * @precondition the command "remove" is followed by one string or four
     *               integers
     * @postcondition if the rectangle exists, it is removed from the list
     */
    private void parseRemove(Scanner scanner)
    {
        String name = scanner.next();
        if (!isNumeric(name))
        {
            Rectangle found = list.removeKey(name);
            if (found == null)
            {
                System.out
                        .println("Rectangle not removed: (" + name + ")");
            }
            else
            {
                System.out.println("Rectangle removed: (" + name + ", "
                        + found.toString() + ")");
            }
        }
        else
        {
            int x = Integer.parseInt(name);
            int y = scanner.nextInt();
            int width = scanner.nextInt();
            int height = scanner.nextInt();
            if (checkDim(x, y, width, height))
            {
                String search = x + ", " + y + ", " + width + ", "
                        + height;
                Rectangle searchRect = new Rectangle(null, x, y, width,
                        height);
                Rectangle found = list.removeValue(searchRect);
                if (found == null)
                {
                    System.out.println(
                            "Rectangle not removed: (" + search + ")");
                }
                else
                {
                    System.out.println(
                            "Rectangle removed: (" + found.getName() + ", "
                                    + found.toString() + ")");
                }
            }
            else
            {
                System.out.println("Rectangle rejected: (" + x + ", " + y
                        + ", " + width + ", " + height + ")");
            }
        }
    }

    /**
     * private method that allows the parser to scan a line and search the
     * SkipList for Rectangles within a certain region
     * 
     * @param scanner
     *            the scanner that is used to search the file
     * @precondition the scanner input is already initialized
     * @precondition the command "regionsearch" is followed by four integers
     * @postcondition if the height and width are appropriate, a list of
     *                rectangles are output to the console
     */
    private void parseRegionSearch(Scanner scanner)
    {
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        if (!(height < 1 || width < 1))
        {
            System.out.println("Rectangles intersecting region (" + x
                    + ", " + y + ", " + width + ", " + height + "):");
            Rectangle regionRect = new Rectangle("regionRect", x, y, width,
                    height);
            list.regionSearch(regionRect);
        }
        else
        {
            System.out.println("Rectangle rejected: (" + x + ", " + y
                    + ", " + width + ", " + height + ")");
        }
    }

    /**
     * private method that allows the parser to scan a line and search a list
     * for the specific rectangle; if it exists, output it to the console
     * 
     * @param scanner
     *            the scanner that is used to search the file
     * @precondition the scanner input is already initialized
     * @precondition the command "search" is followed by one string
     * @postcondition if coordinates are correct, a node is added to the list
     */
    private void parseSearch(Scanner scanner)
    {
        String name = scanner.next();
        SkipNode<String, Rectangle> searchResult = list.search(name);
        if (null == list.search(name))
        {
            System.out.println("Rectangle not found: " + name);
        }
        else
        {
            System.out.println("(" + name + ", "
                    + searchResult.getValue().toString() + ")");
            while (searchResult.next[0] != null && searchResult.next[0]
                    .getKey().compareTo(searchResult.getKey()) == 0)
            {
                searchResult = searchResult.next[0];
                System.out.println("(" + name + ", "
                        + searchResult.getValue().toString() + ")");
            }
        }
    }

    /**
     * checks for numeric nature of the string
     * 
     * @param str
     *            string taken to be checked
     * @return a boolean false or true.
     */
    private static boolean isNumeric(String str)
    {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    /**
     * helper method to do math regarding the dimensions of the rectangle
     * 
     * @param x
     *            coordinate
     * @param y
     *            coordinate
     * @param width
     *            of rectangle
     * @param height
     *            of rectangle
     * @return a boolean true or false
     */
    public boolean checkDim(int x, int y, int width, int height)
    {
        return !(width <= 0 || height <= 0 || x + width > 1024
                || y + height > 1024 || x < 0 || y < 0);
    }
}