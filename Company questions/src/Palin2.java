

import java.util.Scanner;

public class Palin2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.next();
		String b = a;
		String rev="";
		int len=a.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
		}
		if (rev.equals(b)) {
			System.out.println("palin");
		} else {
			System.out.println("not palin");
		}
	}

}
