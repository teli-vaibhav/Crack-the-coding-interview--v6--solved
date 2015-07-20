	/*
	 * The number of ways one can get to the nth step would be
	 * f(n) = f(n-1) + f(n-2) + f(n-3).
	 * We use DP to come up with a solution with O(n) time complexity
	 * and O(1) space complexity.
	 */
	public static int numberOfWaysToReachNthStep(int n)
	{
		if(n<=0)
			return 0;
		
		if(n==1 || n==2)
			return n;
		
		if(n==3)
			return 4;
		
		int a= 1;
		int b = 2;
		int c = 4;
		int res=0;
		
		for(int i=4;i<=n;i++)
		{
			res = a+b+c;
			a = b;
			b = c;
			c = res;
		}
		return res;
	}
