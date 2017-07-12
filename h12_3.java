package hunter;

import java.util.Scanner;

public class h12_3 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String str1="";
		for(int i=0;i<str.length();i++)
		{
			int  count=0;
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					if(i!=j)
					count++;
				}
			}
			if(count==0)
			{
				str1+=str.charAt(i);
			}
			
		}
		System.out.println(str1);

	}

}
