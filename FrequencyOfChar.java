class FrequencyOfChar
{
	public static void main(String dt[])
	{
		String str="Hello World";
		char ch;
		char a='A',k='A';
		int count1=0,j=0;
		for(char i='A'; i<='z'; i++)
        {
            count1 = 0;
			for(j=0; j<str.length(); j++)
            {
                ch=str.charAt(j);
                if(ch==i)
				{	
                    count1++;
                }
			}	
			if(count1!=0)
            {
                System.out.println(i+"\t\t"+count1);
			}	
        }
		/*for(k='A'; i<='z'; k++)
        {
            count1 = 0;
			for(j=0; j<str.length(); j++)
            {
                ch=str.charAt(j);
                if(ch==i)
				{	
                    count2++;
                }
			}	
			if(count!=0)
            {
                System.out.println(i+"\t\t"+count2);
			}	
        }*/
	}
}