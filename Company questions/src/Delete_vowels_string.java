import java.util.Scanner;

public class Delete_vowels_string {

	public static void main(String[] args)  {
	       Scanner s=new Scanner(System.in);
	       String st=s.nextLine();
	       char c=0;
	       int l=st.length();
	       int i=0;
	       for(i=0;i<l;i++)
	       {
	         c=st.charAt(i);
	         if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
	         continue;
	         }
	         System.out.print(c);
		}

	}

}
