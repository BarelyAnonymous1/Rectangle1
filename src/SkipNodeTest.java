import student.TestCase;

/**
 * @author Preston Lattimer (platt), Jonathan DeFreeuw (jondef95)
 * @version 1
 */
public class SkipNodeTest extends TestCase
{

    private SkipNode<String, Integer> nodeNull;
    private SkipNode<String, Integer> nodeTrue;
    private KVPair<String, Integer>   pair;

    /**
     * sets up the test cases
     */
    public void setUp()
    {
        pair = null;
        nodeNull = new SkipNode<String, Integer>(pair, 1);
    }

    /**
     * tests the getKey method properly
     */
    public void testGetKey()
    {
        assertNull(nodeNull.getKey());
    }

    /**
     * tests that a node with no pair returns null
     */
    public void testGetPair()
    {
        assertNull(nodeNull.getPair());
    }

    /**
     * tests that a node with a KVPair returns that pair by testing its key,
     * also tests whether the node returns the correct key
     */
    public void testGetPairTrue()
    {
        KVPair<String, Integer> newPair = new KVPair<String, Integer>(
                "hello!", 1);
        nodeTrue = new SkipNode<String, Integer>(newPair, 4);
        assertFuzzyEquals(nodeTrue.getPair().key(), "hello!");
        assertFuzzyEquals(nodeTrue.getKey(), "hello!");
    }
    
    /**
     * tests when the node returns the value of the pair it contains
     */
    public void testGetValueTrue()
    {
        KVPair<String, Integer> newPair = new KVPair<String, Integer>(
                "hello!", 151);
        nodeTrue = new SkipNode<String, Integer>(newPair, 4);
        assertFuzzyEquals(nodeTrue.getPair().key(), "hello!");
        assertTrue(nodeTrue.getValue() == 151);
    }

}
