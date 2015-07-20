	/*
	 * Q1.1 Assuming ASCII characters.
	 * Time complexity is O(n) and space complexity is O(1).
	 */
	public static boolean isUniqueCharacterString(String s)
	{
		if(s==null || s.length()==0)
			return true;
		
		BitSet bs = new BitSet(256);
		
		for(char c: s.toCharArray())
		{
			if(bs.get(c))
				return false;
			bs.set(c);
		}
		
		return true;
	}
