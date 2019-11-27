import java.util.Scanner;

public class Palin {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r,d=0;
		int q=n;
		while(n!=0)
		{
			r=n%10;
			d=r+(d*10);
			n=n/10;
		}
		if(q==d)
		{
			System.out.println("palin");
		}
		else
		{
			System.out.println("not");
		}

	}

}
