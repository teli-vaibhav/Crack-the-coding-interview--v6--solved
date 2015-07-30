	/*
	 * Time complexity is O(n) and O(1) space complexity
	 */
	public static boolean isStringEditable(String s1,String s2)
	{
		if(s1==null || s2==null)
			return false;
		
		int m = s1.length();
		int n = s2.length();
		
		if(Math.abs(m-n)>1)
			return false;
		
		char res = 'R';
		
		if(m<n)
			res='A';
		else if(m>n)
			res='D';
		
		boolean isEdited = false;
		
		switch(res)
		{
		  case 'R':
			  for(int i=0;i<m;i++)
			  {
				  if(s1.charAt(i)!=s2.charAt(i) && isEdited)
					  return false;
				  if(s1.charAt(i)!=s2.charAt(i))
					  isEdited=true;
			  }
			  return true;
		  case 'A':
			  for(int i=0,j=0;j<n;)
			  {
				  if(s1.charAt(i)!=s2.charAt(j) && isEdited)
					  return false;
				  
				  if(s1.charAt(i)!=s2.charAt(j))
				  {
					  isEdited=true;
					  j++;
				  }
				  else
				  {
					  i++;
					  j++;
			       }	  
			    }
			  return true;
			  
		  case 'D':
			  for(int i=0,j=0;j<n;)
			  {
				  if(s1.charAt(i)!=s2.charAt(j) && isEdited)
					  return false;
				  
				  if(s1.charAt(i)!=s2.charAt(j))
				  {
					  isEdited=true;
					  i++;
				  }
				  else
				  {
					  i++;
					  j++;
			       }	  
			    }
			  return true;	  
		}
		return false;
	}
