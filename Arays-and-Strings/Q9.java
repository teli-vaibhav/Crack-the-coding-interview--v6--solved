	/*
	 * Time complexity is O(m+n)
	 * Space complexity is O(m+n)
	 */
	public static boolean isRotatedString(String s1,String s2)
	{
		if(s1==null && s2==null)
			return true;
		int m =s1.length();
		int n =s2.length();
		
		if(m!=n)
			return false;
		
		if(m<0 || n<0)
			return false;
		
		if(m==0&&n==0)
			return true;
		
		if(isSubstring(s2,s1+s2))
			return true;
		return false;
	}

	private static boolean isSubstring(String s2, String string) {
		if(string.contains(s2))
			return true;
		return false;
	}
