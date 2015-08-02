	/*
	 * Time complexity is O(n)
	 * Space complexity is O(n)
	 */
	public static void removeDuplicatesWithBuffer(Node head)
	{
		if(head==null)
			return;
		Node prev = head;
		Node current = prev.next;
		HashSet<Integer> h = new HashSet<Integer>();
		h.add(prev.element);
		
		while(current!=null)
		{
			if(!h.add(current.element))
			{
				prev.next=current.next;
				current=prev.next;
			}
			else
			{
				prev=current;
				current=current.next;
			}
		}
	}
	
	/*
	 * Time complexity is O(n^2)
	 * Space complexity is O(1)
	 */
	public static void removeDuplicatesNoBuffer(Node head)
	{
		if(head==null)
			return;
		Node current=head;
		Node innerCurrent = current.next;
		Node prev=current;
		
		while(current!=null)
		{

			innerCurrent=current.next;
			prev=current;
			
			while(innerCurrent!=null)
			{
				if(current.element==innerCurrent.element)
				{
					prev.next=innerCurrent.next;
					innerCurrent=prev.next;
				}
				else
				{
					prev=innerCurrent;
					innerCurrent=innerCurrent.next;
				}	
			}
			current=current.next;
		}
	}
