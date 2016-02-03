import student.TestCase;


/**
 * @author prestonlattimer
 *
 */
public class SkipNodeTest extends TestCase {

	private SkipNode<String, Integer> head;
	private SkipNode<String, Integer> node1;
	private SkipNode<String, Integer> node2;
	private SkipNode<String, Integer> node3;
	private KVPair<String, Integer> pair;
	private KVPair<String, Integer> pair2;
	/**
	 * sets up the test cases
	 */
	public void setUp()
	{
		pair = null;
		node2 = new SkipNode<String, Integer>(pair, 1);
	}
	
	/**
	 * tests the getKey method properly
	 */
	public void testGetKey()
	{
		assertNull(node2.getKey());
	}
	
	

}
