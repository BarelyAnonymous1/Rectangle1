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
	private SkipNode<K,E> up, down, next, previous;
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
	public void insert(K key, E Value, int level, SkipNode<K, E> parent)
	{
		
	}

}
