	public static String[] getAllSubsets(char[] a)
	{
		if(a==null || a.length==0)
			return null;
		
		int[] res = new int[a.length];
		String[] resSubsets= new String[(int) Math.pow(2, a.length)];
		getAllSubsetsAux(a,a.length,res,0,resSubsets,new int[]{0});
		return resSubsets;
	}

	private static void getAllSubsetsAux(char[] a, int n, int[] res,
			int d, String[] resSubsets,int[] subsetIndex) {
		if(d==n)
		{
			addResToStringArray(a,res,resSubsets,subsetIndex);
			subsetIndex[0]++;
			return;
		}
		
		for(int i=0;i<=1;i++)
		{
			res[d]=i;
			getAllSubsetsAux(a,n,res,d+1,resSubsets,subsetIndex);
		}
			
	}

	private static void addResToStringArray(char[] a, int[] res,String[] resSubsets, int[] index) {
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<res.length;i++)
		{
			if(res[i]==1)
			{
				sb.append(a[i]);
			}
		}
		resSubsets[index[0]]=sb.toString();
	}
