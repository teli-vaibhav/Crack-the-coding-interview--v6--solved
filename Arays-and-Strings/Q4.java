	/*
	 * Time complexity is O(n) and space complexity is O(1)
	 */
	public static boolean isPermutationAPalindrome(String s)
	{
		if(s==null || s.length()<=0)
			return true;
		
		int n = s.length();
		BitSet bs = new BitSet(256);
		
		for(int i=0;i<n;i++)
			bs.flip(s.charAt(i));
		
		int count = 0;
		for(int i=0;i<256;i++)
		{
			if(bs.get(i))
				count++;
			
			if(count>1)
				return false;
		}
		return true;
	}
