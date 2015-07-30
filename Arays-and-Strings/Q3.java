	/*
	 * Time complexity is O(n)
	 * Space Complexity is O(1)
	 */
	public static String getReplacedString(String s)
	{
		if(s==null)
			return null;
		char[] c = s.toCharArray();
		
		if(c.length<=0)
			return null;
		if(c[c.length-1]!=' ' || c[c.length-2]!=' ')
			return s;
		
		int i=c.length-1;
		
		while(c[i]==' ' && i>=0)
			i--;
		
		int j=c.length-1;
		
		while(i>=0)
		{
			if(c[i]!=' ')
			{
				c[j]=c[i];
				j--;
				i--;
			}	
			else
			{
				c[j]='0';
				j--;
				c[j]='2';
				j--;
				c[j]='%';
				j--;i--;
			}
		}	
		
		StringBuilder sb = new StringBuilder();
		
		for(char m: c)
			sb.append(m);
		return sb.toString();		
	}
