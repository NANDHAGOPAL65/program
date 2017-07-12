package hunter;

import java.util.Scanner;

public class h13_2 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int l=s.nextInt();
		for(int i=1;i<=l;i++)
		{
			for(int j=l-i;j>=0;j--)
			{
				System.out.print("*");
			}
			System.out.print(" ");
			for(int j=l-i;j>=0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		s.close();

	}

}
