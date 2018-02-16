import java.util.Scanner;
public class Eneight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Input : ");
		String  n = in.next();
		String  up = n.toUpperCase();
		System.out.println("Output : "+countA(n));

	}
	public static int countA(String n) {
		int count =0;
		for(int i=1;i<n.length();i++) {
			if(n.charAt(i)=='A') {
				count++;
			}
		}
		return count;
	}
	

}
