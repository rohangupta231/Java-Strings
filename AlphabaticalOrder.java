class AlphabaticalOrder 
{
	public static void main(String dt[])
	{
		String str= "hello";
		int i,j,len=str.length();
		char c[]=new char[len],swap;
		for(i=0;i<c.length;i++)
		{
			c[i]=str.charAt(i);	
		}
		/*		for(i=0;i<c.length;i++)
		{
			System.out.print(c[i]);
		}*/
		for(i=0;i<c.length;i++)
		{
			for(j=0;j<(c.length-i-1);j++)
			{
				if(c[j]>c[j+1])
				{
					swap=c[j];
					c[j]=c[j+1];
					c[j+1]=swap;
				}
			}
		}
		for(i=0;i<c.length;i++)
		{
			System.out.print(c[i]);
		}
	}
}