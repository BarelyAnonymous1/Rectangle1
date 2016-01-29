import static org.junit.Assert.*;

import org.junit.Test;
import student.TestCase;

public class KVPairTest
{

    private KVPair<String, Integer> KV1;
    private KVPair<String, Integer> KV2;

    @Test
    public void testCompareToKVPairOfKE()
    {
        KV1 = new KVPair<String, Integer>("first", 1);
        KV2 = new KVPair<String, Integer>("second", 2);
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
