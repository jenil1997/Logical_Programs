import java.util.Scanner;

public class Fibnocci {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=0,b=1;
		int c;
		System.out.printf("%d %d ",a,b);
		for(int i=2;i<n;i++)
		{
			c=a+b;
			System.out.printf("%d ",c);
			a=b;
			b=c;
		}

	}

}
