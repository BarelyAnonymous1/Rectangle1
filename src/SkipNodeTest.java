import student.TestCase;


/**
 * @author prestonlattimer
 *
 */
public class SkipNodeTest extends TestCase {

	
	private SkipNode<String, Integer> node1;
	private SkipNode<String, Integer> node2;
	private SkipNode<String, Integer> node3;
	private KVPair<String, Integer> pair;
	/**
	 * sets up the test cases
	 */
	public void setUp()
	{
		pair = new KVPair<String, Integer>("first", 1);
		node1 = new SkipNode<String, Integer>(1);
		node2 = new SkipNode<String, Integer>(pair, 1);
	}
	
	/**
	 * tests the head parameters
	 */
	public void testGetKey()
	{
		assertNull(node1.getKey());
		assertEquals(pair.key(), node2.getKey());
	}

}
