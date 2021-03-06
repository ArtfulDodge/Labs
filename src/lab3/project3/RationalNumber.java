package project3;

public class RationalNumber implements Comparable<RationalNumber>
{
	private int numerator, denominator;

	public RationalNumber()
	{
		numerator = 0;
		denominator = 1;
	}

	public RationalNumber(int numer, int denom)
	{
		if (denom == 0)
			denom = 1;

		if (denom < 0)
		{
			numer *= -1;
			denom *= -1;
		}

		numerator = numer;
		denominator = denom;

		reduce();
	}

	public int getNumerator()
	{
		return numerator;
	}
	
	public int getDenominator()
	{
		return denominator;
	}

	public RationalNumber reciprocal()
	{
		return new RationalNumber(denominator, numerator);
	}

	public RationalNumber add(RationalNumber op2)
	{
		int commonDenominator = denominator * op2.getDenominator();
		int numerator1 = numerator * op2.getDenominator();
		int numerator2 = op2.getNumerator() * denominator;
		int sum = numerator1 + numerator2;

		return new RationalNumber(sum, commonDenominator);
	}

	public RationalNumber subtract(RationalNumber op2)
	{
		int commonDenominator = denominator * op2.getDenominator();
		int numerator1 = numerator * op2.getDenominator();
		int numerator2 = op2.getNumerator() * denominator;
		int difference = numerator1 - numerator2;

		return new RationalNumber(difference, commonDenominator);
	}

	public RationalNumber multiply(RationalNumber op2)
	{
		int numer = numerator * op2.getNumerator();
		int denom = denominator * op2.getDenominator();

		return new RationalNumber(numer, denom);
	}

	public RationalNumber divide(RationalNumber op2)
	{
		return multiply(op2.reciprocal());
	}

	public boolean isLike(RationalNumber op2)
	{
		return (numerator == op2.getNumerator() &&
			denominator == op2.getDenominator());
	}

	public String toString()
	{
		String result;

		if (numerator == 0)
			result = "0";
		else
			if (denominator == 1)
				result = numerator + "";
		else
			result = numerator + "/" + denominator;

		return result;
	}

	private void reduce()
	{
		if (numerator != 0)
		{
			int common = gcd(Math.abs(numerator), denominator);

			numerator /= common;
			denominator /=  common;
		}
	}

	private int gcd(int num1, int num2)
	{
		if (num2 == 0)
		{
			return num1;
		}

		return gcd(num2, num1 % num2);
	}

	public int compareTo(RationalNumber obj)
	{
		double thisNumber =(double)numerator / (double)denominator;
		double objNumber = (double)obj.getNumerator() / (double)obj.getDenominator();
		final double TOL = 0.0001; // The tolerance value
		
		if (Math.abs(thisNumber - objNumber) <= TOL)
		{
			return 0;
		}

		if (thisNumber < objNumber)
		{
			return -1;
		}

		if (thisNumber > objNumber)
		{
			return 1;
		}

		return -2; // If this is returned then something has gone wrong
	}
}
