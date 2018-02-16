import java.util.Scanner;
public class C2F {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("cel:");
		double cel=in.nextDouble();
		System.out.print("Far:"+celToFar(cel));
	}
	public static double celToFar(double cel) {
		double a= (1.8 * cel) + 32;
		return a;
		
	}

}


