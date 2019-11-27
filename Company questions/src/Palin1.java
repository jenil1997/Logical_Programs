

import java.util.Scanner;

public class Palin1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = a;
		int r, d = 0;
		while (a != 0) {
			r = a % 10;
			d = r + (d * 10);
			a = a / 10;
		}
		if (d == b) {
			System.out.println("palin");
		} else {
			System.out.println("not palin");
		}

	}

}
