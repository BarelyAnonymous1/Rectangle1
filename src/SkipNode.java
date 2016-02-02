/**
 * Node used to implement the SkipList; takes a KVPair and stores it
 * 
 * @author Preston Lattimer (platt), Jonathan DeFreeuw (jondef95)
 * 
 * @param <K>
 *            the generic key value for the KVPair
 * @param <E>
 *            the generic data value for the KVPair
 *
 */
public class SkipNode<K extends Comparable<K>, E>
{

    /**
     * creates a skip list node that is blank that will be the one we actually
     * are creating
     */
    private SkipNode<K, E> above, below, next;

    /**
     * Data stored into the node
     */
    private KVPair<K, E>   pair;
    /**
     * determines the level that the node is actually on
     */
    private int            level;

    /**
     * constructor used to create the empty nodes of the SkipList
     * 
     * @param newLevel
     *            the integer used to store the level of that node
     * 
     */
    public SkipNode(int newLevel)
    {
        level = newLevel;
        pair = null;
    }

    /**
     * constructor to make nodes that store a KVPair
     * 
     * @param newPair
     *            pair of values stored as the data in the node
     * @param newLevel
     *            the integer used to store the level of that node
     */
    public SkipNode(KVPair<K, E> newPair, int newLevel)
    {
        level = newLevel;
    }

    /**
     * =========================== getters and setters section
     */

    /**
     * key getter
     * 
     * @return key of the node
     */
    public K getKey()
    {
        return pair.key();
    }

    /**
     * value getter
     * 
     * @return value of node
     */
    public E getValue()
    {
        return pair.value();
    }

    /**
     * level getter
     * 
     * @return level of the current node
     */
    public int getLevel()
    {
        return level;
    }

    /**
     * -------------------------------- set the next node pointer
     * 
     * @param node
     *            is the next node
     */
    public void setNext(SkipNode<K, E> node)
    {
        next = node;
    }

    /**
     * next node getter
     * 
     * @return next node
     */
    public SkipNode<K, E> getNext()
    {
        return next;
    }

    /**
     * --------------------------------
     * 
     * set the node above current
     * 
     * @param node
     *            is the node above
     */
    public void setAbove(SkipNode<K, E> node)
    {
        above = node;
    }

    /**
     * above node getter
     * 
     * @return above node
     */
    public SkipNode<K, E> getAbove()
    {
        return above;
    }

    /**
     * 
     * set the node below current
     * 
     * @param node
     *            is the node below
     */
    public void setDown(SkipNode<K, E> node)
    {
        below = node;
    }

    /**
     * below node getter
     * @return down node
     */
    public SkipNode<K, E> getDown()
    {
        return below;
    }

    /**
     * ================================ this section contains insert, and find
     * operations
     */

    /**
     * Insert function for the nodes, aligns pointers correctly PRE: key should
     * not be the same as any other key in the list
     * 
     * @param key
     *            is the key of the node to be added
     * @param value
     *            is the value of the node to be added
     * @param level
     *            is the level of the node to be added
     * @param parent
     *            is the previous node for the one we're currently working with
     */
    // public void insert(K key, E value, int level, SkipNode<K, E> parent)
    // {
    // // if the level is the same, set next and previous parameters and check
    // // for above and below
    //
    // // if the level is different and larger, modify next, previous, above
    // // parameters
    //
    // // if the level is different and smaller (not 1), modify next, previous,
    // // above, and below parameters
    //
    // // if the level is 1, modify next and previous parameters
    //
    // //
    // }

}
