package hunter;

import java.util.Scanner;

public class h5_6 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int min=999999999;
		int st=0;
		int en=0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if((Math.abs(a[i]+a[j]))<min)
				{
					min=Math.abs(a[i]+a[j]);
					st=i;
					en=j;
				}
			}
		}
		System.out.println(a[st]+" "+a[en]);
		s.close();

	}

}
