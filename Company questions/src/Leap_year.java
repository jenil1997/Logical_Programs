import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int ye=s.nextInt();
		if(ye%4==0)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println(" not leap year");
		}
	}

}
