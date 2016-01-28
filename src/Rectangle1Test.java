import java.io.FileNotFoundException;

import student.TestCase;

/**
 * @author Jonathan DeFreeuw (jondef95), Preston Lattimer (platt)
 * @version 2
 */
public class Rectangle1Test extends TestCase
{
    String[] input1, input2;

    /**
     * This method sets up the tests that follow.
     */
    public void setUp()
    {
        input1 = new String[2];
        input2 = new String[1];
        input1[0] = "file1";
        input1[1] = "file2";
        input2[0] = "file1";
    }

    // ----------------------------------------------------------
    /**
     * This method is simply to get code coverage of the class declaration.
     */
    public void testRInit()
    {
        Rectangle1 dum = new Rectangle1();
        assertNotNull(dum);
        Rectangle1.main(input1);
        assertFuzzyEquals("Error: Incorrect number of arguments provided\n", systemOut().getHistory());
    }

    public void testFileNotFound()
    {
        try
        {
            Rectangle1.main(input2);
        }
        catch (Exception e)
        {
            assertEquals(e.getClass(), FileNotFoundException.class);
        }
    }

}
