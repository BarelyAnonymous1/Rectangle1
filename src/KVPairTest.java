import static org.junit.Assert.*;

import org.junit.Test;
import student.TestCase;

public class KVPairTest
{

    private KVPair<String, Integer> KV1;
    private KVPair<String, Integer> KV2;
    private KVPair<String, Integer> KV3;

    public void setUp()
    {
        KV1 = new KVPair<String, Integer>("first", 1);
        KV2 = new KVPair<String, Integer>("second", 2);
        KV3 = new KVPair<String, Integer>("first", 3);
    }

    @Test
    public void testCompareToKVPairOfKE()
    {
        assertEquals(0, KV1.compareTo(KV3));
        assertFalse(KV2.compareTo(KV3) == 0);
    }

    @Test
    public void testCompareToK()
    {
        assertEquals(0, KV2.compareTo("second"));
        assertEquals(0, KV3.compareTo(KV1.key()));
        assertFalse(KV1.compareTo(KV2.key()) == 0);
    }

    @Test
    public void testKey()
    {
        assertEquals("first", KV1.key());
        assertEquals("second", KV2.key());
        assertEquals(KV1.key(), KV3.key());
    }

    @Test
    public void testValue()
    {
        assertEquals(Integer.valueOf(1), Integer.valueOf(KV1.value()));
        assertEquals(Integer.valueOf(2), Integer.valueOf(KV2.value()));
        assertEquals(Integer.valueOf(KV3.value()), Integer.valueOf(KV1.value()));
    }

    @Test
    public void testToString()
    {
        fail("Not yet implemented");
    }

}
