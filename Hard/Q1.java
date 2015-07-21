	/*
	 * This will happen in near constant time.
	 * At bit level: O(m+n)
	 */
	public static int addTwoNumbers(int a,int b)
	{
		if(a==0)
			return b;
		if(b==0)
			return a;
		
		int sumWithCarry= a^b;
		int sumWithoutCarry= (a&b)<<1;
		return addTwoNumbers(sumWithCarry,sumWithoutCarry);
	}
