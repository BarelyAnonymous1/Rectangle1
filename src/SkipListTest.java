import student.TestCase;

public class SkipListTest extends TestCase {
	
	private SkipList<String, Integer> list;
	private SkipNode<String, Integer> node1;
	private SkipNode<String, Integer> node2;
	private SkipNode<String, Integer> node3;
	private KVPair<String, Integer> pair1;
	private KVPair<String, Integer> pair2;
	private KVPair<String, Integer> pair3;
	

	/**
	 * sets up the test cases
	 */
	public void setUp()
	{
		pair1 = new KVPair<String, Integer>("node1", 1);
		pair2 = new KVPair<String, Integer>("node2", 2);
		pair3 = new KVPair<String, Integer>("node3", 3);
		list = new SkipList<String, Integer>();
	}
	
	/**
	 * tests the insert method
	 */
	public void testInsert()
	{
		list.insert(pair1);
		list.insert(pair2);
		assertEquals("node1", list.getHead().getNext().getKey());
		
		//list.dump();
	}
	
	
}