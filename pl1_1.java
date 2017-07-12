package player;

import java.util.Scanner;

public class pl1_1 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		System.out.println(sb.toString());
		s.close();

	}

}
