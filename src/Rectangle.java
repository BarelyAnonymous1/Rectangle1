
/**
 * Rectangle class that is used to hold the upper left corner coordiantes,
 * width, and height of a Rectangle. Implements Comparable interface to allow
 * comparison of Rectangles when searching for a specific Rectangle in a list
 * 
 * @author Jonathan DeFreeuw (jondef95), Preston Lattimer (platt)
 * @version 1
 */
public class Rectangle implements Comparable<Rectangle>
{
    private int x;
    private int y;
    private int width;
    private int height;

    /**
     * 
     */
    public Rectangle()
    {
        x = 0;
        y = 0;
        width = 0;
        height = 0;
    }

    /**
     * 
     * @param newX
     * @param newY
     * @param newWidth
     * @param newHeight
     */
    public Rectangle(int newX, int newY, int newWidth, int newHeight)
    {
        x = newX;
        y = newY;
        width = newWidth;
        height = newHeight;
    }

    /**
     * 
     * @return
     */
    public int getX()
    {
        return x;
    }

    /**
     * 
     * @return
     */
    public int getY()
    {
        return y;
    }

    /**
     * 
     * @return
     */
    public int getWidth()
    {
        return width;
    }

    /**
     * 
     * @return
     */
    public int getHeight()
    {
        return height;
    }

    /**
     * 
     * @param newX
     */
    public void setX(int newX)
    {
        x = newX;
    }

    /**
     * 
     * @param newY
     */
    public void setY(int newY)
    {
        y = newY;
    }

    /**
     * 
     * @param newWidth
     */
    public void setWidth(int newWidth)
    {
        width = newWidth;
    }

    /**
     * 
     * @param newHeight
     */
    public void setHeigh(int newHeight)
    {
        height = newHeight;
    }

    /**
     * @param obj
     */
    public int compareTo(Rectangle obj)
    {
        if (this.x == obj.getX() && this.y == obj.getY()
                && this.width == obj.getWidth()
                && this.height == obj.getHeight())
        {
            return 0;
        }
        else
        {
            return -1;
        }
    }

}
