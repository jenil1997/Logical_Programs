import java.util.Scanner;

public class Qstn1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int f = 0;
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				f++;
			}
		}
		if (f == 1) {
			System.out.println("prime");
		} else {
			System.out.println("not");
		}
	}

}
