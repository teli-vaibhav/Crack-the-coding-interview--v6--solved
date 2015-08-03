	/*
	 * Time complexity is O(m+n)
	 * Space complexity is O(m+n)
	 */
	public static Node sumLLReverse(Node head1,Node head2)
	{
		if(head1==null)
			return head2;
		if(head2==null)
			return head1;
		
		Node current1= head1;
		Node current2 = head2;
		Node resHead=null;
		Node resCurrent = resHead;
		
		int res = 0;
		int carry=0;
		
		while(current1!=null && current2!=null)
		{
			res=current1.element+current2.element+carry;
			carry= (res/10)%10;
			res=res%10;
			
			if(resHead==null)
			{
				resHead=new Node(res);
				resCurrent=resHead;
			}
			else
			{
				resCurrent.next=new Node(res);
				resCurrent=resCurrent.next;
			}
			
			current1=current1.next;
			current2=current2.next;
		}
			
		while(current1!=null)
		{
			res=current1.element+carry;
			carry= (res/10)%10;
			res=res%10;
			
			resCurrent.next=new Node(res);
			resCurrent=resCurrent.next;
			current1=current1.next;
		}
		
		while(current2!=null)
		{
			res=current2.element+carry;
			carry= (res/10)%10;
			res=res%10;
			
			resCurrent.next=new Node(res);
			resCurrent=resCurrent.next;
			current2=current2.next;
		}
		
		if(current1==null && current2==null && carry>0)
		{
			resCurrent.next=new Node(carry);
			resCurrent=resCurrent.next;
		}
		
		return resHead;
	}
	
	/*
	 * Time complexity is O(m+n)
	 * space complexity is O(n), n>m
	 */
	public static Node getSumRecursive(Node head1, Node head2)
	{
		if(head1==null)
			return head2;
		if(head2==null)
			return head1;
		
		Node current1= head1;
		Node current2 = head2;
		
		while(current1.next!=null && current2.next!=null)
		{
			current1=current1.next;
			current2=current2.next;
		}
		
		Node temp2Head=null;
		Node temp2Current=temp2Head;
		
		while(current1.next!=null)
		{
			if(temp2Head==null)
			{
				temp2Head=new Node(0);
				temp2Current=temp2Head;
			}
			else
				temp2Current.next=new Node(0);
			
			current1 = current1.next;
		}
		
		if(temp2Current!=null)
		{
			temp2Current.next=head2;
			head2=temp2Current;
		}
		
		Node temp1Head=null;
		Node temp1Current=temp1Head;
		
		while(current2.next!=null)
		{
			if(temp1Head==null)
			{
				temp1Head=new Node(0);
				temp1Current=temp1Head;
			}
			else
				temp1Current.next=new Node(0);
			
			current2 = current2.next;
		}
		
		if(temp1Current!=null)
		{
			temp1Current.next=head1;
			head1=temp1Current;
		}
		
		int[] carry = new int[]{0};
		Node p=getSumRecursiveAux(head1,head2,carry);
		if(carry[0]!=0)
		{
			Node temp = p;
			p=new Node(1);
			p.next=temp;
		}
		return p;
		
	}

	private static Node getSumRecursiveAux(Node head1, Node head2,int[] carry) {
		
		if(head1==null && head2==null)
			return null;
		
		Node p=new Node();
		p.next= getSumRecursiveAux(head1.next,head2.next,carry);
		int resElement = head1.element + head2.element+carry[0];
		p.element=resElement%10;
		carry[0]=(resElement/10)%10;
		return p;
	}
