

import java.util.Scanner;

public class Fibno {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=0;
		int b=1;
		int c=0;
		System.out.printf("%d %d ",a,b);
		for(int i=0;i<n;i++)
		{
		c=a+b;
		System.out.printf("%d ",c);
		a=b;
		b=c;
		}

	}

}
