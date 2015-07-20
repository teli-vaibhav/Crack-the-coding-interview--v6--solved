/*
	 * We are asked to solve a maze here and return the path.
	 * This solution returns a result array with the path, 'r' stands for right
	 * and 'd' stands for down.
	 * the first cell will be a dummy value which is 'k'.
	 * The solution has time complexity of O(m*n) and space complexity of O(m+n).
	 */
	public static char[] getMazePath(int[][] a)
	{
		if(a==null || a.length==0 || a[0].length==0)
			return null;
		
		int m= a.length;
		int n= a[0].length;
		if(a[0][0]!=1 || a[m-1][n-1]!=1)
			return null;
		char[] res=new char[m+n+1];
		
		if(getMazePathAux(a,m,n,res,0,0,0,'k'))
		   return res;
		return null;
	}
	
	
	private static boolean getMazePathAux(int[][] a, int m, int n, char[] res,
			int d,int i, int j, char direction) {
		if(d==m+n-1)
			return true;
		
		if(i>=m || j>=n)
			return false;
		
		if(a[i][j]!=1)
			return false;
		
		res[d]=direction;
		
		if(getMazePathAux(a,m,n,res,d+1,i+1,j,'d'))
			return true;
		
		if(getMazePathAux(a,m,n,res,d+1,i,j+1,'r'))
		    return true;
		
		return false;
			
	}
