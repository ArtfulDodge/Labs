package dodger.lab2;

/** 
 * Represents a point on the Cartesian coordinate plane
 * @author Joshua Coffey
 * @author jcoffey2@bellarmine.edu
 */
public class Point implements Comparable
{
    protected double xcoord;
    protected double ycoord;
    
    /**
     * Default constructor:
     * Creates a Point with an x coordinate and a y coordinate of 0
     */
    public Point()
    {
	xcoord = 0;
	ycoord = 0;
    }
    
    /**
     * Creates a Point with the specified x and y values
     * @param x The x value
     * @param y The y value
     */
    public Point(double x, double y)
    {
	xcoord = x;
	ycoord = y;
    }
    
    /**
     * Creates a Point with the specified x value and a y value of 0
     * @param x The x value
     */
    public Point(double x)
    {
	xcoord = x;
	ycoord = 0;
    }
    
    /**
     * Creates a Point that is a copy of the specified Point
     * @param p The point to copy
     */
    public Point(Point p)
    {
	xcoord = p.xcoord;
	ycoord = p.ycoord;
    }
    
    /**
     * Sets the x coordinate to the specified value
     * @param x The new x value
     */
    public void setX(double x)
    {
	xcoord = x;
    }
    
    /**
     * Sets the y coordinate to the specified value
     * @param y The new y value
     */
    public void setY(double y)
    {
	ycoord = y;
    }
    
    /**
     * Sets the x coordinate and the y coordinate to the specified values
     * @param x The new x value
     * @param y The new y value
     */
    public void setCoords(double x, double y)
    {
	xcoord = x;
	ycoord = y;
    }
    
    /**
     * Copies the specified Point
     * @param p The point to be copied
     */
    public void copy(Point p)
    {
	xcoord = p.xcoord;
	ycoord = p.ycoord;
    }
    
    /**
     * Returns the x coordinate
     * @return The x coordinate
     */
    public double getX()
    {
	return xcoord;
    }
    
    /** 
     * Returns the y coordinate
     * @return The y coordinate
     */
    public double getY()
    {
	return ycoord;
    }
    
    /**
     * Returns the Point as a String
     * @return The Point as a String
     */
    public String toString()
    {
	return "[" + String.format("%.2f", xcoord) + ", " + String.format("%.2f", ycoord) + "]";
    }
    
    /**
     * Returns true if obj is a Point with the same coordinates, false otherwise
     * @return True if obj is a Point with the same coordinates, false otherwise
     */
    @Override
    public boolean equals(Object obj)
    {
	return (obj instanceof Point && ((Point) obj).xcoord == xcoord 
		&& ((Point) obj).ycoord == ycoord);
    }
    
    /**
     * Prints a description of the point
     */
    public void show()
    {
	System.out.println("The point is at " + toString());
    }

    /**
     * Compares this to obj, returns -2 if obj is not a point, -1  if
     * obj is a point where obj.xcoord + obj.ycoord is less than
     * xcoord + ycoord, 0 if this point equals obj, and 1 if obj is a 
     * point where obj.xcoord + obj.ycoord is greater than xcoord + ycoord,
     * and returns -3 if none of those conditions are met
     * @return -3, -2, -2, 0, or 1
     */
    public int compareTo(Object obj)
    {
	if (!(obj instanceof Point))
	{
		return -2;
	}

	if (((Point) obj).xcoord + ((Point) obj).ycoord >
			xcoord + ycoord)
	{
		return 1;
	}

	if (equals(obj))
	{
		return 0;
	}

	if (((Point) obj).xcoord + ((Point) obj).ycoord <
			xcoord + ycoord)
	{
		return -1;
	}

	return -3;
    }
}
