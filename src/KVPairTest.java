import static org.junit.Assert.*;

import org.junit.Test;
import student.TestCase;

public class KVPairTest
{

    private KVPair<String, Integer> KV1;
    private KVPair<String, Integer> KV2;
    private KVPair<String, Integer> KV3;

    @Test
    public void testCompareToKVPairOfKE()
    {
        assertEquals(0, KV1.compareTo(KV2));
        assertFalse(KV2.compareTo(KV3) == 0);
    }

    @Test
    public void testCompareToK()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testKey()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testValue()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testToString()
    {
        fail("Not yet implemented");
    }

}
