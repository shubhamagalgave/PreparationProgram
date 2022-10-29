

public class DuplicatesInString {

	public static void main(String[] args) {
		String str="happy birthday";
		char[] carray =str.toCharArray();
	
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(carray[i]==carray[j])
				{
					System.out.print(carray[j]+"  ");
				}
			}
		}
		
		 

	}
}

        /*********
		 * 2 way
		 * 	String s="";
		Scanner a= new Scanner(System.in);
		s=a.next();
		char c[]=s.toCharArray();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(c[i]==c[j])
				{
					System.out.print(c[i]+" ");
					count++;
				}
			}
			
		}
		System.out.println(count);
	*/
