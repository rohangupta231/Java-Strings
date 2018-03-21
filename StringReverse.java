import java.lang.String;
class StringReverse
{
	public static void main(String dt[])
	{
		String str="Hello";
		String str1="";
		int i=0,length=0;
		for(i=str.length()-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
		}
		System.out.println(str1);
		
	}
}