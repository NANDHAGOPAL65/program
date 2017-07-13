package pro;

import java.util.Scanner;

public class pr5_3 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int count=0;
		for(int i=1;i<=26;i++)
		{
			for(int j=0;j<str.length();j++)
			{
				if((char)i+64==str.charAt(j)||(char)i+96==str.charAt(j))
				{
					count++;
					break;
				}
			}
		}
		
		if(count==26)
		{
			System.out.println("Pangram");
		}
		else
		{
			System.out.println("Not Pangram");
		}
		s.close();

	}

}
