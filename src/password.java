import java.util.Scanner;  
import java.lang.String;  
import java.lang.Character;  

public class password {  

    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);  
        System.out.print("Please enter a Password: ");  
        String password = input.next();  
        if (isValid(password)) {  
            System.out.println("Valid Password"+": "+ password); 
        } else {  
            System.out.println("Invalid Password");  
        }  
    }  

    public static boolean isValid(String password) {  
        if (password.length() < 10) {    
            char c;  
            int count = 1;   
            for (int i = 0; i < password.length(); i++) {  
                c = password.charAt(i);  
                if (Character.isDigit(c)) {  
                    count++;  
                    if (count > 2)   {     
                        return true;  
                    }     
                }  
            }
        } else {   
        	return false;
              
        }  
        return false;  
    }  
}