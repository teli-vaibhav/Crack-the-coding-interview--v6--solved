	/*
	 * Time complexity is O(m+n)
	 * Space complexity is O(1)
	 */
	public static Node getMeetingNode(Node head1, Node head2)
	{
		if(head1==null || head2==null)
			return null;
		
		Node current1=head1;
		Node current2=head2;
		
		while(current1!=null && current2!=null)
		{
			current1=current1.next;
			current2=current2.next;
		}
		
		Node shorterNode = null;
		Node longerNode = null;
		
		if(current1!=null)
		{
			longerNode=head1;
			shorterNode = head2;
		}
		
		else
		{
			longerNode=head2;
			shorterNode=head1;
		}
		
		while(current1!=null)
		{
			longerNode=longerNode.next;
			current1=current1.next;
		}
		
		while(current2!=null)
		{
			longerNode=longerNode.next;
			current2=current2.next;
		}
		
		while(longerNode!=null && shorterNode!=null)
		{
			if(longerNode==shorterNode)
				return shorterNode;
			
			shorterNode=shorterNode.next;
			longerNode=longerNode.next;
		}
		return null;
	}
