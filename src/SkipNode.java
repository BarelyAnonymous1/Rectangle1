/**
 * 
 */

/**
 * @author prestonlattimer
 * @param <E>
 *
 */
public class SkipNode<K extends Comparable<K>, E> {
	
	/**
	 * creates a skip list node that is blank that 
	 * will be the one we actually are creating
	 */
	private SkipNode<K, E> 
	above, 
	below, 
	next, 
	previous;
	
	/**
	 * creates a private key for this node;
	 */
	private K key;
	/**
	 * creates a private value for this node;
	 */
	private E value;
	/**
	 * determines the level that the node is actually on
	 */
	private int level;
	
	public SkipNode(K keyer, E val, int lev) {
		this.key = keyer;
		this.value = val;
		this.level = lev;
	}
	
	/**
	 * getters and setters section
	 */
	
	/**
	 * @return key of the node
	 */
	public K getKey() {
		return key;
	}
	
	/**
	 * @return value of node
	 */
	public E getValue() {
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
	 * @param node is the previous node
	 */
	public void setPrevious(SkipNode<K, E> node)
	{
		previous = node;
	}
	/**
	 * @return previous node 
	 */
	public SkipNode<K, E> getPrevious()
	{
		return previous;
	}
	
	/**
	 * --------------------------------
	 * @param node is the next node
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
	 * @param node is the node above
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
	 * @param node is the node below
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
}
