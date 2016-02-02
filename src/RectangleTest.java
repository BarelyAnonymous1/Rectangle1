import student.TestCase;

/**
 * test class to ensure the proper usage of the compareTo method
 * 
 * @author Jonathan DeFreeuw (jondef95), Preston Lattimer (platt)
 * @version 1
 */
public class RectangleTest extends TestCase
{
    /**
     * tests the results of the compareTo method when the two rectangles are the same
     */
    public void testCompareToTrue()
    {
        Rectangle rect1 = new Rectangle(0, 0, 10, 10);
        Rectangle rect2 = new Rectangle(0, 0, 10, 10);

        assertTrue(rect1.compareTo(rect2) == 0);
    }
    
    /**
     * tests when the compareTo should be false
     */
    public void testCompareToFalseX()
    {
        Rectangle rect1 = new Rectangle(0, 0, 10, 10);
        Rectangle rect2 = new Rectangle(1, 0, 10, 10);

        assertTrue(rect1.compareTo(rect2) == -1);
    }
    
    /**
     * tests when the compareTo should be false
     */
    public void testCompareToFalseXY()
    {
        Rectangle rect1 = new Rectangle(0, 0, 10, 10);
        Rectangle rect2 = new Rectangle(1, 1, 10, 10);

        assertTrue(rect1.compareTo(rect2) == -1);
    }
    
    /**
     * tests when the compareTo should be false
     */
    public void testCompareToFalseXYW()
    {
        Rectangle rect1 = new Rectangle(0, 0, 10, 10);
        Rectangle rect2 = new Rectangle(1, 1, 11, 10);

        assertTrue(rect1.compareTo(rect2) == -1);
    }
    
    /**
     * tests when the compareTo should be false
     */
    public void testCompareToFalseXYWH()
    {
        Rectangle rect1 = new Rectangle(0, 0, 10, 10);
        Rectangle rect2 = new Rectangle(1, 1, 11, 11);

        assertTrue(rect1.compareTo(rect2) == -1);
    }
    
    /**
     * tests when the compareTo should be false
     */
    public void testCompareToFalseY()
    {
        Rectangle rect1 = new Rectangle(0, 0, 10, 10);
        Rectangle rect2 = new Rectangle(0, 1, 10, 10);

        assertTrue(rect1.compareTo(rect2) == -1);
    }
    
    /**
     * tests when the compareTo should be false
     */
    public void testCompareToFalseYW()
    {
        Rectangle rect1 = new Rectangle(0, 0, 10, 10);
        Rectangle rect2 = new Rectangle(0, 1, 11, 10);

        assertTrue(rect1.compareTo(rect2) == -1);
    }
    
    /**
     * tests when the compareTo should be false
     */
    public void testCompareToFalseYWH()
    {
        Rectangle rect1 = new Rectangle(0, 0, 10, 10);
        Rectangle rect2 = new Rectangle(0, 1, 11, 11);

        assertTrue(rect1.compareTo(rect2) == -1);
    }
    
    /**
     * tests when the compareTo should be false
     */
    public void testCompareToFalseW()
    {
        Rectangle rect1 = new Rectangle(0, 0, 10, 10);
        Rectangle rect2 = new Rectangle(0, 0, 11, 10);

        assertTrue(rect1.compareTo(rect2) == -1);
    }
}
