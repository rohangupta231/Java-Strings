class ReverseWordInSentence
{
	public static void main(String dt[])
	{
		String str="Hello World";
		int i=0,j=0,space=0;
		for(i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==' ')
			{
				space++;
			}
		}
		String arr[]=new String[space+1];
		String cstr="";
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				arr[j]=cstr;
				cstr="";
				j++;
			}
			else
			{
				cstr=cstr+str.charAt(i);
			}
			arr[j]=cstr;
		}
		System.out.println(str);
		for(i=0;i<arr.length;i++)
		{
			for(j=arr[i].length()-1;j>=0;j--)
			{
				System.out.print(arr[i].charAt(j));
			}
			System.out.print(" ");
		}
	}
}