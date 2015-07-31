	/*
	 * Time complexity is O(n^2)
	 * Space complexity is O(n)
	 */
	public static void rotateArray(int[][] a)
	{
		if(a==null || a.length<=0 || a[0].length<=0)
			return;
		int startIIndex = 0;
		int startJIndex = 0;
		int endIIndex = a.length-1;
		int endJIndex = a[0].length-1;
		
		rotateArrayAux(a,startIIndex,startJIndex,endIIndex,endJIndex);
	}

	private static void rotateArrayAux(int[][] a, int startIIndex,
			int startJIndex, int endIIndex, int endJIndex) {
		
		if(!isValidIndex(a,startIIndex,startJIndex,endIIndex,endJIndex))
			return;
		
		int iStart = startIIndex;
		int jStart = startJIndex;
		int iEnd = endIIndex;
		int jEnd = endJIndex;
		
		int[] temp=new int[endJIndex-startJIndex+1];
		int k=0;
		
		for(int j=startJIndex;j<=endJIndex;j++)
		{
			temp[k++]= a[startIIndex][j];		
		}
		
		k=0;
		
		for(int i=endIIndex;i>=startIIndex;i--)
		{
			a[startIIndex][jStart++]=a[i][startJIndex];
		}
		jStart = startJIndex;
		
		for(int j=startJIndex;j<=endJIndex;j++)
		{
			a[iStart++][startJIndex]=a[endIIndex][j];
		}
		iStart = startIIndex;
		
		for(int i=endIIndex;i>=startIIndex;i--)
		{
			a[endIIndex][jStart++]=a[i][endJIndex];
		}
		
		jStart = startJIndex;
		
		for(int i=startIIndex;i<=endIIndex;i++)
		{
			a[i][endJIndex]=temp[k++];
		}
		
		rotateArrayAux(a,startIIndex+1,startJIndex+1,endIIndex-1,endJIndex-1);
	}

	private static boolean isValidIndex(int[][] a, int startIIndex,
			int startJIndex, int endIIndex, int endJIndex) {
		if(startIIndex>=endIIndex)
			return false;
		return true;
	}
