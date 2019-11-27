import java.util.Scanner;

public class Pwrno {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=1;
		while(b!=0)
		{
		c=c*a;
		b--;
		}
		System.out.println(c);
			
		

	}

}
