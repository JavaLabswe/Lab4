import java.util.Scanner;
public class SumAToB {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);	
		System.out.print("Start Number :");
		int n1=in.nextInt();
		System.out.print("End Number:");
		int n2=in.nextInt();
		System.out.print(""+sumSeries(n1,n2));
		
		
		
}
	
	public static int sumSeries(int n1, int n2) {
		int sum=0;
		while(n1<=n2) {
			if(n1%2==0) {
				sum=sum+n1;
			}
			n1=n1+1;
		}
		return sum;
	}

}



