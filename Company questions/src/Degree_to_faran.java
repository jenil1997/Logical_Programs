import java.util.Scanner;

public class Degree_to_faran {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		float degree=s.nextFloat();
		float faran=(degree*9/5)+32;
		System.out.println(faran);

	}

}
