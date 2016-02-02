
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
    
    public SkipList()
    {
        head = new SkipNode<K, E>(0);
    }
    
    public void insert(KVPair<K, E> newPair)
    {
        SkipNode<K, E> newNode = new SkipNode<K, E>(newPair, 0);
        if (head.getNext() == null)
        {
            head.setNext(newNode);
        }
        else
        {
            newNode.setNext(head.getNext());
            head.setNext(newNode);
        }
    }
    
    public void dump()
    {
        while 
    }
}
