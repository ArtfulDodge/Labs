package dodger.lab1;

public class PersonalInfo
{
    private Person name;
    private Date bDay;
    private int personID;

    public PersonalInfo()
    {
	name = new Person();
	bDay = new Date();
	personID = 000000000;
    }

    public PersonalInfo(Person person, Date birthDay, int ID)
    {
	name = person;
	bDay = birthDay;
	personID = ID;
    }

    public PersonalInfo(String first, String last, int month, int day, int year, int ID)
    {
	name = new Person(first, last);
	bDay = new Date(month, day, year);
	personID = ID;
    }

    public void clone(PersonalInfo pi)
    {
	setInfo(pi.getName(), pi.getBDay(), pi.getID());
    }

    public void setInfo(Person person, Date birthDay, int ID)
    {
	name = person;
	bDay = birthDay;
	personID = ID;
    }

    public void setInfo(String first, String last, int month, int day, int year, int ID)
    {
	name = new Person(first, last);
	bDay = new Date(month, day, year);
	personID = ID;
    }

    public void setName(Person p)
    {
	name.clone(p);
    }

    public void setName(String first, String last)
    {
	name.setFirstName(first);
	name.setLastName(last);
    }

    public void setBDay(Date d)
    {
	bDay.clone(d);
    }

    public void setBDay(int month, int day, int year)
    {
	bDay.setMonth(month);
	bDay.setDay(day);
	bDay.setYear(year);
    }

    public void setID(int ID)
    {
	personID = ID;
    }

    public Person getName()
    {
	return name;
    }

    public Date getBDay()
    {
	return bDay;
    }

    public int getID()
    {
	return personID;
    }

    public String toString()
    {
	return "Name: " + name + "\n" + "DoB:  " + bDay + "\n" + "ID#:  " + personID;
    }

    public boolean equals(Object obj)
    {
	return (obj instanceof PersonalInfo && name.equals(((PersonalInfo) obj).getName())
		&& bDay.equals(((PersonalInfo) obj).getBDay()) && personID == ((PersonalInfo) obj).getID());
    }
}
