import student.TestCase;
import student.TestableRandom;

/**
 * test class for the SkipList; test for proper implementation of all functions
 * 
 * @author Jonathan DeFreeuw (jondef95), Preston Lattimer (platt)
 * @version 1
 *
 */
public class SkipListTest extends TestCase
{

    private SkipList<String, Integer> list;
    private KVPair<String, Integer>   pair1;
    private KVPair<String, Integer>   pair2;
    private KVPair<String, Integer>   pair3;

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
        assertEquals(pair3.compareTo(list.search("node3").getPair()), 0);

        list.dump();
    }

    /**
     * make sure that the list will adjust the head when a node is added higher
     * than the head
     */
    public void testRandomInsert()
    {
        TestableRandom.setNextBooleans(false, true, true, false);
        assertEquals(1, list.getHead().getLevel());
        assertTrue(list.insert(pair1));
        assertEquals(1, list.getHead().getLevel());
        assertTrue(list.insert(pair2));
        assertEquals(2, list.getHead().getLevel());
        list.dump();
    }

    /**
     * creates a fake region to check for new rectangles
     */
    public void testRegionSearch()
    {
        Rectangle region = new Rectangle("region", 100, 100, 200, 200);
        SkipList<String, Rectangle> regionList = 
                new SkipList<String, Rectangle>();
        regionList.insert(new KVPair<String, Rectangle>("notIntersect",
                new Rectangle("notIntersect", 10, 10, 20, 20)));
        assertFalse(regionList.regionSearch(region));
        regionList.insert(new KVPair<String, Rectangle>("intersect1",
                new Rectangle("intersect1", 75, 75, 200, 250)));
        assertTrue(regionList.regionSearch(region));
    }

    /**
     * tests that the intersections test successfully finds an intersection and
     * returns the appropriate boolean
     */
    public void testIntersections()
    {
        SkipList<String, Rectangle> intersectList = 
                new SkipList<String, Rectangle>();
        intersectList.insert(new KVPair<String, Rectangle>("notIntersect",
                new Rectangle("notIntersect", 10, 10, 20, 20)));
        assertFalse(intersectList.intersections());
        intersectList.insert(new KVPair<String, Rectangle>("intersect1",
                new Rectangle("intersect1", 75, 75, 200, 250)));
        assertFalse(intersectList.intersections());
        intersectList.insert(new KVPair<String, Rectangle>("intersect2",
                new Rectangle("intersect2", 100, 100, 200, 200)));
        assertTrue(intersectList.intersections());

    }
}