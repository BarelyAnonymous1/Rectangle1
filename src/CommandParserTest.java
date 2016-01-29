import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

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
        boolean success = parser.parse();
        assertFalse(success);
    }
    
    /**
     * tests to see if the parser will correctly open and close a file
     */
    public void testSearchPass()
    {
        parser = new CommandParser("SyntaxTest.txt");
        boolean success = parser.parse();
        assertTrue(success);
    }

}
