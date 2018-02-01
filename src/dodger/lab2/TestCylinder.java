package dodger.lab2;

/**
 * Used to test the Cylinder class
 * @author Joshua Coffey
 * @author jcoffey2@bellarmine.edu
 */
public class TestCylinder
{
	static Cylinder c1;
	static Cylinder c2;
	static Cylinder c3;
	static Cylinder c4;	
	static Cylinder c5;
	static Cylinder c6;
	static Cylinder c7;
	static Point p = new Point(1, 1);
	static Circle c = new Circle(5);	

	public static void main(String args[])
	{
		c1 = new Cylinder();
		c2 = new Cylinder(c);
		c3 = new Cylinder(10);
		c4 = new Cylinder(c, 10);
		c5 = new Cylinder(p, 5, 3);
		c6 = new Cylinder(3, 4, 5, 6);
		c7 = new Cylinder(c6);
		allStatus();

		c1.setHeight(15.33);
		c2.setRadius(4.20);
		c3.setX(-5);
		c4.setY(20);
		c5.setCoords(19, 19);
		c6.setHeight(7);
		allStatus();

		c7.copy(c6);
		equalTest();

		System.out.println("c1.getHeight(): " + c1.getHeight());
		System.out.println("c1.getArea(): " + c1.getArea());
		System.out.println("c1.getVolume(): " + c1.getVolume());
		System.out.println("c1.getCircumference(): " + c1.getCircumference());
		System.out.println("c1.getCenter(): " + c1.getCenter());
		System.out.println("c1.getX(): " + c1.getX());
		System.out.println("c1.getY(): " + c1.getY());
		System.out.println();

		c1.show();
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
