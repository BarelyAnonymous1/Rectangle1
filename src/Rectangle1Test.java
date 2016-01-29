import java.io.FileNotFoundException;

import student.TestCase;

/**
 * @author Jonathan DeFreeuw (jondef95), Preston Lattimer (platt)
 * @version 2
 */
public class Rectangle1Test extends TestCase
{
    /**
     * list of inputs for first test
     */
    String[] input1;
    /**
     * list of inputs for second test
     */
    String[] input2;

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
        assertFuzzyEquals("Error: Incorrect number of arguments provided\n",
                systemOut().getHistory());
    }

    /**
     * test to show that the main will display an error through the parser
     */
    public void testFileNotFound() throws FileNotFoundException
    {
        Rectangle1.main(input2);
    }

    /**
     * test to skim a file to show parser can move through file
     */
    public void testSearchFile()
    {
        String[] input = { "SyntaxTest.txt" };
        Rectangle1.main(input);
    }

}
