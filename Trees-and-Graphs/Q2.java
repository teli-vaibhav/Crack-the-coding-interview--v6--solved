	/*
	 * This problem is more tricky than it looks.
	 * Time complexity will be O(n)
	 * space complexity is O(n)
	 */
	public static TreeNode getMinHeightBSTFromSortedArray(int[] a)
	{
		if(a==null || a.length==0)
			return null;
		return formBST(a,0,a.length-1);	
	}

	private static TreeNode formBST(int[] a, int i, int j) {
		if(i>j)
			return null;
		int mid = (j-i)/2+i;
		TreeNode tn = new TreeNode(a[mid]);
		tn.left = formBST(a,i,mid-1);
		tn.right = formBST(a,mid+1,j);
		return tn;
	}
