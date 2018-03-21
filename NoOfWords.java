class NoOfWords
{
	public static void main(String dt[])
	{
		String str="Hello World Whatsup?";
		int i=0,count=0;
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println(count+1);
	}
}