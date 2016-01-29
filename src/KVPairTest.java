import static org.junit.Assert.*;
import student.TestCase;

public class KVPairTest extends TestCase
{

    /**
     * first test of generic KVPair
     */
    private KVPair<String, Integer> KV1;
    /**
     * second generic KVPair
     */
    private KVPair<String, Integer> KV2;
    /**
     * third generic KVPair
     */
    private KVPair<String, Integer> KV3;

    /**
     * creates three KVPairs for use in testing
     */
    public void setUp()
    {
        KV1 = new KVPair<String, Integer>("first", 1);
        KV2 = new KVPair<String, Integer>("second", 2);
        KV3 = new KVPair<String, Integer>("first", 3);
    }

    /**
     * tests the comparison of two specific KVPairs
     */
    public void testCompareToKVPairOfKE()
    {
        assertEquals(0, KV1.compareTo(KV3));
        assertFalse(KV2.compareTo(KV3) == 0);
    }

    /**
     * compares a KVPair to a given key
     */
    public void testCompareToK()
    {
        assertEquals(0, KV2.compareTo("second"));
        assertEquals(0, KV3.compareTo(KV1.key()));
        assertFalse(Integer.valueOf(KV1.compareTo(KV2.key()))
                .equals(Integer.valueOf(0)));
    }

    /**
     * tests the getter for the key
     */
    public void testKey()
    {
        assertEquals("first", KV1.key());
        assertEquals("second", KV2.key());
        assertEquals(KV1.key(), KV3.key());
    }

    /**
     * tests the getter for the value
     */
    public void testValue()
    {
        assertTrue(Integer.valueOf(1).equals(Integer.valueOf(KV1.value())));
        assertTrue(Integer.valueOf(2).equals(Integer.valueOf(KV2.value())));
        assertFalse(Integer.valueOf(KV3.value())
                .equals(Integer.valueOf(KV1.value())));
    }

    /**
     * tests to see if the toString method returns the expected string for a
     * given KVPair
     */
    public void testToString()
    {
        assertEquals("first, 1", KV1.toString());
        assertEquals("second, 2", KV2.toString());
        assertEquals("first, 3", KV3.toString());
    }

}
