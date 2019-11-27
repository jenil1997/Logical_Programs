import java.util.Scanner;

public class Decimel_to_octal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int rem;

		   // For storing result
		   String str="";

		   // Digits in Octal number system
		   char dig[]={'0','1','2','3','4','5','6','7'};

		   while(num>0)
		   {
		      rem=num%8;
		      str=dig[rem]+str;
		      num=num/8;
		   }
		   System.out.println("Decimal to octal: "+str);
		}

		}
