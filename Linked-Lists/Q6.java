	/*
	 * Time complexity is O(n)
	 * Space complexity is O(n)
	 */
	public static boolean isPalindrome(Node head)
	{
		if(head==null || head.next==null)
			return true;
		
		Node[] res = new Node[]{head};
		boolean[] ans = new boolean[]{true};
		isPalindromeAux(head,res,ans);
		return ans[0];
	}

	private static void isPalindromeAux(Node head, Node[] res,boolean[] ans) {
		
		if(head==null)
			return;
		
		isPalindromeAux(head.next,res,ans);
		
		if((head.element==res[0].element))
		{
			ans[0]=true && ans[0];
		}
		else
			ans[0]=false;
		
		res[0]=res[0].next;
	}
