package dodger.lab1;

public class Person
{
    private String firstName;
    private String lastName;

    public Person()
    {
	firstName = "Muzaffar";
	lastName = "Ali";
    }

    public Person(String first, String last)
    {
	firstName = first;
	lastName = last;
    }

    public Person(Person p)
    {
	firstName = p.getFirstName();
	lastName = p.getLastName();
    }

    public String getFirstName()
    {
	return firstName;
    }

    public String getLastName()
    {
	return lastName;
    }

    public void setName(String first, String last)
    {
	firstName = first;
	lastName = last;
    }

    public void setFirstName(String name)
    {
	firstName = name;
    }

    public void setLastName(String name)
    {
	lastName = name;
    }

    public void clone(Person p)
    {
	firstName = p.getFirstName();
	lastName = p.getLastName();
    }

    public String toString()
    {
	return firstName + " " + lastName;
    }

    public boolean equals(Object obj)
    {
	return (obj instanceof Person && firstName.equals(((Person) obj).getFirstName())
		&& lastName.equals(((Person) obj).getLastName()));
    }
}
