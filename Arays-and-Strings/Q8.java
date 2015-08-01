	/*
	 * Time complexity is O(m*n)
	 * Space complexity is O(m+n) bits
	 */
	public static void mark0s(int[][] a)
	{
		if(a==null || a.length<=0 || a[0].length<=0)
			return;
		int m = a.length;
		int n = a[0].length;
		
		BitSet bsRows = new BitSet(m);
		BitSet bsColumns = new BitSet(n);
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i][j]==0)
				{
					if(!bsRows.get(i))
						bsRows.set(i);
					if(!bsColumns.get(j))
						bsColumns.set(j);
				}
			}
		}
		
		for(int i=0;i<m;i++)
		{
			if(bsRows.get(i))
				setRow0(a,i);
		}
		
		for(int j=0;j<n;j++)
		{
			if(bsColumns.get(j))
				setColumn0(a,j);
		}
		
	}

	private static void setColumn0(int[][] a, int j) {
		for(int k=0;k<a.length;k++)
			   a[k][j]=0;
	}
