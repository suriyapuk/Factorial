class Factorial
{
	Long i, result1 = 1L, result2 = 1L;

	public Long fac1(int j) //Loop
	{
		for(i=1L;i<=j;i++)
		{
			result1=result1*i;
		}
		return result1;
	}

	public Long fac2(int j) //Recursive
	{
		if(j>1)
		{
			result2=j*fac2(j-1);
		}
		else
		{
			result2=result2*1;
		}
		return result2;
	}

	public static void main(String[] args)
	{
		Factorial f = new Factorial();
		System.out.println("[ Looping ] "+Integer.parseInt(args[0])+"! = "+f.fac1(Integer.parseInt(args[0])));
		System.out.println("[Recursive] "+Integer.parseInt(args[0])+"! = "+f.fac2(Integer.parseInt(args[0])));
	}
}