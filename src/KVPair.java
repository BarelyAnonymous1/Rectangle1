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
    K theKey;
    E theVal;

    KVPair(K k, E v)
    {
        theKey = k;
        theVal = v;
    }

    // Compare KVPairs
    public int compareTo(KVPair<K, E> )
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
