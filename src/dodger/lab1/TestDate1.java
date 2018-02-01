package dodger.lab1;

public class TestDate1
{
    public static void main(String args[])
    {
	Date1 defaultDate = new Date1();
	Date1 today = new Date1(1, 9, 2018);
	Date1 myBirthDay = new Date1(5, 4, 1999);

	System.out.println(defaultDate);
	System.out.println(today);
	System.out.println(myBirthDay);

	defaultDate.printDate();
	today.printDate();
	myBirthDay.printDate();
    }
}
