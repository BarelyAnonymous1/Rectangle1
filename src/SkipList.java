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
        head = new SkipNode<K, E>(null, 0);
        level = -1;
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
     * @param newPair determines the pair to be added
     */
    @SuppressWarnings("unchecked")
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
    	size++;
    	
    	/**while(head.getLevel() < level)
    	{
    		sdf;
    	}
    	for (int i = level; 0 <= i; i--)
    	{
    		s;
    	}*/
//        SkipNode<K, E> newNode = new SkipNode<K, E>(newPair, 0);
//        if (head.getNext() == null)
//        {
//            head.setNext(newNode);
//        }
//        else
//        {
//            newNode.setNext(head.getNext());
//            head.setNext(newNode);
//        }
    }
    /**
     * implements find method
     */
    /**public E find(K key)
    {
    	SkipNode<K, E> foundnode = head.find(key);
    	return foundnode.getValue();
    }*/
    
    /**
     * dumps the things in the skip list
     */
    public void dump()
    {
        System.out.println("SkipList dump:");
        SkipNode<K, E> current = head;
        while (current != null)
        {
            String name = "";
            if (current.getValue() == null)
            {
                name = "(null)";
            }
            else
            {
                name = current.getValue().toString();
            }
            System.out.println("Node has depth " + current.getLevel() + ", Value " + name);
            System.out.println("SkipList size is: " + size);
            current = current.next[0];
        }
    }
    
    /**
     * gets the head
     */
    public SkipNode<K, E> getHead()
    {
    	return head;
    }
    
}
