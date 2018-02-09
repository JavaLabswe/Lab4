import java.util.Scanner;
public class CalGPAWithMethod {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of subject : ");
		int s = in.nextInt();
		int x;
		double gpa=0,gp=0,a=0;
		for(int i=1;i<=s;i++) {
			System.out.print("Enter score of subject"+i+": ");
			int c = in.nextInt();
			char n = grading(c);
			if(n=='A') {
				x=4;
			}
			else if(n=='B') {	
				x=3;
			}
			else if(n=='C') {	
				x=2;
			}
			else if(n=='D') {	
				x=1;
			}
			else {
				x=0;
			}
			System.out.print("Enter course unit : ");
			double m=in.nextDouble();
			gp=gp+(x*m);
			a=a+m;
			System.out.println("Grade "+grading(c));
		}
		gpa=gp/a;
		System.out.println("GPA = "+gpa);
	}
	public static char grading(int n) {
		if(n>=80) {
			return 'A';
		}
		else if(n>=70) {	
			return 'B';
		}
		else if(n>=60) {	
			return 'C';
		}
		else if(n>=50) {	
			return 'D';
		}
		else {
			return 'F';
		}
	}

}
