	/*
	 * Time complexity is O(n)
	 * Space complexity is O(1)
	 */
	public static Node getKthFromEnd(Node head,int k)
	{
		if(head==null || k<=0)
			return null;
		
		Node current=head;
		
		while(current!=null && k>0)
		{
			current=current.next;
			k--;
		}
		
		if(current==null && k>0)
			return null;
		
		if(current==null && k==0)
			return head;
		
		Node res=head;
		
		while(current!=null)
		{
			current=current.next;
			res=res.next;
		}
		return res;
	}
