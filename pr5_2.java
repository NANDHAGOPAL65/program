package pro;

import java.util.Scanner;

public class pr5_2 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int[] x=new int[4];
		int[] y=new int[4];
		for(int i=0;i<4;i++)
		{
			System.out.println("x"+(i+1)+" : ");
			x[i]=s.nextInt();
			System.out.println("y"+(i+1)+" : ");
			y[i]=s.nextInt();
		}
		int cx=0;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(x[i]==x[j]&&i!=j)
				{
					cx++;
				}
			}
		}
		int cy=0;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(y[i]==y[j]&&i!=j)
				{
					cy++;
				}
			}
		}
		if(cx==4&&cy==4)
		{
			System.out.println("Square");
		}
		else
		{
			System.out.println("Not Square");
		}
		s.close();
		
		
		

	}

}
