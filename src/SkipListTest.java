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
		pair2 = new KVPair<String, Integer>("node6", 2);
		pair3 = new KVPair<String, Integer>("node3", 3);
		list = new SkipList<String, Integer>();
	}
	
	/**
	 * tests the insert method
	 */
	public void testInsert()
	{
		list.insert(pair2);
		list.insert(pair1);
		assertNull(list.search("node3"));
		list.insert(pair3);
		assertEquals(pair3.compareTo(list.search("node3")), 0);
		
		list.dump();
		
		//list.dump();
	}
	
	/**
	 * tests search
	 */
	public void testSearch()
	{
		assertNull(list.search("a"));
		assertNull(list.nodeSearch("a"));
		list.insert(pair1);
		list.insert(pair2);
		list.nodeSearch("node1");
		list.nodeSearch("node2");
	}
	
}