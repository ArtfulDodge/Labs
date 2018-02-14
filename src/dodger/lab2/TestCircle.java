package dodger.lab2;

/**
 * Used to test the Circle class
 * @author Joshua Coffey
 * @author jcoffey2@bellarmine.edu
 */
public class TestCircle
{
    static Circle c1;
    static Circle c2;
    static Circle c3;
    static Circle c4;
    static Circle c5;
    static Circle c6;
    static Circle c7;
    static Point p1 = new Point(9,6);
    
    public static void main(String args[])
    {
	c1 = new Circle();
	c2 = new Circle(5);
	c3 = new Circle(2, 4);
	c4 = new Circle(3, 5, 2);
	c5 = new Circle(p1);
	c6 = new Circle(p1, 3);
	c7 = new Circle(c6);
	allStatus();
	
	c1.setX(5);
	c2.setCoords(3, 4);
	c3.setY(5);
	c4.setRadius(6);
	c5.setCoords(6, 9);
	c6.setX(1);
	
	allStatus();
	
	c7.copy(c6);
	equalTest();
	
	System.out.println("c1.getRadius(): " + c1.getRadius());
	System.out.println("c1.getCircumference(): " + c1.getCircumference());
	System.out.println("c1.getArea(): " + c1.getArea());
	System.out.println("c1.getCenter(): " + c1.getCenter());
	System.out.println("c1.getX(): " + c1.getX());
	System.out.println("c1.getY(): " + c1.getY());
	System.out.println();
	
	c1.show();
	p1 = c1;
    }
    
    private static void allStatus()
    {
	System.out.println("c1: " + c1);
	System.out.println("c2: " + c2);
	System.out.println("c3: " + c3);
	System.out.println("c4: " + c4);
	System.out.println("c5: " + c5);
	equalTest();
    }
    
    private static void equalTest()
    {
	System.out.println("c6: " + c6);
	System.out.println("c7: " + c7);
	System.out.println("c6 == c7: " + (c6 == c7));
	System.out.println("c6.equals(c7): " + c6.equals(c7));
	System.out.println();
    }
}
