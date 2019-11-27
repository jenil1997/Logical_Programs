import java.util.Scanner;

public class Max_element_array {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int ar[]=new int[5];
		int m=0;
		for(int i=0;i<5;i++)
		{
			ar[i]=s.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			if(m<ar[i])
			{
				m=ar[i];
			}
		}
		System.out.println(m);

	}

}
