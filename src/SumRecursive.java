import java.util.Scanner;
public class SumRecursive {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("input");
		int n=in.nextInt();
		System.out.print(""+Sum(n));
	}
	
		public static int Sum(int n) {
			if(n>1) {
				return n+Sum(n-1);
			}else {
				return 1;
			}

		}
	}