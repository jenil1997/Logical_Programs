import java.util.Scanner;

public class Revrseno {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r,d=0;
		while(n!=0)
		{
			r=n%10;
			d=r+(d*10);
			n=n/10;
			
		}
		System.out.println(d);

	}

}
