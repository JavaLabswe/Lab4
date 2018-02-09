import java.util.Scanner;
public class PassOrFailWithMethod {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double mean,sum=0;
		System.out.print("Enter score1 (1-100) : ");
		int n1 = in.nextInt();
		System.out.print("Enter score2 (1-100) : ");
		int n2 = in.nextInt();
		System.out.print("Enter score3 (1-100) : ");
		int n3 = in.nextInt();
		boolean a = isPass(n1, n2, n3);
		
		if(a) {
			sum =n1+n2+n3;
			mean=sum/3;
			if(mean>=86) {
				System.out.println("Mean = "+mean);
				System.out.println("Grade A");
			}
			else if(mean>=66) {
				System.out.println("Mean = "+mean);
				System.out.println("Grade B");		
			}
			else {
				System.out.println("Mean = "+mean);
				System.out.println("Grade C");
			}
		}
		else {
			System.out.println("Fail");
		}
	}
	public static boolean isPass(int n1,int n2,int n3) {
		if(n1 >= 50 && n2 >= 50 && n3 >= 50) {
			return true;
		}
		else {
			return false;
		}	
	}
}
