import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest
{

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
