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
        input1 = {"file1", "file2"};
    }

    // ----------------------------------------------------------
    /**
     * This method is simply to get code coverage of the class declaration.
     */
    public void testRInit()
    {
        Rectangle1 dum = new Rectangle1();
        assertNotNull(dum);
        Rectangle1.main(null);
        assertFuzzyEquals("Error: Incorrect number of arguments provided\n", systemOut().getHistory());
    }

}
