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
     * tests the results of the compareTo method
     */
    public void testCompareTo()
    {
        Rectangle rect1 = new Rectangle(0, 0, 10, 10);
        Rectangle rect2 = new Rectangle(0, 0, 10, 10);
        Rectangle rect3 = new Rectangle(10, 11, 13, 13);

        assertTrue(rect1.compareTo(rect2) == 0);
        assertTrue(rect1.compareTo(rect3) == -1);
        assertTrue(rect2.compareTo(rect3) == -1);
    }
}
