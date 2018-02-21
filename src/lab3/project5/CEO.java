package project5;

public class CEO implements Speaker
{
	public CEO()
	{

	}

	public void speak()
	{
		int rand = ((int)Math.random()*2);
		switch(rand)
		{
			case 0:
				System.out.println("Better ingrediants, better pizza. "
						   + "That's the power of Home Depot.");
			case 1:
				System.out.println("You can do it, we can help. "
						   + "Papa John's");
		}
	}
}
