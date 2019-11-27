import java.util.Scanner;

public class Search_no_array {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r = s.nextInt();
		int c = 0;
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (a[i] == r) {
				c++;
			}
		}
		if (c == 1) {
			System.out.println("yes");

		} else {
			System.out.println("no");
		}
	}

}
