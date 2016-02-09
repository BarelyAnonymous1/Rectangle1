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
     * tests the toString method of the rectangle
     */
    public void testToString()
    {
        Rectangle rect1 = new Rectangle("Hello World!", 0, 0, 10, 10);
        assertFuzzyEquals("0, 0, 10, 10", rect1.toString());
    }

    /**
     * places two rectangles on the same vertical plane, but 10 horizontal units
     * away from each other to show that they do not intersect
     */
    public void testRectangleHorizontal()
    {
        Rectangle left = new Rectangle("left", 20, 20, 40, 40);
        Rectangle right = new Rectangle("right", 70, 20, 40, 40);
        assertFalse(left.intersects(right));
        assertFalse(right.intersects(left));
    }

    /**
     * places two rectangles on the same horizontal plane, but 10 vertical units
     * away from each other to show that they do not intersect
     */
    public void testRectangleVertical()
    {
        Rectangle top = new Rectangle("top", 20, 20, 40, 40);
        Rectangle bottom = new Rectangle("bottom", 20, 70, 40, 40);
        assertFalse(top.intersects(bottom));
        assertFalse(bottom.intersects(top));
    }

    /**
     * tests when two rectangles intersect with lines touching
     */
    public void testRectangleIntersect()
    {
        Rectangle rect1 = new Rectangle("rect1", 10, 10, 20, 20);
        Rectangle rect2 = new Rectangle("rect2", 15, 15, 20, 20);
        assertTrue(rect1.intersects(rect2));
        assertTrue(rect2.intersects(rect1));
    }

    /**
     * tests when a rectangle inside another rectangle
     */
    public void testRectangleInside()
    {
        Rectangle rect1 = new Rectangle("rect1", 10, 10, 5, 5);
        Rectangle rect2 = new Rectangle("rect2", 11, 11, 1, 1);
        assertTrue(rect1.intersects(rect2));
        assertTrue(rect2.intersects(rect1));
    }

    /**
     * tests when a rectangle is on the border of another
     */
    public void testRectangleTouch()
    {
        Rectangle rect1 = new Rectangle("rect1", 10, 10, 5, 5);
        Rectangle rect2 = new Rectangle("rect2", 15, 10, 5, 5);
        assertFalse(rect1.intersects(rect2));
        assertFalse(rect2.intersects(rect1));
    }
    
    /**
     * tests the .equals method
     */
    public void testEquals()
    {
        Rectangle rect1 = new Rectangle("rect1", 1, 1, 1, 1);
        Rectangle rect2 = new Rectangle("rect2", 2, 2, 2, 2);
        Rectangle rect3 = new Rectangle("rect3", 1, 1, 1, 1);
        Object obj = new Object();
        assertFalse(rect1.equals(obj));
        assertFalse(rect1.equals(new Rectangle("a", 1, 1, 2, 2)));
        assertFalse(rect1.equals(new Rectangle("a", 1, 1, 1, 2)));
        assertTrue(rect1.equals(rect3));
        assertFalse(rect1.equals(rect2));
    }
}