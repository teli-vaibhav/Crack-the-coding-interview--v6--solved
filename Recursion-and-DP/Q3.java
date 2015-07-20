	/*
	 * When the given numbers are distinct.
	 * It is a variation of Binary Search with
	 * O(log n) time complexity & O(1) space complexity.
	 */
	public static int getMagicIndex(int[] a)
	{
		if(a==null || a.length==0)
			return -1;
		
		int l=0;
		int r=a.length-1;
		int m=0;
		
		while(l<=r)
		{
			m=(r-l)/2+l;
			
			if(a[m]==m)
				return m;
			
			if(a[m]<m)
			    l=m+1;
			else
				r=m-1;
		}
		return -1;
	}
	
	/*
	 * When the given numbers are non distinct
	 * the time complexity is O(n) but definitely better than
	 * O(n) on an average. The space complexity is O(n).
	 */
	public static int getMagicIndexWithDuplicates(int[] a)
	{
		if(a==null ||a.length==0)
			return -1;
		
		int[] res = new int[1];
		
		if(getMagicIndexWithDuplicatesAux(a,0,a.length-1,res))
			return res[0];
		return -1;
	}

	private static boolean getMagicIndexWithDuplicatesAux(int[] a, int l, int r,
			int[] res) {
		
		int m = (r-l)/2+l;
		
		if(l<0 || r>a.length-1 || l>r)
			return false;
		
		if(a[m]==m)
		{
			res[0]=m;
			return true;
		}
		
		if(a[m]<m)
			{
			  return getMagicIndexWithDuplicatesAux(a,l,a[m],res) ||
			         getMagicIndexWithDuplicatesAux(a,m+1,r,res);
			}
			
		else
		{
			return getMagicIndexWithDuplicatesAux(a,l,m-1,res) || 
					getMagicIndexWithDuplicatesAux(a,a[m],r,res);
		}
			
	}
