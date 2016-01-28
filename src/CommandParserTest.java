import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import student.TestCase;

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

}
