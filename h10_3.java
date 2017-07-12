package hunter;

import java.util.Scanner;

public class h10_3 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		int ld=n%10;
		int r;
		int p;
		if(n>9)
		{
		while(n!=0)
		{
			p=1;
			r=n%10;
			for(int i=1;i<=ld;i++)
			{
				p=p*r;
			}
			sum=sum+p;
			n=n/10;
		}
		}
		System.out.println(sum);
		s.close();

	}

}
