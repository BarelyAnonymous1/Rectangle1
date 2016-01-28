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
        Rectangle1.main(input2);
        assertFuzzyEquals("Error: Incorrect number of arguments provided\n", systemOut().getHistory());
    }

    public void testFileNotFound()
    {
        Exception d = null;
        try
        {
            bst.delete(new Integer(1));// It possible to throw an exception if
            // deleting on an empty tree
        }
        catch (Exception e)
        {
            d = e;
            assertEquals(e.getMessage(), "cannot delete.");
            assertEquals(e.getClass(), RuntimeException.class);
            // There are a number of ways to test exceptions
            // One way would be to get the message that it prints, however, that
            // message will likely change in most exceptions (i.e. FileNotFound
            // will
            // throw information about the file location). The other way to test
            // an
            // exception would be to check the type of exception thrown. In
            // addition,
            // it is wise to make sure an that the catch block is reached by
            // setting
            // a marker value to guarantee it has been reached.
        }
        assertNotNull(d);// Make sure an exception was thrown
    }

}
