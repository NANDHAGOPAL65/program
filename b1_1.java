package beginner;

import java.util.Scanner;

public class b1_1 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n==0)
		{
			System.out.println("Zero");
		}
		else if(n>0)
		{
			System.out.println("Positive");
		}
		else
		{
			System.out.println("Negative");
		}
		s.close();

	}

}
