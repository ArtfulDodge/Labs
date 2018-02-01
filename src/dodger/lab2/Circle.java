package dodger.lab2;

/** Represents a Circle
 * @author Joshua Coffey
 * @author jcoffey2@bellarmine.edu
 */

public class Circle extends Point
{
    protected double radius;
    protected double circumference;
    protected double area;
    
    /**
     * Default constructor:
     * Sets xcoord and ycoord to 0 and radius to 1, 
     * since a circle with 0 radius would just be a point
     */
    
    public Circle()
    {
	super();
	radius = 1;
	setAreaCircum();
    }
    
   /** 
    * Creates a Circle centered at [0, 0] with the
    * specified radius
    * @param rad The radius
    */
    public Circle(double rad)
    {
	super();
	radius = Math.abs(rad);
	setAreaCircum();
    }
    
    /** 
     * Creates a circle centered at the specified coordinates with 
     * a radius of 1
     * @param x The x coordinate
     * @param y The y coordinate
     */
    public Circle(double x, double y)
    {
	super(x,y);
	radius = 1;
	setAreaCircum();
    }
    
    /** 
     * Creates a circle centered at the specified coordinates with
     * the specified radius
     * @param x The x coordinate
     * @param y The y coordinate
     * @param rad The radius
     */
    public Circle(double x, double y, double rad)
    {
	super(x,y);
	radius = Math.abs(rad);
	setAreaCircum();
    }
    
    /** 
     * Creates a circle centered at the specified point with
     * a radius of 1
     * @param p The center point
     */
    public Circle(Point p)
    {
	super(p);
	radius = 1;
	setAreaCircum();
    }
    
    /** 
     * Creates a circle centered at the specified point with
     * the specified radius
     * @param p The center point
     * @param rad The radius
     */
    public Circle(Point p, double rad)
    {
        super(p);
        radius = Math.abs(rad);
        setAreaCircum();
    }

    /** 
     * Creates a circle that is a copy of the specified circle
     * @param c The circle to copy
     */
    public Circle(Circle c)
    {
	super(c);
	radius = c.radius;
	setAreaCircum();
    }
    
    /** 
     * Called by the constructors to set the area and circumference
     */
    private void setAreaCircum()
    {
        getArea();
        getCircumference();
    }

    /**
     * Copies every parameter possible of the specified point,
     * including  radius if it's a circle
     * @param c The point to copy
     */
    @Override
    public void copy(Point c)
    {
	super.copy(c);
	if(c instanceof Circle)
	{
	    radius = ((Circle) c).radius;
	    getArea();
	    getCircumference();
	}
    }
    
    /** 
     * Sets the radius of the circle to the specified value
     * @param rad The new radius
     */
    public void setRadius(double rad)
    {
	radius = rad;
    }
   
    /**
     * Returns the radius 
     * @return The radius of the circle
     */
    public double getRadius()
    {
	return radius;
    }
    
    /** 
     * Calculates and returns the circumference of the circle.
     * Doing the calculation here ensures that the circumference
     * is always up to date when it's being used in the event that
     * the radius is changed.
     * @return The circumference
     */
    public double getCircumference()
    {
	circumference = Math.PI * (2 * radius);
	return circumference;
    }
    
    /** 
     * Calculates and returns the area of the circle
     * @return The area of the circle
     */
    public double getArea()
    {
	area = Math.PI * (radius * radius);
	return area;
    }
   
    /** 
     * Returns the center point of the circle
     * @return The center point of the circle
     */
    public Point getCenter()
    {
	return new Point(xcoord, ycoord);
    }

    /** 
     * Returns the properties of the circle as a String
     * @return The properties of the circle as a String
     */
    @Override
    public String toString()
    {
        return "(" + super.toString() + ", " + String.format("%.2f", radius) + ")";
    }

    /** 
     * Returns true if obj is a circle with all the same attributes,
     * false otherwise
     * @return True if obj is a circle with all the same attributes,
     * false otherwise
     * @param obj The object we're compaing to
     */
    @Override
    public boolean equals(Object obj)
    {
        return super.equals(obj) && obj instanceof Circle && 
        	((Circle) obj).radius == radius;
    }
    
    /** 
     * Prints the properties of the Circle
     */
    @Override
    public void show()
    {
	System.out.println("The center of the circle is at " + 
		super.toString() + ", and the radius is " + radius);
    }
}
