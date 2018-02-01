package dodger.lab1;

public class TestDate
{
    public static void main(String args[])
    {
	Date defaultDate = new Date();
	Date today = new Date(1, 9, 2018);
	Date myBirthDay = new Date(5, 4, 1999);
	Date twinBirthDay = new Date(myBirthDay);

	System.out.println(defaultDate);
	System.out.println(today);
	System.out.println(myBirthDay);
	System.out.println(twinBirthDay);
	System.out.println(myBirthDay.equals(twinBirthDay));

	today.clone(defaultDate);

	System.out.println(today);
	System.out.println(today.equals(defaultDate));

	System.out.println(today.getMonth());
	System.out.println(today.getDay());
	System.out.println(today.getYear());
    }
}
