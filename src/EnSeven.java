import java.util.Scanner;
public class EnSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Input : ");
		int n = in.nextInt();
		int revers = 0;
		while(n!=0) {
			revers = revers*10;
			revers =revers+(n%10);
			n = n/10;
		}
		System.out.print("Output : "+revers);

	}

}
