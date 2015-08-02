	/*
	 * Time complexity is O(n)
	 * space complexity is O(n)
	 * This problem looks simple, but is a pain.
	 */
	public static Node partitionList(Node head,int x)
	{
		if(head==null)
			return null;
		
		Node beforeStart =null;
		Node beforeEnd = null;
		Node partStart =null;
		Node partEnd = null;
		Node afterStart = null;
		Node afterEnd = null;
		boolean isBefore = false;
		boolean isAfter = false;
		boolean isPart = false;
		
		Node resStart = null;
		Node resEnd = null;
		
		Node current= head;
		
		while(current!=null)
		{
			if(current.element==x)
			{
				if(!isPart)
				{
					isPart=true;
					partStart=current;
					partEnd=partStart;
				}
				else
				{
					partEnd.next=current;
					partEnd.next=partEnd;
				}
			}
			
			else if(current.element<x)
			{
				if(!isBefore)
				{
					isBefore=true;
					beforeStart=current;
					beforeEnd = beforeStart;
				}
				else
				{
					beforeEnd.next=current;
					beforeEnd=beforeEnd.next;
				}
			}
			
			else
			{
				if(!isAfter)
				{
					isAfter=true;
					afterStart = current;
					afterEnd = afterStart;
				}
				
				else
				{
					afterEnd.next=current;
					afterEnd=afterEnd.next;
				}
			}
			current=current.next;
		}
		
		if(isBefore)
		{
			resStart = beforeStart;
			resEnd= beforeEnd;
		}
		
		if(isPart)
		{
			if(resStart==null)
			{
				resStart=partStart;
				resEnd = partEnd;
			}
			else
			{
				resEnd.next=partStart;
				resEnd = partEnd;
			}
		}
		
		if(isAfter)
		{
			if(resStart==null)
			{
				resStart = afterStart;
				resEnd = afterEnd;
			}
			else
			{
				resEnd.next=afterStart;
				resEnd = afterEnd;
			}
		}
		resEnd.next=null;
		return resStart;
	}
