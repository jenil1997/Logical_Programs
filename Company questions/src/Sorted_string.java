import java.util.Scanner;

public class Sorted_string {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str= s.next();
		char c[] =str.toCharArray();
		//Arrays.sort(c);
		int i,j;
		char temp;
		for(i=0;i<c.length;i++)
		{
		for(j=0;j<c.length;j++)
		{
		if(c[j]>c[i])
		{
		temp=c[i];
		c[i]=c[j];
		c[j]=temp;
		}
		}
		}
		for(int k=0;k<c.length;k++)
		{
		System.out.print(c[k]);
		}


	}

}
