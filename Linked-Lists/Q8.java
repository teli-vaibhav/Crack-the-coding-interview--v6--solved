	/*
	 * Time complexity is O(n)
	 * Space complexity is O(1)
	 */
	public static Node getLoopStart(Node head)
	{
		if(head==null || head.next==head)
			return head;
		
		Node slow = head;
		Node fast= head;
		
		do
		{
			slow=slow.next;
			fast=fast.next.next;		
		} while(fast!=null && fast.next!=null && fast!=slow);
		
		if(fast!=slow)
			return null;
		
		slow = head;
		while(fast!=slow)
		{
			slow=slow.next;
			fast=fast.next;
		}
		
		return slow;
	}
