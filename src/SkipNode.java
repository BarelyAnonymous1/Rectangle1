/**
 * @author prestonlattimer
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

    public SkipNode(K keyer, E val, int lev)
    {
        this.key = keyer;
        this.value = val;
        this.level = lev;
    }

    /**
     * =========================== getters and setters section
     */

    /**
     * @return key of the node
     */
    public K getKey()
    {
        return key;
    }

    /**
     * @return value of node
     */
    public E getValue()
    {
        return value;
    }

    /**
     * @return level of the current node
     */
    public int getLevel()
    {
        return level;
    }

    /**
     * --------------------------------
     * 
     * @param node
     *            is the next node
     */
    public void setNext(SkipNode<K, E> node)
    {
        next = node;
    }

    /**
     * @return next node
     */
    public SkipNode<K, E> getNext()
    {
        return next;
    }

    /**
     * --------------------------------
     * 
     * @param node
     *            is the node above
     */
    public void setAbove(SkipNode<K, E> node)
    {
        above = node;
    }

    /**
     * @return up node
     */
    public SkipNode<K, E> getUp()
    {
        return above;
    }

    /**
     * --------------------------------
     * 
     * @param node
     *            is the node below
     */
    public void setDown(SkipNode<K, E> node)
    {
        below = node;
    }

    /**
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
    public void insert(K key, E value, int level, SkipNode<K, E> parent)
    {
        // if the level is the same, set next and previous parameters and check
        // for above and below

        // if the level is different and larger, modify next, previous, above
        // parameters

        // if the level is different and smaller (not 1), modify next, previous,
        // above, and below parameters

        // if the level is 1, modify next and previous parameters

        //
    }

}
