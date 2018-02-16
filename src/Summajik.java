import java.util.Scanner;
public class Summajik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = 0;
		int sum=0;
		while(num!=-1) {
			System.out.print("Enter a positive integer or -1 to exit: ");
			num = in.nextInt();
			boolean a = hasEight(num);
			if(a==true) {
				sum+=num;	
			}
			
			
		}
		System.out.print(""+sum);
		
		

	}
	public static boolean hasEight(int num) {
		if(num%10==8||num/10==8) {
			 
				return true;

			}
		return false;
		
	}

}
