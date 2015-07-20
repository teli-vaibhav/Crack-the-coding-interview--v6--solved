	/*
	 * Q1.2 Solution using hashmap.
	 * Time complexity O(n) & space complexity O(n).
	 * Can be done in O(1) space, similar to Q1.1 using an integer array
	 * to keep count of characters in first string and verifying in the 2nd.
	 */
	public static boolean isPermutation(String s1, String s2)
	{
		if(s1==null && s2==null)
			return true;
		
		if(s1==null || s2==null)
			return false;
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		int m =c1.length;
		int n= c2.length;
		
		if(m!=n)
			return false;
		
		Map<Character,Integer> hm = new HashMap<Character,Integer>();
		int temp;
		for(char a: c1)
		{
			if(hm.containsKey(a))
			  {
				temp=hm.get(a);
				hm.put(a, temp+1);
			  }
				
			else
				hm.put(a, 1);
		}
		
		for(char b: c2)
		{
			if(!hm.containsKey(b))
				return false;
			else
			{
				temp=hm.get(b);
				if(temp>1)
					hm.put(b, temp-1);
				else
					hm.remove(b);
			}
		}
		
		if(hm.isEmpty())
			return true;
		else
			return false;
	}
