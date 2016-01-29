import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import student.TestCase;

/**
 * Test class to demonstrate proper use of the CommandParser
 * 
 * @author Jonathan DeFreeuw (jondef95), Preston Lattimer (platt)
 *
 */
public class CommandParserTest extends TestCase
{
    private CommandParser parser;

    public void setUp()
    {
        
    }

    public void testSearchFail()
    {
        parser = new CommandParser("fail");
        boolean success = parser.parse();
        assertFalse(success);
    }
    
    public void testSearchPass()
    {
        parser = new CommandParser("SyntaxTest.txt");
        boolean success = parser.parse();
        assertTrue(success);
    }

}
