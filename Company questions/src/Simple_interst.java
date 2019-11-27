import java.util.Scanner;

public class Simple_interst {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int amount=s.nextInt();
		int year=s.nextInt();
		float rate=s.nextFloat();
		float intrst=(amount*year*rate)/100;
		System.out.println(intrst);

	}

}
