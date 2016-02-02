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
	private KVPair<String, Integer> pair2;
	/**
	 * sets up the test cases
	 */
	public void setUp()
	{
		pair = new KVPair<String, Integer>("first", 1);
		pair2 = new KVPair<String, Integer>("second", 2);
		node1 = new SkipNode<String, Integer>(1);
		node2 = new SkipNode<String, Integer>(pair, 1);
		
	}
	
	/**
	 * tests the kvpair get and set parameters
	 */
	public void testGetKeyAndValue()
	{
		assertNull(node1.getKey());
		assertEquals(pair.key(), node2.getKey());
		assertNull(node1.getValue());
		assertEquals(0, pair.value().compareTo(node2.getValue()));
		assertEquals(1, node1.getLevel());
	}
	/**
	 * tests get and set for above, below, next
	 */
	public void testSetNextAboveBelow()
	{
		node1.setNext(node2);
		assertEquals(node1.getNext().getKey(), pair.key());
		node2.setAbove(node3);
		//assertEquals(node2.getAbove().getKey(), pair2.key());
		//node3.setBelow(node2);
		//assertNull(node3.getBelow().getKey());
	}
	

}
