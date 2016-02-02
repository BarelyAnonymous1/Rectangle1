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
     * creates a new skip list
     */
    public SkipList()
    {
        head = new SkipNode<K, E>(1);
        size = 0;
    }
    
    /**
     * @param newPair determines the pair to be added
     */
    public void insert(KVPair<K, E> newPair)
    {
    	int level = 0;
    	Random random = new Random();
    	while (random.nextBoolean())
    	{
    		level++;
    	}
    	
    	while(head.getLevel() < level)
    	{
    		SkipNode<K, E> newHead = new SkipNode<K, E>(null, head.getLevel() + 1);
    		head.setAbove(newHead);
    		newHead.setBelow(head);
    		head = newHead;
    	}
    	head.insert(newPair, level, null);
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
            current = current.getNext();
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
