import student.TestCase;

/**
 * Test class to demonstrate proper use of the CommandParser
 * 
 * @author Jonathan DeFreeuw (jondef95), Preston Lattimer (platt)
 * @version 1
 */
public class CommandParserTest extends TestCase
{
    private CommandParser parser;

    /**
     * tests to see if the parser will correctly handle an incorrect file
     */
    public void testSearchFail()
    {
        parser = new CommandParser("fail");
        boolean success = parser.parseFile();
        assertFalse(success);
    }
    
    /**
     * tests to see if the parser will correctly open and close a file
     * does not test the output of the parser
     */
    public void testSearchPass()
    {
        parser = new CommandParser("SyntaxTest.txt");
        boolean success = parser.parseFile();
        assertTrue(success);
    }

    /**
     * tests checkDim
     */
    public void testCheckDim()
    {
        parser = new CommandParser("test.txt");
        assertTrue(parser.checkDim(0, 0, 1, 1));
        assertFalse(parser.checkDim(-1, 1, 1, 1));
        assertFalse(parser.checkDim(0, -1, 1, 1));
        assertFalse(parser.checkDim(-1, -1, 1, 1));
        assertFalse(parser.checkDim(-1, -1, -1, 1));
        assertFalse(parser.checkDim(-1, -1, -1, -1));
    }
    
}
