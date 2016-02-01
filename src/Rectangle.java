
@SuppressWarnings("rawtypes")
public class Rectangle implements Comparable<Rectangle>
{
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle()
    {
        x = 0;
        y = 0;
        width = 0;
        height = 0;
    }

    public Rectangle(int newX, int newY, int newWidth, int newHeight)
    {
        x = newX;
        y = newY;
        width = newWidth;
        height = newHeight;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public void setX(int newX)
    {
        x = newX;
    }

    public void setY(int newY)
    {
        y = newY;
    }

    public void setWidth(int newWidth)
    {
        width = newWidth;
    }

    public void setHeigh(int newHeight)
    {
        height = newHeight;
    }

    @Override
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
