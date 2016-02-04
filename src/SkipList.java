import java.lang.reflect.Array;
import java.util.Random;

/**
 * SkipList that will be used to hold rectnagles input from a file
 * @author Jonathan
 *
 */
public class SkipList<K extends Comparable<K>, E>
{
    /**
     * head node
     */
    private SkipNode<K, E> head;
    
    /**
     * number of nodes in the list
     */
    private int size;
    /**
     * level of the head
     */
    private int level;
    
    /**
     * creates a new skip list
     */
    public SkipList()
    {
        head = new SkipNode<K, E>(null, 1);
        level = 0;
        size = 0;
    }
    
    /**
     * fixes the head to make sure that it represents the new
     * 	largest number of levels
     * @param newLevel is the new largest levels
     */
    private void fixHead(int newLevel)
    {
    	SkipNode<K, E> oldHead = head;
    	head = new SkipNode<K, E>(null, newLevel);
    	for (int i = 0; i <= level; i++)
    	{
    		head.next[i] = oldHead.next[i];
    	}
    	level = newLevel;
    	
    }
    
    /**
     * flips a coin to generate a random level for the nodes
     * to be added.
     *
     * @return picked random level
     */
    private int pickRandomLevel()
    {
    	int leveler = 0;
    	Random random = new Random();
    	while (random.nextBoolean())
    	{
    		leveler++;
    	}
    	return leveler;
    }
    
    /**
     * randomly generates a level and iterates through
     * the list to add values in order, adds them at the
     * randomly generated level
     * @param newPair determines the pair to be added
     */
    /**@SuppressWarnings("unchecked")
	public void insert(KVPair<K, E> newPair)
    {
    	int newLevel = pickRandomLevel();
    	if (level < newLevel)
    	{
    		fixHead(newLevel);
    	}
    	
    	SkipNode<K, E>[] fixer = (SkipNode<K, E>[])new
    			SkipNode[level + 1];
    	SkipNode<K, E> inserter = head;
    	for (int i = level; 0 <= i; i--)
    	{
    		while((inserter.next[i] != null) && 
    				(newPair.key().compareTo(inserter.next[i].getKey()) > 0))
    		{
    			inserter = inserter.next[i];
    		}
    		fixer[i] = inserter;
    	}
    	inserter = new SkipNode<K, E>(newPair, newLevel);
    	for (int i = 0; i <= newLevel; i++)
    	{
    		inserter.next[i] = fixer[i].next[i];
    		fixer[i].next[i] = inserter;
    	}
    	size++;
    }*/
    
    /**
     * inserts a node in a sorted order
     * @param newpair is the pair to be inserted
     * @return whether iteration succeeded
     */
    @SuppressWarnings("unchecked")
    public boolean insert(KVPair<K, E> newpair)
    {
    	int newLevel = pickRandomLevel();
    	Comparable<K> key = newpair.key();
    	if (level < newLevel)
    	{
    		fixHead(newLevel);
    	}
    	SkipNode<K, E>[] update = (SkipNode[])Array.newInstance(SkipNode.class, 
    			level + 1);
    	SkipNode<K, E> curr = head;
    	for (int i = level; i >= 0; i--)
    	{
    		while((curr.next[i] != null) &&
    				(key.compareTo((curr.next[i]).getPair().key()) > 0))
    		{
    			curr = curr.next[i];
    		}
    		update[i] = curr;
    	}
    	curr = new SkipNode<K, E>(newpair, newLevel);
    	for (int i = 0; i <= newLevel; i++)
    	{
    		curr.next[i] = update[i].next[i];
    		update[i].next[i] = curr;
    	}
    	size++;
    	return true;
    }
    
    /**
     * implements the find method
     * @param key the value to search for
     * @return a value associated with the key if one is found
     */
    /**public E find(K keyFind)
    {
    	SkipNode<K, E> finder = head;
    	for (int i = level; 0 <= i; i--)
    	{
    		while((finder.next[i] != null) &&
    				(keyFind.compareTo(finder.next[i].getKey()) > 0))
    		{
    			finder = finder.next[i];
    		}
    	}
    	finder = finder.next[0];
    	if ((finder != null) && (keyFind.compareTo(finder.getKey()) == 0))
    	{
    		return finder.getValue();
    	}
    	else
    	{
    		return null;
    	}
    }*/
    
    public KVPair<K, E> search(K key)
    {
    	SkipNode<K, E> current = head;
    	for (int i = level; 0 <= i; i--)
    	{
    		while (current.next[i] != null &&
    				key.compareTo(current.next[i].getKey()) > 0)
    		{
    			current = current.next[i];
    		}
    	}
    	current = current.next[0];
    	if (current != null && key.compareTo(current.getKey()) == 0)
    	{
    		return current.getPair();
    	}
    	return null;
    }
    
    public SkipNode<K, E> nodeSearch(K key)
    {
    	SkipNode<K, E> current = head;
    	for (int i = level; 0 <= i; i--)
    	{
    		while (current.next[i] != null &&
    				key.compareTo(current.next[i].getKey()) > 0)
    		{
    			current = current.next[i];
    		}
    	}
    	current = current.next[0];
    	if (current != null && key.compareTo(current.getKey()) == 0)
    	{
    		return current;
    	}
    	return null;
    }
    
    
    /**
     * dumps the things in the skip list
     */
    public void dump()
    {
        SkipNode<K, E> current = head;
        while (current != null)
        {
            String name = "";
            if (current.getValue() == null)
            {
                name = "null";
            }
            else
            {
                name = current.getValue().toString();
            }
            System.out.println("Node has depth " + 
            		current.getLevel() + ", Value (" + name + ")");
            
            current = current.next[0];
        }
        System.out.println("SkipList size is: " + size);
    }
    
}