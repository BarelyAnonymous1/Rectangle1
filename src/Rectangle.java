
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
    /**
     * x coordinate of upper left corner of Rectangle
     */
    private int x;
    /**
     * y coordinate of upper left corner of Rectangle
     */
    private int y;
    /**
     * horizontal length of Rectangle; the difference between the x coordinate
     * of the right corner and x coordinate of left corner
     */
    private int width;
    /**
     * vertical length of Rectangle; the difference between the x coordinate of
     * the right corner and x coordinate of left corner
     */
    private int height;

    /**
     * default constructor for Rectangle class; creates an empty Rectangle
     */
    public Rectangle()
    {
        x = 0;
        y = 0;
        width = 0;
        height = 0;
    }

    /**
     * standard constructor for Rectangle; sets up the position and size
     * 
     * @param newX
     *            x coordinate of upper left corner
     * @param newY
     *            y coordinate of upper left corner
     * @param newWidth
     *            horizontal length of Rectangle
     * @param newHeight
     *            vertical length of Rectangle
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
