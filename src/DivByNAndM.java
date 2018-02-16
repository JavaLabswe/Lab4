import java.util.Scanner;
public class DivByNAndM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Number 10-5000 ");
		System.out.println("Div by 2 and 3 ");
		printnumber (2,3);
		System.out.println("Div by 5 and 7 ");
		printnumber (5,7);
		System.out.println("Div by 11 and 13 ");
		printnumber (11,13);
	}

   
	public static void printnumber(int a , int b) {
		int n;
		int count=0;
	    for(n=10;n<=5000;n++) {
	    	if(n%a==0&&n%b==0) {
				System.out.print(n+" ");
				count++;	
	        }
	    	if(count==10) {
	    		System.out.println();
	    		count=0;
	    	}
		
	}
	    
	  

}
	
		
	}
	
	
