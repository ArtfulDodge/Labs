package dodger.lab1;

public class Date1
{
    private int dMonth;
    private int dDay;
    private int dYear;

    public Date1()
    {
	dMonth = 01;
	dDay = 01;
	dYear = 2000;
    }

    public Date1(int month, int day, int year)
    {
	dMonth = month;
	dDay = day;
	dYear = year;
    }

    public int getMonth()
    {
	return dMonth;
    }

    public int getDay()
    {
	return dDay;
    }

    public int getYear()
    {
	return dYear;
    }

    public void setDate(int month, int day, int year)
    {
	dMonth = month;
	dDay = day;
	dYear = year;
    }

    public void printDate()
    {
	System.out.println("~~~~~~~~~~~~~~~~~~");
	System.out.println(dMonth + " / " + dDay + " / " + dYear);
    }
}
