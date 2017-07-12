package hunter;

import java.util.Scanner;

public class h10_2 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int l=s.nextInt();
		int sum=0;
		int msum=0;
		int r;
		int n;
		while(l>9)
		{
			n=l;
			sum=0;
			while(n!=0)
		   {
			r=n%10;
			sum=sum+r;
			n=n/10;
		    }
			msum=msum+sum;
			l=l/10;
			
		}
		System.out.println(msum);
		s.close();
		

	}

}
