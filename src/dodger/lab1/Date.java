package dodger.lab1;

public class Date
{
    private int month;
    private int day;
    private int year;

    public Date()
    {
	month = 01;
	day = 01;
	year = 2000;
    }

    public Date(int month, int day, int year)
    {
	this.month = month;
	this.day = day;
	this.year = year;
    }

    public Date(Date d)
    {
	month = d.getMonth();
	day = d.getDay();
	year = d.getYear();
    }

    public int getMonth()
    {
	return month;
    }

    public int getDay()
    {
	return day;
    }

    public int getYear()
    {
	return year;
    }

    public void setDate(int month, int day, int year)
    {
	this.month = month;
	this.day = day;
	this.year = year;
    }

    public void clone(Date d)
    {
	month = d.getMonth();
	day = d.getDay();
	year = d.getYear();
    }

    public void setMonth(int m)
    {
	month = m;
    }

    public void setDay(int d)
    {
	day = d;
    }

    public void setYear(int y)
    {
	year = y;
    }

    public String toString()
    {
	return month + " / " + day + " / " + year;
    }

    public boolean equals(Object obj)
    {
	return (obj instanceof Date && day == ((Date) obj).getDay() && month == ((Date) obj).getMonth()
		&& year == ((Date) obj).getYear());
    }
}
