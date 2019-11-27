

import java.util.Scanner;

public class prime2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int f=0;
		for (int i = a; i <= b; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					f=1;
					break;
				}
				else {
					f=0;
				}
			}
			if (f == 0) {
				System.out.println(i);
			}
		}

	}

}
