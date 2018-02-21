package project5;

public class Dog implements Speaker
{
	public Dog()
	{

	}

	public void speak()
	{
		System.out.println("woof!");
	}

	public void announce(String str)
	{
		speak();
		System.out.println("It seems the dog didn't understand that...");
	}
}
