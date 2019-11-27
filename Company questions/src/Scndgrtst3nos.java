import java.util.Scanner;

public class Scndgrtst3nos {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int n1=s.nextInt();
		int n2=s.nextInt();
		if(n<n1&&n>n2||n<n2&&n>n1)
		{
			System.out.println(n);
		}
		else if(n2>n1&&n<n1||n>n1&&n2<n1)
			
		{
			System.out.println(n1);	
		}
		else
		{
			System.out.println(n2);
		}

	}

}
