

import java.util.Scanner;

public class Fibno2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no to check");
		int n=s.nextInt();
		int q=s.nextInt();
		int a=0;
		int b=1;
		int c=0;
		int flag=0;
		if(q==a||q==b)
		{
			System.out.println("it is in");
		}
			for(int i=1;i<=n;i++)
			{
				c=a+b;
				if(q==c)
				{
					flag=1;
					break;
				}
				else
				{
					flag=0;
				}
				a=b;
				b=c;
			}
			if(flag==1)
			{
				System.out.println("it is in");
			}
			else
			{
				System.out.println("it is not in");
			}

	}

}
