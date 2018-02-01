package dodger.lab1;

public class TestProgCompositon
{
    public static void main(String args[])
    {
	PersonalInfo newStudent = new PersonalInfo("William", "Jordan", 8, 24, 1963, 555238911);
	System.out.println(newStudent);
	System.out.println();

	PersonalInfo student = new PersonalInfo();
	System.out.println(student);
	System.out.println();

	student.clone(newStudent);
	System.out.println(student);
	System.out.println(student.equals(newStudent));
	System.out.println();

	Person person = new Person();
	Date date = new Date();
	int ID = 123456789;
	PersonalInfo test = new PersonalInfo(person, date, ID);
	System.out.println(test);
	System.out.println();

	System.out.println(test.getName());
	System.out.println(test.getBDay());
	System.out.println(test.getID());
	System.out.println();

	Person shaq = new Person("Shaq", "O'Neil");
	Date threes = new Date(3, 3, 3333);
	int testID = 987674321;
	test.setInfo(shaq, threes, testID);
	System.out.println(test);
	System.out.println();

	test.setInfo("Johnny", "Starr", 1, 1, 1970, 133759347);
	System.out.println(test);
	System.out.println();

	Person ringo = new Person("Ringo", "Star");
	test.setName(ringo);
	System.out.println(test);
	System.out.println();

	test.setName("Johnny", "Bravo");
	System.out.println(test);
	System.out.println();

	Date christmas = new Date(12, 25, 2018);
	test.setBDay(christmas);
	System.out.println(test);
	System.out.println();

	test.setBDay(5, 5, 2013);
	System.out.println(test);
	System.out.println();

	test.setID(324543569);
	System.out.println(test);
	System.out.println();

	System.out.println(test.getName());
	System.out.println(test.getBDay());
	System.out.println(test.getID());
    }
}
