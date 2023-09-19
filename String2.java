class String2 
{
	public static void main(String[] args) 
	{
		String s1="RAMA";
		String s2=new String("RAMA");
		
		//comapres references
		//-------------------

		if (s1==s2)
		{
			System.out.println("References are equal...");

		}

		else
		{
			System.out.println("References are not equal...");

		}

		// compares strings content
		//---------------------------
		if (s1.equals(s2))
		{
			System.out.println("Strings content are equal...");

		}

		else
		{
			System.out.println("Strings content are not equal...");

		}
		
	}
}
