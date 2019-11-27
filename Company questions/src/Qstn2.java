import java.util.Scanner;

public class Qstn2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int w = 0;
		int r;
		int t = n;
		while (n != 0) {
			int q = 1;
			r = n % 10;
			for (int i = 1; i <= r; i++) {
				q = q * i;
			}
			w = w + q;
			n = n / 10;
		}
		if (t == w) {
			System.out.println("strong");
		} else {
			System.out.println("not");
		}

	}

}
