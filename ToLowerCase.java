import java.lang.String;
class ToLowerCase
{
	public static void main(String dt[])
	{
		String str="HELLO";
		int str1[]=new int[5] ;
		int i;
		for(i=0;i<str.length();i++)
		{
			str1[i]=(int)(str.charAt(i))+32;
		}
		for(i=0;i<5;i++)
		{	
			System.out.println((char)str1[i]);
		}	
	}
}