package dodger.lab2;

/**
 * Represents a Cylinder
 * @author Joshua Coffey
 * @author jcoffey2@bellarmine.edu
 */
public class Cylinder extends Circle
{
    /**
     * Height is set to 1 by default
     */
    private double height = 1;
    private double volume;
    
    // Note: unless stated otherwise all constructors call getVolume()
    // to calculate and set the volume
    
    /**
     * Default constructor:
     * Creates a Cylinder with the base centered on [0,0], a radius
     * of 1, and a height of 1
     */
    public Cylinder()
    {
	super();
	getVolume();
    }
    
    /**
     * Creates a Cylinder with a base equivalent to the specified circle
     * and a height of 1
     * @param base The Circle to represent the base
     */
    public Cylinder(Circle base)
    {
	super(base);
	getVolume();
    }
    
    /**
     * Creates a Cylinder with a base centered on [0,0], a radius of 1,
     * and the specified height
     * @param height The height
     */
    public Cylinder(double height)
    {
	super();
	this.height = height;
	getVolume();
    }
    
    /**
     * Creates a Cylinder with the specified base circle and height
     * @param base The base Circle
     * @param height The height
     */
    public Cylinder(Circle base, double height)
    {
	super(base);
	this.height = height;
	getVolume();
    }
    
    /**
     * Creates a Cylinder with a base centered on the specified Point,
     * with the specified radius, and with the specified height
     * @param center The center Point
     * @param rad The radius
     * @param height The height
     */
    public Cylinder(Point center, double rad, double height)
    {
	super(center, rad);
	this.height = height;
	getVolume();
    }
    
    /**
     * Creates a Cylinder with a base centered on a Point with the
     * specified coordinates, with the specified radius, and with
     * the specified height
     * @param x The x coordinate
     * @param y The y coordinate
     * @param rad The radius
     * @param height The height
     */
    public Cylinder(double x, double y, double rad, double height)
    {
	super(x,y,rad);
	this.height = height;
	getVolume();
    }
    
    /**
     * Creates a Cylinder that is a copy of the specified Cylinder
     * @param cy The Cylinder to copy
     */
    public Cylinder(Cylinder cy)
    {
	super(cy);
	height = cy.height;
	getVolume();
    }
    
    /**
     * Copies all the properties of the specified point that it can,
     * including radius if it's a Circle and height if it's a Cylinder
     * @param cy The point to be copied
     */
    @Override
    public void copy(Point cy)
    {
	super.copy(cy);
	if (cy instanceof Cylinder)
	{
	    height = ((Cylinder) cy).height;
	    getVolume();
	    getArea();
	}
    }
    
    /**
     * Sets the height to the specified value
     * @param height The new height
     */
    public void setHeight(double height)
    {
	this.height = height;
    }
    
    /**
     * Returns the value of height
     * @return height
     */
    public double getHeight()
    {
	return height;
    }
    
    /**
     * Returns the base Circle
     * @return The base Circle
     */
    public Circle getBase()
    {
	return new Circle(xcoord,ycoord,radius);
    }
    
    /**
     * Calculates and returns the surface area of the Cylinder
     * @return The surface area of the Cylinder
     */
    @Override
    public double getArea()
    {
	area = (2 * super.getArea()) + (2 * Math.PI * radius * height);
	return area;
    }
    
    /**
     * Calculates and returns the volume of the Cylinder
     * @return The volume of the Cylinder
     */
    public double getVolume()
    {
	volume = super.getArea() * height;
	return volume;
    }
    
    /**
     * Returns a representation of the Cylinder as a String
     * @return A representation of the Cylinder as a String
     */
    @Override
    public String toString()
    {
	return "<" + super.toString() + ", " + height + ">";
    }
    
    /**
     * Returns true if obj is a Cylinder with the same center point, base, 
     * and height
     * @return True if this Cylinder is equal to obj
     */
    @Override
    public boolean equals(Object obj)
    {
	return super.equals(obj) && obj instanceof Cylinder &&
		((Cylinder) obj).height == height;
    }
    
    /**
     * Prints a description of the Cylinder
     */
    public void show()
    {
	System.out.println("The Cylinder's base has a center"
		+ "point at [" + xcoord + ", " + ycoord + "] and a "
		+ "radius of " + radius + ". The Cylinder's height is "
			+ height + ".");
    }
}
