import java.util.Scanner;

public class Reverse_ordr_fibnocci {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ar[]=new int[n];
		ar[0]=0;
		ar[1]=1;
		for(int i=2;i<n;i++)
		{
			ar[i]=ar[i-2]+ar[i-1];
		}
		for(int i=n-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}

	}

}
