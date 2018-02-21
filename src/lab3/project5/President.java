package project5;

public class President implements Speaker
{
	private final int ROOSEVELT = 0, CLINTON = 1, NIXON = 2, 
			  LINCOLN = 3, TRUMP = 4;

	public President()
	{
		
	}

	public void speak()
	{
		int quote = ((int)Math.random() * 5);
		switch(quote)
		{
			case ROOSEVELT:
				System.out.println("The only thing to fear " 
						   + "is fear itself.");
			case CLINTON:
				System.out.println("We must teach our children "
						   + "to resolve their conflicts with "
						   + "words, not weapons.");
			case NIXON:
				System.out.println("A man is not finished when he is "
					       	   + "defeated. He is finished when he quits.");
			case LINCOLN:
				System.out.println("Those who deny freedom to others "
					           + "deserve it not for themselves.");
			case TRUMP:
				System.out.println("Grab 'em by the p****.");
		}
	}
}
