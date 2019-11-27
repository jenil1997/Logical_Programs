import java.util.Scanner;

public class Hypotns_rightangle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int ba=s.nextInt();
		int al=s.nextInt();
		int c=(ba*ba)+(al*al);
		double hy=Math.sqrt(c);
		System.out.println(hy);

	}

}
