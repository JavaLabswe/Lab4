import java.util.Scanner;
public class Multiplication {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Number [2 to 12] : ");
		int n=in.nextInt();
		while(n<2||n>12) {
			System.out.print("Number [2 to 12] : ");
			n=in.nextInt();
			
		}
		displayMul(n);
		
	}
	public static void displayMul(int n) {
		for(int i=1;i<=12;i++) {
			System.out.println(n+"*"+i+"="+n*i);
		}
	}

}



