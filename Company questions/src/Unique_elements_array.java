import java.util.Scanner;

public class Unique_elements_array {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int j=0;
			for(j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
					break;
				}
				
			}
			if(i==j)
			{
				System.out.println(a[i]);
			}
		}

	}

}
