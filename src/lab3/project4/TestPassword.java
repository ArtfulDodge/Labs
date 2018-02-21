package project4;

// ---------------------------------------------------------------
// Tests the Password class alongside the Secret class
// ---------------------------------------------------------------
import java.util.Scanner;
public class TestPassword
{
	private static Secret secret;
        private static Password password;
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the secret password: ");
		String secretpass = input.nextLine();

		secret = new Secret(secretpass);
		password = new Password(secretpass);
		print();
		
		secret.encrypt();
		password.encrypt();
		
		print();

		System.out.println("secret: " + secret.decrypt() + "\npassword: " + password.decrypt());

		System.out.println("secret.isEncrypted(): " + secret.isEncrypted() + "\npassword.isEncrypted(): " + password.isEncrypted());   
		System.out.println("password.equals(secret): " + password.equals(secret));
		System.out.println("password.equals(secretpass): " + password.equals(secretpass));
		System.out.println("password.equals(\"fish\"): " + password.equals("fish"));
	}

	private static void print()
	{
		System.out.println("secret: " + secret + "\npassword: " + password);
	}
}
