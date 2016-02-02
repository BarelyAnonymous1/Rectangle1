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
        pair = newPair;
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
    	if (pair != null)
    	{
    		return pair.key();
    	}
    	return null;
    }

    /**
     * value getter
     * 
     * @return value of node
     */
    public E getValue()
    {
    	if (pair != null)
    	{
    		return pair.value();
    	}
        return null;
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
    public void setBelow(SkipNode<K, E> node)
    {
        below = node;
    }

    /**
     * below node getter
     * @return down node
     */
    public SkipNode<K, E> getBelow()
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
     *            is the node for the level above where we are, CAN be null
     */
     public void insert(KVPair<K, E> kvpair, int level, SkipNode<K, E> parent)
     {
    	 if (level >= this.level && 
    			 (next == null || 
    			 (kvpair.key().compareTo(next.getKey()) > 0)))
    	 {
    		 SkipNode<K, E> node1 = new SkipNode<K, E>(kvpair, this.level);
    		 if (next != null)
    		 {
    			 node1.setNext(next);
    		 }
    		 next = node1;
    		 if (parent != null) 
    		 {
    			 node1.setAbove(parent);
    			 parent.setBelow(node1);
    		 }
    		 if (below != null) 
    		 {
    			 below.insert(kvpair, level, node1);
    		 }
    		 
    	 }
    	 else if (next != null && next.getKey().compareTo(this.getKey()) < 0)
    	 {
    		 next.insert(kvpair, level, parent);
    	 }
    	 else if (next != null && next.getKey().compareTo(this.getKey()) == 0)
    	 {
    		 System.out.println("Cannot use duplicate key!");
    	 }
    	 else if (below != null) 
    	 {
    		 below.insert(kvpair, level, parent);
    	 }
     }
     
     /**
      * implements the find method
      */
     public SkipNode<K, E> find(K key)
     {
    	 if (next!= null) 
    	 {
    		 int comparison = next.getKey().compareTo(this.getKey());
    		 
    		 if (comparison == 0)
    		 {
    			 return next;
    		 }
    		 else if (comparison < 0)
    		 {
    			 return next.find(this.getKey());
    		 }
    		 else if (below != null)
    		 {
    			 return below.find(this.getKey());
    		 }
    		 else
    		 {
    			 System.out.println("No such key exists");
    			 return null;
    		 }
    	 }
    	 else if (below != null)
    	 {
    		 return below.find(this.getKey());
    	 }
    	 else
    	 {
    		 System.out.println("No such key exists");
    		 return null;
    	 }
     }
     
     

}
