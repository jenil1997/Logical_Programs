import java.util.Scanner;

public class Word_length {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String st=s.next();
		char ch[]=st.toCharArray();
		int i=0;
		for(char c:ch)
		{
			i++;
		}
		System.out.println(i);

	}

}
