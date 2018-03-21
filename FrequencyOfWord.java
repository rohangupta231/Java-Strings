class FrequencyOfWord
{
	public static void main(String dt[])
	{
		String str="Hello World Hello";
		int i=0,j=0,space=0,count=0;
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
		//System.out.println(str);
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		for(i=0;i<arr.length;i++)
		{
			count=0;
			int flag=0;
			for(j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
				if((arr[i]==arr[j])&&(i>j))
				{
					flag=1;
				}
			}
			if((count!=0)&&(flag==0))
			{
				System.out.println(arr[i]+"\t\t"+count);
			}
		}
	}
}