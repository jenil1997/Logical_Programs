

import java.util.Scanner;

public class Armstrng {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a = n;
		int r = 0, su = 0;
		while (n != 0) {
			r = n % 10;
			su = su + (r * r * r);
			n = n / 10;
		}
		if (su == a) {
			System.out.println("armstrng");
		} else {
			System.out.println("not armstrng");
		}
	}

}
