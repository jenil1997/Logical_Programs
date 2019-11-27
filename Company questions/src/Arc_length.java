import java.util.Scanner;

public class Arc_length {

	public static void min(String[] args) {
		Scanner s=new Scanner(System.in);
		float r=s.nextFloat();
		float degree=s.nextFloat();
		double arc=(2*3.14*r)*degree/360;
		System.out.printf("%.2f",arc);

	}

}
