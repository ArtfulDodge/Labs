package project4;

// ---------------------------------------------------------------
// Represents a password 
// ---------------------------------------------------------------
public class Password implements Encryptable
{
	private String word; // referred to as the password
	private boolean encrypted = false;
	
	// --------------------------------------------------------------- 
	// Default constructor;
	// Sets the password to an empty string and encrypts it just in
	// case
	// ---------------------------------------------------------------
	public Password()
	{
		word = "";
		encrypt();
	}	
	
	// ---------------------------------------------------------------
	// Constructor;
	// Sets the password to the given String and encrypts it
	// ---------------------------------------------------------------	
	public Password(String pass)
	{
		word = pass;
		encrypt();
	}

	// ---------------------------------------------------------------
	// Encrypts the password if it is not already encrypted
	// ---------------------------------------------------------------
	public void encrypt()
	{
		String result = "";
		if(!encrypted)
		{
			for (int i = 0; i < word.length() - 1; i++)
			{
	                        result += swap(word.charAt(i), word.charAt(++i));
							       
			}
		        
			if (word.length() % 2 != 0)
			{
				result += (char)~word.charAt(word.length() - 1);
			}	
			word = result;
			encrypted = true;
		}	
	}

	// ---------------------------------------------------------------
	// Decrypts the password if it's encrypted
	// ---------------------------------------------------------------
	public String decrypt()
	{
		String result = "";
		if(encrypted)
		{
		       for (int i = 0; i < word.length() - 1; i++)
		       {
			       result += swap(word.charAt(i), word.charAt(++i));
		       }	   
		       
		       if (word.length() % 2 != 0)
		       {
			   result += (char)~word.charAt(word.length() - 1);
		       }	   
		       word = result;
		       encrypted = false;
		}

		return word;
	}

	// ---------------------------------------------------------------
	// Returns a String with the given chars swapped in position  
	// ---------------------------------------------------------------
	private String swap(char c1, char c2)  
	{
		return (char)~c2 + "" + (char)~c1;
	}	
	
	// ---------------------------------------------------------------
	// Returns true if the password is encrypted
	// ---------------------------------------------------------------
	public boolean isEncrypted()
	{
		return encrypted;
	}

	// ---------------------------------------------------------------
	// Returns true if the given Object matches the password
	// ---------------------------------------------------------------
	public boolean equals(Object o)
	{
		if (o instanceof Encryptable)
			return  ((Encryptable) o).decrypt().equals(decrypt());

		if (o instanceof String)
			return decrypt().equals(o);
		
		return false;
	}

	// ---------------------------------------------------------------
	// Returns the encrypted password as a String
	// ---------------------------------------------------------------
	public String toString()
	{
		encrypt();
		return word;
	}
}
