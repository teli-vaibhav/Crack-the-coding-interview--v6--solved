	/*
	 * This happens in constant time O(1)
	 * if broken down to bits the O(m+n) where m and n
	 * represent the number of bits in a and b.
	 */
	public static void swapTwoNumbers(int a,int b)
	{
		a= a^b;
		b=a^b;
		a=a^b;
	}
