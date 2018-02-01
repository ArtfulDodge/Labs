package dodger.lab2;

/**
 * Used to test the Point class
 * @author Joshua Coffey
 * @author jcoffy2@bellarmine.edu
 */
public class TestPoint
{
    static Point p1;
    static Point p2;
    static Point p3;
    static Point p4;
    
    public static void main(String args[])
    {
	p1 = new Point();
	p2 = new Point(5, 3);
	p3 = new Point(3);
	p4 = new Point(p3);
	allStatus();
	
	p1.setX(0.3);
	p2.setCoords(2, 5);
	p3.setY(2.6);
	
	allStatus();
	
	p4.copy(p3);
	equalTest();
	
	System.out.println("p1.getX(): " + p1.getX());
	System.out.println("p1.getY(): " + p1.getY());
	p1.show();
	System.out.println("p1.compareTo(p2): " + p1.compareTo(p2));
	System.out.println("p2.compareTo(p1): " + p2.compareTo(p1));
	System.out.println("p1.compareTo(\"wumbo\"): " + p1.compareTo("wumbo"));
	System.out.println("p3.compareTo(p4): " + p3.compareTo(p4));
    }
    
    private static void allStatus()
    {
	System.out.println("p1: " + p1); // Note that these outputs are also testing toString()
	System.out.println("p2: " + p2);
	equalTest();
    }
    
    private static void equalTest()
    {
	System.out.println("p3: " + p3);
	System.out.println("p4: " + p4);
	System.out.println("p3 == p4: " + (p3 == p4));
	System.out.println("p3.equals(p4): " + p3.equals(p4)); // Testing the equals() method
	System.out.println();
    }
}
