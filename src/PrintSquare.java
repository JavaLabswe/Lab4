import java.util.Scanner;
public class PrintSquare {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter size : ");
		int m = in.nextInt();
		System.out.print("Enter character : ");
		char a=in.next().charAt(0);
		System.out.print("Enter character : ");
		char b=in.next().charAt(0);
		printChar(m, a, b);
	}
	public static void printChar(int m,char a,char b) {
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=m;j++) {
				if(i==1 || j==1 || i==m || j==m) {
					System.out.print(a);	
				}
				else {
					System.out.print(b);
				}
			}
			System.out.println();
		}
	}

}
