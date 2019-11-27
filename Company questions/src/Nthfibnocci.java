import java.util.Scanner;

public class Nthfibnocci {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=0,b=1;
		int c=0;
		for(int i=2;i<n;i++)
		{
		c=a+b;
		a=b;b=c;
		}
		System.out.println(c);
	}

}
