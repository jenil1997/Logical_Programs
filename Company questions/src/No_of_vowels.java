import java.util.Scanner;

public class No_of_vowels {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String st=s.next();
		int l=st.length();
		char c=0;
		int j=0;
		for(int i=0;i<l;i++)
		{
			c=st.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') 
			{
				j++;
			}
		}
		System.out.println(j);

	}

}
