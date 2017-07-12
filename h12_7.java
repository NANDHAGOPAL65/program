package hunter;

import java.util.Scanner;

public class h12_7 
{

	public static void main(String[] args) 
	{
		int f=0;
		int sum=0;
		Scanner s=new Scanner(System.in);
		int l=s.nextInt();
        for(int n=2;n<=l;n++) 
        {
           f=0;
          for(int i=2;i<n/2;i++) 
          {
           if(n%i==0)
           {
               f=1;
               break;
           }
          }
        if(f==0&&n%10==3) 
        {
        sum=sum+n;
        }
      }
        System.out.println(sum);
        s.close();

	}

}
