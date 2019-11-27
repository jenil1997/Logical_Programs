import java.util.Scanner;

public class Sumofdgtstosngle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r,t, d = 0,su=0;
		while (n != 0) {
			r = n % 10;
			d = d + r;
			n = n / 10;
		}
		if (d > 9) {
			while (d != 0) {
				t = d % 10;
				su = su + t;
				d = d / 10;
			}
			System.out.println(su);
		} else {
			System.out.println(d);
		}
	}

}
