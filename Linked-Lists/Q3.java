	/*
	 * Time complexity is O(1)
	 * Space complexity is O(1)
	 */
	public static void deleteMiddleNode(Node middleNode)
	{
		if(middleNode==null)
			return;
		
		if(middleNode.next==null)
		{
			middleNode.element=Integer.MIN_VALUE;
			return;
		}
		
		middleNode.element=middleNode.next.element;
		middleNode.next = middleNode.next.next;
		
	}
