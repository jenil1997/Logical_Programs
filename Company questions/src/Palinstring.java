import java.util.Scanner;

public class Palinstring {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String n = s.next();
		String q=n;
		int l=n.length();
		String rev="";
		for(int i=l-1;i>=0;i--)
		{
			rev=rev+n.charAt(i);
		}
		if(rev.equals(q))
		{
			System.out.println("palin");
		}
		else
		{
			System.out.println("not");
		}

	}

}
