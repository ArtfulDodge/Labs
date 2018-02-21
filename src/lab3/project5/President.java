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

	public void announce(String str)
	{
		switch(str)
		{
			case "war":
				System.out.println("Yesterday, December 7th, 1941 - a date which " 
						   + "will live in infamy - the United States of America " 
						   + "was suddenly and deliberately attacked by " 
						   + "naval and air forces of the Empire of Japan.");
			case "trade":
				System.out.println("This has been the worst trade deal in the history "
						   + "of trade deals.");
			case "peace":
				System.out.println("General Eisenhower informs me that the forces of " 
						   + "Germany have surrendered to the United Nations. " 
						   + "The flags of freedom fly over all Europe.");
			case default:
				System.out.println("There is nothing to announce at this time.");
 		}
	}
}
