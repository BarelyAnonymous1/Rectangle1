/**
 * Generic KVPair class used to store values and keys in the same class. Based
 * off of the KVPair code given through OpenDSA. Comments added to show
 * understanding of what the code does
 * 
 * @author Jonathan DeFreeuw (jondef95), Preston Lattimer (platt)
 * @version 2
 *
 * @param <K>
 *            generic key value
 * @param <E>
 *            generic element to be stored
 */
public class KVPair<K extends Comparable<K>, E>
        implements Comparable<KVPair<K, E>>
{
    /**
     * where the key of the pair will be stored
     */
    K theKey;

    /**
     * where the value for the pair will be stored
     */
    E theVal;

    /**
     * constructor for the KVPair that stored the key and value
     * 
     * @param k
     *            key to be stored
     * @param v
     *            value to be stored
     */
    KVPair(K k, E v)
    {
        theKey = k;
        theVal = v;
    }

    /**
     * compares two KVPairs based on keys
     * 
     * @return 0 if they are the same, another integer if different
     */
    public int compareTo(KVPair<K, E> it)
    {
        return theKey.compareTo(it.key());
    }

    // Compare against a key
    public int compareTo(K it)
    {
        return theKey.compareTo(it);
    }

    public K key()
    {
        return theKey;
    }

    public E value()
    {
        return theVal;
    }

    public String toString()
    {
        return theKey.toString() + ", " + theVal.toString();
    }
}
/* *** ODSAendTag: KVPair *** */
