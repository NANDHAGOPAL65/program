package pro;

import java.util.Scanner;

public class pr6_0 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int st=3;
		int en=3;
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=st;
			if(st==1)
			{
				st--;
				en=en*2;
				st=en;
			}
			else
			{
				st--;
			}
		}
		System.out.println(a[n-1]);
		s.close();

	}

}
