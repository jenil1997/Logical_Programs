import java.util.Scanner;

public class Qstn3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int f = 0;
		int p = 0;
		for (int j = 2; j <= n; j++) {
			for (int i = 2; i <= j; i++) {
				if (j % i == 0) {
					f++;
				}

			}
			if (f == 1) {
				p = p + j;
			}

		}
		System.out.println(p);
	}

}
