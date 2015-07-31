	/*
	 * Time complexity is O(n) and space complexity is O(n)
	 */
	public static String performCompression(String s)
	{
		if(s==null || s.length()<=0)
			return s;
		char[] c = s.toCharArray();
		int n =c.length;
		int i=0;
		char temp;
		int count=0;
		StringBuilder sb= new StringBuilder();
		
		while(i<n)
		{
			temp=c[i];
			
			while(i<n && c[i]==temp)
			{
				count++;
				i++;
			}
			
			sb.append(temp);
			sb.append(count);
			count=0;
		}
		if(sb.length()<c.length)
			return sb.toString();
		else
			return s;
	}
